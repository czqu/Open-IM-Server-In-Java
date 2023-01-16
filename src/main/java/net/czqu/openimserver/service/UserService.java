package net.czqu.openimserver.service;

import net.czqu.openimserver.constant.UserStatus;
import net.czqu.openimserver.dao.example.UsersExample;
import net.czqu.openimserver.dao.mapper.UsersMapper;
import net.czqu.openimserver.dao.pojo.Users;
import net.czqu.openimserver.dto.user.AccountCheckListDTO;
import net.czqu.openimserver.dto.user.AccountStatusDTO;
import net.czqu.openimserver.dto.user.UserInfoDTO;
import net.czqu.openimserver.error.constant.ErrorCode;
import net.czqu.openimserver.error.exception.UserException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2023-01-08 14:20
 **/
@Service
public class UserService {

    private final UsersMapper usersMapper;
    @Autowired
    public UserService(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    public List<AccountStatusDTO> checkAccountStatus(AccountCheckListDTO accountCheckListDTO) {
        if (Objects.isNull(accountCheckListDTO)) {
            //// TODO: 2023/1/16
            return null;
        }

        if (CollectionUtils.isEmpty(accountCheckListDTO.getCheckUserIDList())) {
            return new ArrayList<>();
        }
        List<String> userIdList=accountCheckListDTO.getCheckUserIDList();
        List<Users> usersList=usersMapper.selectByExampleSelective(UsersExample
                .newAndCreateCriteria()
                .andUserIdIn(userIdList)
                .example(), Users.Column.userId);
        Set<String> usersSet = usersList.stream().map(Users::getUserId).collect(Collectors.toSet());

        List<AccountStatusDTO> res = new ArrayList<>();
        for (String userId: userIdList)
        {
            if (usersSet.contains(userId)) {
                res.add(new AccountStatusDTO(userId,UserStatus.REGISTERED.getValue()));
            } else {
                res.add(new AccountStatusDTO(userId, UserStatus.UNREGISTERED.getValue()));
            }
        }
        return res;
    }

    public UserInfoDTO getUserInfo(String userId) throws UserException {
        if (StringUtils.isEmpty(userId)) {
            //// TODO: 2023/1/8
            throw new UserException("user id can not empty", ErrorCode.USER_ID_INVALID);
        }
        Users user = usersMapper.selectByPrimaryKeySelective(userId,
                Users.Column.userId, Users.Column.birth, Users.Column.email, Users.Column.phoneNumber, Users.Column.name

        );
        usersMapper.selectByExampleSelective(
                UsersExample.newAndCreateCriteria().andNameLike("lin").example()
        );
        return convertToUserInfoDTO(user);

    }

    public UserInfoDTO getSelfUserInfo(String userId)
    {
        if (StringUtils.isEmpty(userId)) {
            //// TODO: 2023/1/8
            return new UserInfoDTO();
        }
        Users user = usersMapper.selectByPrimaryKeySelective(userId,
                Users.Column.userId, Users.Column.birth, Users.Column.email, Users.Column.phoneNumber, Users.Column.name
        );
        return convertToUserInfoDTO(user);
    }

    public Void setUserInfo(String)
    {

    }



    private UserInfoDTO convertToUserInfoDTO(Users user) {
        if (user == null) {
            return null;
        }
        return new UserInfoDTO()
                .setUserId(user.getUserId())
                .setBirth(user.getBirth())
                .setEmail(user.getEmail())
                .setPhone(user.getPhoneNumber())
                .setName(user.getName());
    }


}

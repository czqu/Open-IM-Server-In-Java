package net.czqu.openimserver.service;

import net.czqu.openimserver.constant.Gender;
import net.czqu.openimserver.constant.GlobalRecvMsg;
import net.czqu.openimserver.constant.OnlineStatus;
import net.czqu.openimserver.constant.UserStatus;
import net.czqu.openimserver.dao.example.UsersExample;
import net.czqu.openimserver.dao.mapper.UsersMapper;
import net.czqu.openimserver.dao.pojo.Users;
import net.czqu.openimserver.dto.user.*;
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

    public List<AccountStatusDTO> checkAccountStatus(AccountCheckListDTO accountCheckListDTO) throws UserException {
        if (Objects.isNull(accountCheckListDTO)) {
            //// TODO: 2023/1/16
            throw new UserException("accountList is invalid!", ErrorCode.USER_PARAM_ERR);
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

    public List<String> getAllUsersUid() throws UserException {
        return usersMapper.selectByExampleSelective(UsersExample.newAndCreateCriteria().example()).stream()
                .map(Users::getUserId).collect(Collectors.toList());
    }

    public UserInfoDTO getSelfUserInfo(String userId) throws UserException {
        if (StringUtils.isEmpty(userId)) {
            //// TODO: 2023/1/8
            throw new UserException("user id can not empty", ErrorCode.USER_ID_INVALID);
        }
        Users user = usersMapper.selectByPrimaryKeySelective(userId,
                Users.Column.userId, Users.Column.birth, Users.Column.email, Users.Column.phoneNumber,
                Users.Column.nickname, Users.Column.ex, Users.Column.faceUrl

        );
        usersMapper.selectByExampleSelective(
                UsersExample.newAndCreateCriteria().andNameLike("lin").example()
        );
        return convertToUserInfoDTO(user);

    }

    public List<Users> getUserInfo(UserIdListDTO userIdListDTO) throws UserException {
        if (Objects.isNull(userIdListDTO)) {
            throw new UserException("userIdList is invalid!", ErrorCode.USER_PARAM_ERR);
        }

        if (CollectionUtils.isEmpty(userIdListDTO.getUserIdList())) {
            return new ArrayList<>();
        }

        List<String> userIdList = userIdListDTO.getUserIdList();
        List<Users> usersList=usersMapper.selectByExampleSelective(UsersExample
                .newAndCreateCriteria()
                .andUserIdIn(userIdList)
                .example(), Users.Column.ex, Users.Column.faceUrl, Users.Column.gender, Users.Column.nickname, Users.Column.userId);

        return usersList;
    }

    public List<OnlineStatusDTO> getUsersOnlineStatus(UserIdListDTO userIdListDTO) throws UserException {
        if (Objects.isNull(userIdListDTO)) {
            throw new UserException("userIdList is invalid!", ErrorCode.USER_PARAM_ERR);
        }

        if (CollectionUtils.isEmpty(userIdListDTO.getUserIdList())) {
            return new ArrayList<>();
        }

        List<String> userIdList = userIdListDTO.getUserIdList();
        List<OnlineStatusDTO> res = new ArrayList<>();
        for (String userId: userIdList) {
            //// TODO: 2023/2/8
            res.add(new OnlineStatusDTO(OnlineStatus.ONLINE_STATUS.getValue(), userId));
        }
        return res;
    }

    public int updateUserInfo(UserInfoDTO userInfoDTO) throws UserException {
        if (Objects.isNull(userInfoDTO)) {
            throw new UserException("userInfoDTO is invalid!", ErrorCode.USER_PARAM_ERR);
        }
        if (StringUtils.isAnyEmpty(userInfoDTO.getEx(), userInfoDTO.getEmail(), userInfoDTO.getFaceUrl(),
                userInfoDTO.getNickname(),userInfoDTO.getPhoneNumber(), userInfoDTO.getUserID())) {
            throw new UserException("userInfoDTO member is invalid!", ErrorCode.USER_PARAM_ERR);
        }
        if ( Objects.isNull(userInfoDTO.getBirth())) {
            throw new UserException("BIRTH is invalid!", ErrorCode.USER_PARAM_ERR);
        }
        if (Objects.isNull(userInfoDTO.getGender())) {
            throw new UserException("Gender is invalid!", ErrorCode.USER_PARAM_ERR);
        }

        Users users = new Users();
        users.setBirth(userInfoDTO.getBirth());
        users.setEmail(userInfoDTO.getEmail());
        users.setEx(userInfoDTO.getEx());
        users.setFaceUrl(userInfoDTO.getFaceUrl());
        users.setGender(userInfoDTO.getGender().getId());
        users.setNickname(userInfoDTO.getNickname());
        users.setPhoneNumber(userInfoDTO.getPhoneNumber());
        users.setUserId(userInfoDTO.getUserID());

        return usersMapper.updateByExampleSelective(users, UsersExample.newAndCreateCriteria()
                .andUserIdEqualTo(userInfoDTO.getUserID()).example());
    }


    private UserInfoDTO convertToUserInfoDTO(Users user) {
        if (user == null) {
            return null;
        }
        return new UserInfoDTO()
                .setUserID(user.getUserId())
                .setEx(user.getEx())
                .setFaceUrl(user.getFaceUrl())
                .setEmail(user.getEmail())
                .setBirth(user.getBirth())
                .setCreateTime(user.getCreateTime())
                .setGender((user.getGender()==Gender.MALE.getId()?Gender.MALE:Gender.FEMALE))
                .setPhoneNumber(user.getPhoneNumber())
                .setNickname(user.getNickname())
                .setGlobalRecvMsg((user.getGlobalRecvMsgOpt()== GlobalRecvMsg.RECV_MSG.getId()?
                        GlobalRecvMsg.RECV_MSG:(user.getGlobalRecvMsgOpt()== GlobalRecvMsg.NOT_RECV_MSG.getId()?
                        GlobalRecvMsg.NOT_RECV_MSG:GlobalRecvMsg.RECV_NOT_NOTIFY_MSG)));
    }


}

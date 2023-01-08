package net.czqu.openimserver.service;

import net.czqu.openimserver.dao.example.UsersExample;
import net.czqu.openimserver.dao.mapper.UsersMapper;
import net.czqu.openimserver.dao.pojo.Users;
import net.czqu.openimserver.dto.UserInfoDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

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
    public UserService(UsersMapper usersMapper)
    {
        this.usersMapper=usersMapper;
    }

    public UserInfoDTO getUserInfo(String userId) {
        if (StringUtils.isEmpty(userId)) {
            //// TODO: 2023/1/8
            return new UserInfoDTO();
        }
        Users user = usersMapper.selectByPrimaryKeySelective(userId,
                Users.Column.userId, Users.Column.birth, Users.Column.email, Users.Column.phoneNumber, Users.Column.name
        );
        return convertToUserInfoDTO(user);

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

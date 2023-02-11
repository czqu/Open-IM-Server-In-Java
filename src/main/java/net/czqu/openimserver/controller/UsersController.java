package net.czqu.openimserver.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import net.czqu.openimserver.dao.pojo.Users;
import net.czqu.openimserver.dto.user.*;
import net.czqu.openimserver.service.UserService;
import net.czqu.openimserver.error.exception.UserException;

import net.czqu.openimserver.util.response.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2023-01-08 14:46
 **/
@Api(tags = "用户接口")
@RestController
@RequestMapping("/user")
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping ("/account_check")
    public ResponseResult<List<AccountStatusDTO>> checkAccountStatus(@RequestBody AccountCheckListDTO body)
            throws UserException {
        return ResponseResult.success(userService.checkAccountStatus(body));
    }

    @PostMapping("/get_all_users_uid")
    public ResponseResult<List<String>> getAllUsersUid(@RequestParam(value = "operationId")
                                                           @Parameter()String operationId) throws  UserException {
        return ResponseResult.success(userService.getAllUsersUid());
    }
    @PostMapping("/get_self_users_info")
    public ResponseResult<UserInfoDTO> getSelfUserInfo(
            @RequestParam(value = "id") @Parameter(description= "EEEE")String userId) throws UserException {
        return ResponseResult.success(userService.getSelfUserInfo(userId));
    }
    @Operation(summary = "CCCCCC")

    @PostMapping ("/get_users_info")
    public ResponseResult<List<Users>> getUsersInfo(@RequestBody UserIdListDTO body) throws UserException {
        return ResponseResult.success(userService.getUserInfo(body));
    }

    @PostMapping("/get_users_online_status")
    public ResponseResult<List<OnlineStatusDTO>> getUsersOnlineStatus(@RequestBody UserIdListDTO body)
            throws UserException {
        return ResponseResult.success(userService.getUsersOnlineStatus(body));
    }
    @PostMapping("/update_user_info")
    public ResponseResult<Integer> updateUserInfo(@RequestBody UserInfoDTO body) throws UserException {
        return ResponseResult.success(userService.updateUserInfo(body));
    }

}

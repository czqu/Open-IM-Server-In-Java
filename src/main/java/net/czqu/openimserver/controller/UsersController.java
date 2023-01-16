package net.czqu.openimserver.controller;

import net.czqu.openimserver.dto.user.AccountCheckListDTO;
import net.czqu.openimserver.dto.user.AccountStatusDTO;
import net.czqu.openimserver.dto.user.UserInfoDTO;
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
@RestController
@RequestMapping("/user")
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseResult<UserInfoDTO> getUserInfo(@RequestParam(value = "id") String userId) throws UserException {
        return ResponseResult.success(userService.getUserInfo(userId));
    }

    @PostMapping ("/account_check")
    public ResponseResult<List<AccountStatusDTO>> checkAccountStatus(@RequestBody AccountCheckListDTO body) {
        return ResponseResult.success(userService.checkAccountStatus(body));
    }

}

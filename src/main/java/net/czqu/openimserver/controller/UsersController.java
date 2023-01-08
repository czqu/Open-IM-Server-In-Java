package net.czqu.openimserver.controller;

import net.czqu.openimserver.dto.UserInfoDTO;
import net.czqu.openimserver.service.UserService;
import net.czqu.openimserver.util.response.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public UserInfoDTO getUserInfo(@RequestParam(value = "id") String userId) {
        return userService.getUserInfo(userId);
    }
}

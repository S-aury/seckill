package org.example.seckill.user.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.seckill.common.aspect.ApiOperationLog;
import org.example.seckill.common.utils.Response;
import org.example.seckill.user.model.vo.LoginUserReqVO;
import org.example.seckill.user.model.vo.LoginUserRspVO;
import org.example.seckill.user.model.vo.RegisterUserReqVO;
import org.example.seckill.user.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hao-zhao-yu
 * @Date: 2026/6/8 22:52
 * @Version: v1.0.0
 * @Description: 用户接口
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {


    @Resource
    private UserService userService;


    /**
     * 用户注册
     */
    @PostMapping("/register")
    @ApiOperationLog(description = "用户注册")
    public Response<?> register(@Validated @RequestBody RegisterUserReqVO registerUserReqVO) {
        return userService.register(registerUserReqVO);
    }

    /**
     * 用户登录
     */
    @PostMapping("/login")
    @ApiOperationLog(description = "用户登录")
    public Response<LoginUserRspVO> login(@Validated @RequestBody LoginUserReqVO loginUserReqVO) {
        return userService.login(loginUserReqVO);
    }
}

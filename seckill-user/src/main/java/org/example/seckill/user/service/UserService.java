package org.example.seckill.user.service;

import org.example.seckill.common.utils.Response;
import org.example.seckill.user.model.vo.LoginUserReqVO;
import org.example.seckill.user.model.vo.LoginUserRspVO;
import org.example.seckill.user.model.vo.RegisterUserReqVO;

/**
 * @Author: hao-zhao-yu
 * @Date: 2026/6/8 22:41
 * @Version: v1.0.0
 * @Description: 用户业务
 **/

public interface UserService {


    /**
     * 用户注册
     * @param registerUserReqVO
     * @return
     */
    Response<?> register(RegisterUserReqVO registerUserReqVO);


    /**
     * 用户登录
     * @param loginUserReqVO
     * @return
     */
    Response<LoginUserRspVO> login(LoginUserReqVO loginUserReqVO);
}

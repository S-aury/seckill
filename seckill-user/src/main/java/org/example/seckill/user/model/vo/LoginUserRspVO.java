package org.example.seckill.user.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: hao-zhao-yu
 * @Date: 2026/6/10 17:17
 * @Version: v1.0.0
 * @Description: 用户登录
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginUserRspVO {

    /**
     * Token 令牌
     */
    private String token;

    /**
     * 用户信息
     */
    private UserInfo userInfo;

    /**
     * 用户信息内部类
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class UserInfo {

        /**
         * 用户 ID
         */
        private Long id;

        /**
         * 昵称
         */
        private String nickname;

        /**
         * 头像
         */
        private String avatar;
    }
}

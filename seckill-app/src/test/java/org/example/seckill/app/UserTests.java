package org.example.seckill.app;

import jakarta.annotation.Resource;
import org.example.seckill.common.domain.dataobject.UserDO;
import org.example.seckill.common.domain.mapper.UserDOMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * @Author: hao-zhao-yu
 * @Date: 2026/6/4 20:09
 * @Version: v1.0.0
 * @Description: TODO
 **/
@SpringBootTest
public class UserTests {

    @Resource
    private UserDOMapper userDOMapper;

    @Test
    void testInsertUser() {
        userDOMapper.insert(UserDO.builder()
                .nickname("hdy")
                .password("123456")
                .mobile("13033480557")
                .status(1)
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build());
    }
}

package org.example.seckill.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: hao-zhao-yu
 * @Date: 2026/5/27 22:34
 * @Version: v1.0.0
 * @Description: 秒杀系统启动类
 **/
@SpringBootApplication
@ComponentScan({"org.example.seckill.*"}) // 多模块项目中，必需手动指定扫描 org.example.seckill 包下面的所有类
public class SeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillApplication.class, args);
    }
}

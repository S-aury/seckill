package org.example.seckill.common.aspect;

import java.lang.annotation.*;

/**
 * @Author: hao-zhao-yu
 * @Date: 2026/6/4 21:23
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}
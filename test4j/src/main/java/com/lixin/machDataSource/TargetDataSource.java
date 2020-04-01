package com.lixin.machDataSource;

import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.*;

/**
 * 转换dataSource的注解
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String value();
}

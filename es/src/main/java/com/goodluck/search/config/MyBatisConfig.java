package com.goodluck.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.goodluck.search.mapper","com.goodluck.search.dao"})
public class MyBatisConfig {
}

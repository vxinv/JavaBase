package com.lixin;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.lixin.mapper"})
public class Test4jApplication {
    public static void main(String[] args) {
        SpringApplication.run(Test4jApplication.class, args);
    }
}

package com.lixin.testweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableCaching
public class TestwebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestwebApplication.class, args);
    }

}

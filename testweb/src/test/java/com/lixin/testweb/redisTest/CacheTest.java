package com.lixin.testweb.redisTest;

import com.lixin.testweb.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CacheTest {

    @Autowired
    RedisService redisService;

    @Test
    public void testSimaple() {
        redisService.set("lixix", "xin");
        redisService.set("lixin2", "xin2", 10);
    }
}

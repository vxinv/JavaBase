package com.lixin.testweb.service.impl.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCacheImplTest {

    @Autowired
    TestCacheImpl testCache;

    @Test
    public void testCacheAble() {
        testCache.TestCacheAble("lixin");
    }

    @Test
    public void testCacheEvict() {
        testCache.CacheEvict("lixin");
    }

}

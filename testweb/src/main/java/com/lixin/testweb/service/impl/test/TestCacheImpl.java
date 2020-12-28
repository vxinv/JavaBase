package com.lixin.testweb.service.impl.test;

import com.lixin.testweb.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestCacheImpl {

    @Autowired
    RedisService redisService;

    Logger LOG = LoggerFactory.getLogger(TestCacheImpl.class);

    @Cacheable(value = "lixin", key = "'id_+'+#test")
    public String TestCacheAble(String test) {
        LOG.info("TestCacheAble");
        return "hello test";
    }

    @CacheEvict(value = "lixin", key = "'id_+'+#test")
    public String CacheEvict(String test) {
        LOG.info("CacheEvict");
        return "evict";
    }
}

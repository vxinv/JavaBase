package com.goodluck.etf.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RealTimeInfoServiceTest {

    @Autowired
    RealTimeInfoService realTimeInfoService;

    @Test
    public void realTimeInfo() {
        realTimeInfoService.realTimeInfo("SH512760");
    }
}

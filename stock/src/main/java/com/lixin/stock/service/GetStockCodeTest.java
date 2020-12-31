/*
package com.lixin.stock.github.vxinv.service;

import com.lixin.stock.StockApplication;
import com.lixin.stock.dao.SimStockInfoDao;
import com.lixin.stock.entity.SimStockInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StockApplication.class)
class GetStockNcodeTest {

    @Autowired
    GetStockNcode getStockNcode;

    @Autowired
    SimStockInfoDao simStockInfoDao;

    @Test
    void getSimStockInfo() {
        ArrayList<SimStockInfo> sh = getStockNcode.getSimStockInfo("深圳");
        for (SimStockInfo simStockInfo : sh) {
            simStockInfoDao.insert(simStockInfo);
        }
    }
}*/

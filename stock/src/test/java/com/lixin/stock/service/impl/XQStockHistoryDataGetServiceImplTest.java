package com.lixin.stock.service.impl;

import com.lixin.stock.StockApplication;
import com.lixin.stock.entity.StockInfoResDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StockApplication.class)
public class XQStockHistoryDataGetServiceImplTest {

    @Autowired
    XQStockHistoryDataGetServiceImpl xqStockHistoryDataGetService;


    @Test
    public void getHistoryList() {
        xqStockHistoryDataGetService.getStockInfoFromTHS("ss");
    }

    @Test
    public void getStockInfo() {
        StockInfoResDTO s2701 = xqStockHistoryDataGetService.getStockInfo("S2701");
        System.out.println(s2701);
    }
}
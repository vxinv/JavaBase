package com.lixin.stock.service;

import com.lixin.stock.StockApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// https://xueqiu.com/service/v5/stock/screener/quote/list?page=1&size=90&order=desc&order_by=percent&exchange=CN&market=CN&ind_code=S2701&_=1599030262648
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StockApplication.class)
public class PckUpIndustryServiceTest {

    @Autowired
    PickUpIndustryService service;

    @Test
    public void pickUp() {
        service.pickUp();
    }


}
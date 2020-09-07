package com.lixin.stock.service;

import com.lixin.stock.StockApplication;
import com.lixin.stock.service.impl.InitDataServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// https://xueqiu.com/service/v5/stock/screener/quote/list?page=1&size=90&order=desc&order_by=percent&exchange=CN&market=CN&ind_code=S2701&_=1599030262648
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StockApplication.class)
public class PickUpIndustryServiceTest {

    @Autowired
    PickUpIndustryService service;

    @Autowired
    InitDataServiceImpl initDataService;

    //获取所有的股票数据
    @Test
    public void pickUp() {
        service.pickUp2();
    }

    // 获取行业

    @Test
    public void testFilter() {
        initDataService.filterCode2();
    }


    @Test
    public void testRepeat() {
        initDataService.filterDuplicateCode();
    }


}
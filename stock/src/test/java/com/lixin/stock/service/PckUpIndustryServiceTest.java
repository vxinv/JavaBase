package com.lixin.stock.service;

import com.lixin.stock.StockApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
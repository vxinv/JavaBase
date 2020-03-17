package com.lixin.stockGain.ShortTimeAnalysis;

import com.lixin.StockApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StockApplication.class)
class TXstockRealTimeTest {

    @Autowired
    TXstockRealTime tXstockRealTime;

    @Test
    public void moniterStock() {
        tXstockRealTime.MoniterStock();
    }
}
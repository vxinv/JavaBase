package com.lixin.stock.strategy;


import com.lixin.stock.mapper.StockNcodeMapper;
import com.lixin.stock.mapper.StockNdataMapper;
import com.lixin.stock.model.StockNdata;
import com.lixin.stock.model.StockNdataExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Judge {

    @Autowired
    StockNcodeMapper sc;
    @Autowired
    StockNdataMapper sd;

    Random random = new Random();
    float balance = 1000000;

    public void game() {
        LocalDate currDay = LocalDate.of(2014, random.nextInt(12) + 1, random.nextInt(28));
        StockNdataExample sde = new StockNdataExample();
        StockNdataExample.Criteria criteria = sde.createCriteria();
        criteria.andTimestampEqualTo(currDay);
        List<StockNdata> stockNdata = sd.selectByExample(sde);
    }




}

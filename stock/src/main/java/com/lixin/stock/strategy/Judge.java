package com.lixin.stock.strategy;


import com.lixin.stock.entity.Stock;
import com.lixin.stock.mapper.StockNcodeMapper;
import com.lixin.stock.mapper.StockNdataMapper;
import com.lixin.stock.model.StockNcode;
import com.lixin.stock.model.StockNdata;
import com.lixin.stock.model.StockNdataExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Judge {

    @Autowired
    StockNcodeMapper sc;
    @Autowired
    StockNdataMapper sd;
    LocalDate initDay;

    Random random = new Random();
    float balance = 1000000;

    List<Stock> stocks = new LinkedList<>();

    public void game() {
        initDay = LocalDate.of(2014, random.nextInt(12) + 1, random.nextInt(28));
        initData();
    }


    // initialization  stock each_value_of
    private void initData() {
        List<StockNcode> stockNcodes = sc.selectByExample(null);
        // initializeStock
        for (StockNcode stockNcode : stockNcodes) {
            Stock stock = new Stock(stockNcode);
            stock.init(initDay,sd);
            stocks.add(stock);
        }
    }
    //


}

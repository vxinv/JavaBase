package com.lixin.stock.strategy;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 交易
 */
public class Trader implements Trade {

    // 交易时间长短
    int time;
    // 追高还是追低
    int followHigh;
    int followLow;
    //  大盘小盘
    int marketSize;


    float balance = 1000000;


    @Override
    public void sell(String code, LocalDate time, int number, BigDecimal price) {

    }

    @Override
    public void buy(String code, LocalDate time, int number, BigDecimal price) {

    }

    @Override
    public void find() {
        // 开始挑选随机的时间进场

        //

    }
}

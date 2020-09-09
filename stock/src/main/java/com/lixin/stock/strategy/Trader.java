package com.lixin.stock.strategy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

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
    // 行业排名
    int rank;
    // 周期最低 单位(周)
    int lowWeek;
    // 周期最高
    int highWeek;
    int stopLoss;

    Random random = new Random();

    float balance = 1000000;


    @Override
    public void sell(String code, LocalDate time, int number, BigDecimal price) {

    }

    @Override
    public void buy(String code, LocalDate time, int number, BigDecimal price) {

    }

    @Override
    public void find() {
        // 选取2014 3月  计算每支s的M30  M60  M120
        LocalDate currDay = LocalDate.of(2014, random.nextInt(12) + 1, random.nextInt(28));


    }

    private int getStockInDataMaxId() {
        return 0;
    }
}

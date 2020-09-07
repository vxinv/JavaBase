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
        //  获取随机选定的区间
        int stockInDataMaxId = getStockInDataMaxId() + 1;
        int i = random.nextInt(stockInDataMaxId);
        // 另一种遍历全部stock


    }

    private int getStockInDataMaxId() {
        return 0;
    }
}

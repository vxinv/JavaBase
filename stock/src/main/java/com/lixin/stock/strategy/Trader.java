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
    // 到达指定亏损 等待天数
    int stopLoss;
    Random random = new Random();
    // 余额
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


    /**
     * 计算交易佣金
     *
     * @return
     */
    public static float computerTradingCommissions(String code, BigDecimal price, int num, BSenum bSenum) {
        //  佣金
        float commission = 0.00025F;
        // 印花税 Stamp duty
        float stampDuty = 0.001F;
        // 过户费 Transfer fee
        float transferFee = 1;
        float tf = 0F;
        float sd;
        float principal;
        float cm;
        // 上海缴纳过户费
        if (code.startsWith("SH")) {
            if (num * 100 % 1000 != 0) {
                tf = Math.floorDiv(num * 100, 1000) + 1;
            } else {
                tf = num * 100 / 1000;
            }
        }

        if (bSenum == BSenum.BUY) {
            // 佣金
            float pc = price.floatValue() * num * 100 * commission;
            return pc > 5 ? pc + tf : 5 + tf;
        } else {
            principal = price.floatValue() * num * 100;
            // 印花税
            sd = principal * stampDuty;
            // 手续费
            cm = principal * commission > 5 ? principal * commission : 5;
            return cm + tf + sd;
        }


    }


}

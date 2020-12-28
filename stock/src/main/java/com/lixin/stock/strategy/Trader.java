package com.lixin.stock.strategy;

import com.lixin.stock.entity.PositionStock;
import com.lixin.stock.strategy.strategyLibrary.ChooseStock;
import com.lixin.stock.utils.TimeUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 交易
 */
public class Trader implements Trade {

    // length_of_transaction
    public int time;
    // chase_high_or_chase_low
    public int followHigh;
    public int followLow;
    //  Large cap small cap
    public int marketSize;
    // Industry Ranking
    public int rank;
    // Minimum period unit (week)
    public int lowWeek;
    // Highest cycle
    public int highWeek;
    // Waiting days for the specified loss
    public int stopLoss;
    Random random = new Random();
    // Balance
    public float balance = 1000000;
    // 记录改交易者的持仓
    public Set<PositionStock> positionStocks = new HashSet<>();
    public ChooseStock strategy;
    // 交易者的初始化 需要对策略参数进行填充
    public Trader(ChooseStock stra) {
        this.strategy = stra;
    }

    @Override
    public void sell(String code, LocalDate time, int number, BigDecimal price) {
        float sxfee = computerTradingCommissions(code, price, number, BOS.SELL);
        float profit = price.floatValue() * number * 100;
        this.balance += profit - sxfee;
        System.out.println(time.format(TimeUtils.dateTimeFormatter) + "卖出" + number + "手" + "共获取" + (profit - sxfee) + "元");
        PositionStock positionStock = getPositionStock(code);
        // Change the status of a position
        positionStock.sellStock(number, price, time);
    }

    @Override
    public void buy(String code, LocalDate time, int number, BigDecimal price) {
        float sxfee = computerTradingCommissions(code, price, number, BOS.BUY);
        float cost = price.floatValue() * number * 100;
        this.balance -= sxfee + cost;
        System.out.println(time.format(TimeUtils.dateTimeFormatter) + "买入" + number + "手" + "共花费" + (sxfee + cost) + "元");
        PositionStock positionStock = getPositionStock(code);
        // Change the status of a position
        positionStock.buyStock(number, price, time);
    }

    /**
     * 计算交易佣金
     *
     * @return
     */
    public static float computerTradingCommissions(String code, BigDecimal price, int num, BOS BOS) {
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

        if (BOS == com.lixin.stock.strategy.BOS.BUY) {
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

    @Override
    public void find(Stock stock, LocalDate current) {
        ChooseResult result = strategy.choose(stock, this);
        if (result.choose) {
            float currPrice = priceOfTheDay(stock);
            int num = (int) Math.floor(result.percentageBuy * balance / priceOfTheDay(stock) * 100);
            if (num >= 1) {
                buy(stock.snc.stockCode, current, num, BigDecimal.valueOf(currPrice));
            } else {
                System.out.println(current.toString() + "买入" + stock.snc.companyName + "余额不足");
            }
        }
        ChooseResult throwOut = strategy.throwOut(stock, this);
        if (throwOut.choose) {
            float currPrice = priceOfTheDay(stock);
            PositionStock positionStock = throwOut.positionStock;
            int num = (int) Math.floor(positionStock.numberOfHoldings * throwOut.percentageSell);
            if (num > 1) {
                sell(stock.snc.stockCode, current, num, BigDecimal.valueOf(currPrice));
            }

        }
    }

    /**
     * 获取当天的价格 偏重于收盘价
     */
    public float priceOfTheDay(Stock stock) {
        return (stock.temData.getOpen().floatValue() * 1 + stock.temData.getClose().floatValue() * 2) / 3;
    }


    /**
     * Get the position of the stock
     */
    public PositionStock getPositionStock(String stock) {
        for (PositionStock positionStock : positionStocks) {
            if (positionStock.code.equals(stock)) {
                return positionStock;
            }
        }
        return null;
    }


}

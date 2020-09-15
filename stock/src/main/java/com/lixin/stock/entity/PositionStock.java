package com.lixin.stock.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 持仓的股票
 */
public class PositionStock {
    //股票代码
    public String code;
    // 最新买入时间
    public LocalDate buyTime;
    // 最新卖出时间
    public LocalDate sellTime;
    // 持有数量(手)
    public int numberOfHoldings;
    // 平均持有成本(元)
    public float averageCost;
    // 持有时间(天)
    public int holdingTime;

    public void buyStock(int thisTimeBuyNum, BigDecimal thisTimeBuyPrice, LocalDate thisBuyTime) {
        averageCost = (thisTimeBuyNum * 100 * thisTimeBuyPrice.floatValue() + numberOfHoldings * 100 * averageCost) / (thisTimeBuyNum + holdingTime) * 100;
        numberOfHoldings += thisTimeBuyNum;
        buyTime = thisBuyTime;
    }

    public boolean sellStock(int thisSellNum, BigDecimal thisTimeSellPrice, LocalDate localDate) {
        if (thisSellNum > numberOfHoldings) {
            return false;
        }
        if (thisSellNum == numberOfHoldings) {
            averageCost = (averageCost * numberOfHoldings * 100 - thisSellNum * thisTimeSellPrice.floatValue() * 100);
            return true;
        }
        averageCost = (averageCost * numberOfHoldings * 100 - thisSellNum * thisTimeSellPrice.floatValue() * 100) / (numberOfHoldings - thisSellNum) * 100;
        this.sellTime = localDate;
        return true;
    }


}

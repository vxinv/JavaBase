package com.lixin.stock.strategy.strategyLibrary;

import com.lixin.stock.entity.Stock;
import com.lixin.stock.model.StockNdata;
import com.lixin.stock.strategy.ChooseResult;
import com.lixin.stock.strategy.Trader;

import java.util.List;

public class ChaseLow implements chooseStock {

    /**
     * desc:
     * 01 When the stock price has fallen in the past N days
     * 02 The variance of the current moving average is shrinking
     * 03 The current transaction volume is increasing
     * 04 Current stock price rise
     * 05 The current stock price has fallen by E%
     *
     * @param stock
     * @return
     */
    // Number of drops N
    public int declineDaysN;

    // Decrease percentage E
    public int declineRatioE;

    // Number of Increase in Volume C
    public int nivC;

    // Total inspection days Z
    public int tidZ;

    // 每次的建仓比例
    public float percentageOfOpenPositionsEachTime;

    @Override
    public ChooseResult choose(Stock stock, Trader trader) {
        ChooseResult chooseResult = new ChooseResult();
        // notIncludingToday
        List<StockNdata> stockNdatas = stock.historyData.subList(stock.currTimeIndex - tidZ - 1, stock.currTimeIndex);
        float lastDayPrice = 0F;
        long lastVolumn = 0;
        int C = 0;
        int N = 0;
        for (StockNdata curr : stockNdatas) {
            if (lastDayPrice == 0F || lastVolumn == 0F) {
                lastDayPrice = curr.getClose().floatValue();
                lastVolumn = curr.getVolume();
            }
            if (curr.getClose().floatValue() < lastDayPrice) {
                N++;
            }
            if (curr.getVolume() > lastVolumn) {
                C++;
            }
        }
        if (C < nivC || N < declineDaysN) {
            chooseResult.choose = false;
        }
        // It has fallen to E% of W days
        if (stock.MA30 - stock.MA5 / stock.MA30 < declineRatioE) {
            chooseResult.choose = false;
        }
        chooseResult.stock = stock;
        chooseResult.percentageBuy = percentageOfOpenPositionsEachTime;
        return chooseResult;
    }
}

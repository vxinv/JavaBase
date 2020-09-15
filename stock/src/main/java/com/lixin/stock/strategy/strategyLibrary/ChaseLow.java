package com.lixin.stock.strategy.strategyLibrary;

import com.lixin.stock.entity.PositionStock;
import com.lixin.stock.entity.Stock;
import com.lixin.stock.model.StockNdata;
import com.lixin.stock.strategy.BOS;
import com.lixin.stock.strategy.ChooseResult;
import com.lixin.stock.strategy.Trader;

import java.util.List;
import java.util.Set;

public class ChaseLow implements ChooseStock {

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
    // 当前股价连续下降多少天开始建仓
    public int declineDaysN;

    // Decrease percentage E
    // 当股价下降达到多少比例开始建仓
    public int declineRatioE;

    // Number of Increase in Volume C
    // Z天中C天 交易量的上涨
    public int nivC;

    // Total inspection days Z
    // 本次共检测多少天
    public int tidZ;

    // Percentage of open positions each time
    // 每次买入占总金额的比例
    public float percentageBuy;

    // Closing ratio
    // 每次卖出 占总持仓的比例
    public float percentageSell;

    // How much profit starts to close the position
    // 当盈利多少开始平仓
    public float percentProfitClose;

    @Override
    public ChooseResult choose(Stock stock, Trader trader) {
        ChooseResult chooseResult = new ChooseResult();
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
        if (stock.MA30 - stock.MA5 / stock.MA30 < declineRatioE) {
            chooseResult.choose = false;
        }
        chooseResult.stock = stock;
        chooseResult.BOS = BOS.BUY;
        chooseResult.percentageBuy = percentageBuy;
        return chooseResult;
    }


    @Override
    public ChooseResult throwOut(Stock stock, Trader trader) {
        ChooseResult chooseResult = new ChooseResult();
        chooseResult.choose = false;
        PositionStock positionStock = getPositionStock(trader.positionStocks, stock);
        if (positionStock == null) {
            chooseResult.choose = false;
            return chooseResult;
        }
        // 当天的平均价格 偏重于 收盘价 has profit
        if ((stock.temData.getOpen().floatValue() + stock.temData.getClose().floatValue() * 3) / 4 > positionStock.averageCost * (1 + percentProfitClose)) {
            chooseResult.BOS = BOS.SELL;
            chooseResult.percentageSell = percentageSell;
            chooseResult.choose = true;
            return chooseResult;
        }
        return chooseResult;
    }


    /**
     * There are B times in the A test that meet the conditions
     *
     * @return
     */
    public boolean ABTest() {
        return false;
    }


    /**
     * Get the position of the stock
     */
    public PositionStock getPositionStock(Set<PositionStock> stocks, Stock stock) {
        for (PositionStock positionStock : stocks) {
            if (positionStock.code.equals(stock.getSnc().stockCode)) {
                return positionStock;
            }
        }
        return null;
    }

}


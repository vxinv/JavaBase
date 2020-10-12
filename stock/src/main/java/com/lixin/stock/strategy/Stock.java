package com.lixin.stock.strategy;

import com.lixin.stock.mapper.StockNdataMapper;
import com.lixin.stock.model.StockNcode;
import com.lixin.stock.model.StockNdata;
import com.lixin.stock.model.StockNdataExample;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 股票抽象类
 */
@Data
@NoArgsConstructor
public class Stock implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    // moving_average
    public float MA5;
    public float MA10;
    public float MA20;
    public float MA30;
    public float MA60;
    public float MA120;

    public StockNcode snc;

    // Quote of stock data of the day
    public StockNdata temData;

    public transient StockNdataMapper mapper;

    // historical_data
    public LinkedList<StockNdata> historyData = new LinkedList<>();

    // current_running_date_and_historical_data_index
    public int currTimeIndex;

    // same_industry_stock_collection
    public Set<Stock> sameIndustryStocks;

    // circulation_market_value
    public float currFlowMarket;

    // history_of_mean_variance
    public LinkedList<Float> variances;

    public LocalDate startTime;

    public boolean init = false;

    public Stock(StockNcode snc, LocalDate localDate, StockNdataMapper snm) {
        this.snc = snc;
        this.mapper = snm;
        this.startTime = localDate;

        StockNdataExample stockNdataExample = new StockNdataExample();
        StockNdataExample.Criteria criteria = stockNdataExample.createCriteria();
        criteria.andCodeEqualTo(snc.stockCode);
        stockNdataExample.setOrderByClause("timestamp asc");
        List<StockNdata> ls = snm.selectByExample(stockNdataExample);
        historyData.addAll(ls);
        //System.out.println("获取"+snc.getCompanyName()+historyData.size()+"条数据");
        int currentTimeIndex = findCurrentTimeIndex();
        //System.out.println("currentTimeIndex :"+currentTimeIndex);
        if (currTimeIndex < 120) {
            return;
        }
        temData = historyData.get(currentTimeIndex);
        init = true;
        pastMovingAverageLine(currTimeIndex);
        computerFlowMarket();
    }

    /**
     * find_the_current_time_index
     */
    public int findCurrentTimeIndex() {
        for (int i = 0; i < historyData.size(); i++) {
            StockNdata stockNdata = historyData.get(i);
            if (stockNdata.getTimestamp().equals(startTime)) {
                this.currTimeIndex = i;
                return i;
            }
        }
        return -1;
    }

    /**
     * find_the_past_moving_average_based_on_the_index
     */
    public void pastMovingAverageLine(int currTimeIndex) {
        int cs = 0;
        float sum = 0;
        List<StockNdata> stockNdata = historyData.subList(currTimeIndex + 1 - 120, currTimeIndex + 1);
        for (int i = stockNdata.size() - 1; i >= 0; i--) {
            cs++;
            sum += stockNdata.get(i).getClose().floatValue();
            if (cs == 5) {
                MA5 = sum / 5;
            }
            if (cs == 10) {
                MA10 = sum / 10;
            }
            if (cs == 20) {
                MA20 = sum / 20;
            }
            if (cs == 30) {
                MA30 = sum / 30;
            }
            if (cs == 60) {
                MA60 = sum / 60;
            }
            if (cs == 120) {
                MA120 = sum / 120;
            }
        }
    }

    public void computerFlowMarket() {
        currFlowMarket = temData.getVolume() / temData.getTurnoverrate() * temData.getClose().floatValue();
    }

    public void newDayInfo() {
        currTimeIndex += 1;
        temData = historyData.get(currTimeIndex);
        pastMovingAverageLine(currTimeIndex);
    }

}

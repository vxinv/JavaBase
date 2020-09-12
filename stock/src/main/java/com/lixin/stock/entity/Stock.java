package com.lixin.stock.entity;

import cn.hutool.core.lang.Holder;
import com.lixin.stock.mapper.StockNdataMapper;
import com.lixin.stock.model.StockNcode;
import com.lixin.stock.model.StockNdata;
import com.lixin.stock.model.StockNdataExample;
import com.lixin.stock.utils.DataStatisticsUtils;

import java.math.BigDecimal;
import java.security.PublicKey;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * stockAbstract
 */
public class Stock extends StockNcode {

    // movingAverage
    public float MA5;
    public float MA10;
    public float MA20;
    public float MA30;
    public float MA60;
    public float MA120;


    public StockNcode original ;

    // historicalData
    public List<StockNdata> historyData;

    // currentRunningDateAndHistoricalDataIndex
    public int currTimeIndex;

    // sameIndustryStockCollection
    public Set<Stock> sameIndustryStocks;

    // circulationMarketValue
    public double currFlowMarket;

    // historyOfMeanVariance
    public List<Double> variances;

    public Stock(StockNcode stockNcode) {
        this.original = stockNcode;

    }


    /**
     * initializationOfStockData
     * currentStartTime
     * mapper_to_get_data
     */
    public void init(LocalDate localDate, StockNdataMapper snm){

        StockNdataExample stockNdataExample = new StockNdataExample();
        StockNdataExample.Criteria criteria = stockNdataExample.createCriteria();
        criteria.andCodeEqualTo(this.original.getStockCode());
        this.stockCode = original.stockCode;

        historyData = snm.selectByExample(stockNdataExample);
        findCurrentTimeIndex(localDate);

        initinalizeMovingAverage();
        StockNdata snd = historyData.get(currTimeIndex);
        currFlowMarket = snd.getVolume()/snd.getTurnoverrate()*snd.getClose().doubleValue();
        initialzationVariance();
    }

    public  void findCurrentTimeIndex(LocalDate localDate){
        for (int i = 0; i < historyData.size(); i++) {
            StockNdata sn = historyData.get(i);
            if (sn.getTimestamp().equals(localDate)) {
                this.currTimeIndex = i;
                break;
            }
        }
    }

    /**
     * initialize_moving_average
     */
    public void  initinalizeMovingAverage() {

        List<StockNdata> stockNdatas = historyData.subList(currTimeIndex + 1 - 120, currTimeIndex + 1);
        int rsize = 0;
        float sumClosePrice = 0;
        for (int i = stockNdatas.size() - 1; i >= 0; i--) {
            StockNdata sn = stockNdatas.get(i);
            rsize++;
            sumClosePrice += sn.getClose().floatValue();
            if (rsize == 5) {
                MA5 = sumClosePrice / 5;
            }
            if (rsize == 10) {
                MA10 = sumClosePrice / 10;
            }
            if (rsize == 20) {
                MA20 = sumClosePrice / 20;
            }
            if (rsize == 30) {
                MA30 = sumClosePrice / 30;
            }
            if (rsize == 60) {
                MA60 = sumClosePrice / 60;
            }
            if (rsize == 120) {
                MA120 = sumClosePrice / 120;
            }

            if (rsize > 120) {
                break;
            }
        }
    }
    /**
     * initialization_variance
     */
    public void initialzationVariance(){
        double[] doubles = new double[4];
        doubles[0] = MA5;
        doubles[1] = MA10;
        doubles[2] = MA30;
        doubles[3] = MA60;
        double mean = DataStatisticsUtils.getMean(doubles);
        variances.add(mean);
    }

    public void newDay(){
        currTimeIndex++;
        initinalizeMovingAverage();
        initialzationVariance();
    }


}
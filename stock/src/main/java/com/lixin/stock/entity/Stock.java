package com.lixin.stock.entity;

import com.lixin.stock.model.StockNdata;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * 股票抽象类
 */
public class Stock {

    // 移动平均线
    public float MA5;
    public float MA10;
    public float MA20;
    public float MA30;
    public float MA60;
    public float MA120;

    // 历史数据
    public List<StockNdata> historyData;
    // 当前运行日期 历史数据索引
    public int currTimeIndex;
    // 同行业股票集合
    public Set<Stock> sameIndustryStocks;
    // 流通市值
    public BigDecimal currFlowMarket;
    // 均线方差历史
    public List<Float> variances;


}

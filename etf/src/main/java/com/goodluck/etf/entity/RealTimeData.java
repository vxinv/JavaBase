package com.goodluck.etf.entity;

import lombok.Data;

@Data
public class RealTimeData {
    private String symbol;
    // 当前价格
    private double current;
    private double percent;
    // 涨跌额
    private double chg;
    private int timestamp;
    // 成交量
    private int volume;
    // 成交额
    private int amount;
    // 市值
    private int market_capital;
    private double amplitude;
    // 当天开盘价
    private double open;
    // 昨日收盘价
    private double last_close;
    // 今日最高
    private double high;
    // 今日最低
    private double low;

    private double avg_price;
    // 成交量
    private int trade_volume;
    private int side;
    private boolean is_trade;
    private int level;
    private double current_year_percent;
    private String trade_unique_id;
    private int type;
}

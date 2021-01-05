package com.goodluck.etf.entity;

import lombok.Data;

@Data
public class RealTimeData {
    private String symbol;
    private double current;
    private double percent;
    private double chg;
    private int timestamp;
    private int volume;
    private int amount;
    private int market_capital;
    private double amplitude;
    private double open;
    private double last_close;
    private double high;
    private double low;
    private double avg_price;
    private int trade_volume;
    private int side;
    private boolean is_trade;
    private int level;
    private double current_year_percent;
    private String trade_unique_id;
    private int type;
}

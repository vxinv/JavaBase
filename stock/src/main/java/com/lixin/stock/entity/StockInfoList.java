package com.lixin.stock.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StockInfoList {

    private String symbol; //代码

    private double net_profit_cagr; //净利润

    private double ps; //P是股价，S是每股的销售收入

    private long type;//

    private double percent;

    private boolean has_follow;

    private double tick_size;

    private double pb_ttm;

    private long float_shares;

    private double current;

    private double amplitude;

    private double pcf;

    private double current_year_percent;

    private long float_market_capital;// 流通资本

    private long market_capital;//市场资本

    private double dividend_yield;

    private long lot_size;

    private double roe_ttm;

    private double total_percent;// 总股本

    private double percent5m;

    private double income_cagr; // 收入

    private long amount;

    private double chg;

    private long issue_date_ts;

    private long main_net_inflows;

    private long volume;

    private double volume_ratio;

    private double pb;

    private long followers;

    private double turnover_rate;

    private long first_percent;

    private String name; //名字

    private double pe_ttm;

    private long total_shares;// 总股本
}

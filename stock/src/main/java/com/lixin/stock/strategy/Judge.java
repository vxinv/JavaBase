package com.lixin.stock.strategy;


import com.lixin.stock.entity.Stock;
import com.lixin.stock.mapper.StockNcodeMapper;
import com.lixin.stock.mapper.StockNdataMapper;
import com.lixin.stock.model.StockNcode;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.*;

public class Judge {

    @Autowired
    StockNcodeMapper sc;
    @Autowired
    StockNdataMapper sd;
    LocalDate initDay;

    Random random = new Random();
    float balance = 1000000;

    List<Stock> stocks = new LinkedList<>();
    // 行业数据
    public HashMap<String, ArrayList<Stock>> industryMap = new HashMap<>(12);

    public void game() {
        initDay = LocalDate.of(2014, random.nextInt(12) + 1, random.nextInt(28));
        initData();
        initTrader();

    }


    // initialization  stock each_value_of
    private void initData() {
        List<StockNcode> stockNcodes = sc.selectByExample(null);
        // initializeStock
        for (StockNcode stockNcode : stockNcodes) {
            Stock stock = new Stock(stockNcode, initDay, sd);
            // 初始化同行业的集合 加入行业对比
            initIndustryColl(stock);
        }
    }

    // 初始化交易者
    // Initialize the trader
    public void initTrader() {

    }

    // 每过一天 让交易者运用自己的策略进行交易
    // Let traders use their own strategies to trade every day
    public void carryOutATransaction() {

    }

    // 每隔一定周期 按资金进行排名

    // 初始化行业数据
    // key : 一级
    // key : 一级+二级
    // key : 一级+二级+三级
    // value : List<Stock>

    /**
     * 初始化行业集合 按照 申万行业分类标准
     * Initialize industry collection
     */
    public void initIndustryColl(Stock stock) {
        String[] strings = {stock.snc.oneCategory,
                stock.snc.oneCategory + "+" + stock.snc.twoCategory,
                stock.snc.oneCategory + "+" + stock.snc.twoCategory + "+" + stock.snc.threeCategory};
        for (String string : strings) {
            if (!industryMap.containsKey(string)) {
                industryMap.put(string, new ArrayList<>());
            }
            industryMap.get(string).add(stock);
        }
    }


}

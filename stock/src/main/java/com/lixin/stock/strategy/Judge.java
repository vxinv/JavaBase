package com.lixin.stock.strategy;


import cn.hutool.core.exceptions.ExceptionUtil;
import com.lixin.stock.mapper.StockNcodeMapper;
import com.lixin.stock.mapper.StockNdataMapper;
import com.lixin.stock.model.StockDataHistory;
import com.lixin.stock.model.StockNcode;
import com.lixin.stock.model.StockNdata;
import com.lixin.stock.model.StockNdataExample;
import com.lixin.stock.strategy.strategyLibrary.ChaseLow;
import com.lixin.stock.utils.FSTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

@Component
public class Judge {

    // 行业数据
    public HashMap<String, ArrayList<Stock>> industryMap = new HashMap<>(12);
    @Autowired
    StockNcodeMapper sc;
    @Autowired
    StockNdataMapper sd;
    LocalDate initDay;
    LocalDate systemNow;
    Random random = new Random();
    float balance = 1000000;
    List<Stock> stocks = new LinkedList<>();
    List<Trade> trades = new LinkedList<>();

    public void game() {
        initDay = LocalDate.of(2015, 2, 16);
        initData();
        return;
        /*initTrader();
        startTransaction();*/
    }

    // initialization  stock each_value_of
    private void initData() {
        systemNow = initDay;
        List<StockNcode> stockNcodes = sc.selectByExample(null);
        // initializeStock
        for (int i = stockNcodes.size() - 1; i >= 0; i--) {
            StockNcode snc = stockNcodes.get(i);
            System.out.println("开始初始化" + snc.getCompanyName());
            /*Stock stock = new Stock(snc, initDay, sd);
            if (!stock.init){
                System.out.println("初始化"+snc.getCompanyName()+"失败");
                stockNcodes.remove(snc);
                continue;
            }*/
            System.out.println("初始化" + snc.getCompanyName() + "完毕");
            // Initialize the collection of the same industry and join the industry comparison
            //initIndustryColl(stock);
        }
        // 初始化完毕 将stocks序列化位byte文件

    }

    // 初始化交易者
    // Initialize the trader
    public void initTrader() {
        Trade trade = new Trader(new ChaseLow());
        trades.add(trade);
    }

    // 每过一天 让交易者运用自己的策略进行交易
    // Let traders use their own strategies to trade every day
    public void startTransaction() {
        while (!systemNow.equals(LocalDate.now())) {
            systemNow = systemNow.plusDays(1);
            for (Stock stock : stocks) {
                for (Trade trade : trades) {
                    stock.newDayInfo();
                    trade.find(stock, systemNow);
                }
            }

        }
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
        String[] strings = {stock.snc.getOneCategory(),
                stock.snc.getOneCategory() + "+" + stock.snc.getTwoCategoryId(),
                stock.snc.getOneCategory() + "+" + stock.snc.getTwoCategoryId() + "+" + stock.snc.getThreeCategoryId()};
        for (String string : strings) {
            if (!industryMap.containsKey(string)) {
                industryMap.put(string, new ArrayList<>());
            }
            industryMap.get(string).add(stock);
        }
    }

    public void initDiskData() {
        List<StockNcode> stockNcodes = sc.selectByExample(null);
        for (StockNcode snc : stockNcodes) {
            StockNdataExample stockNdataExample = new StockNdataExample();
            StockNdataExample.Criteria criteria = stockNdataExample.createCriteria();
            criteria.andCodeEqualTo(snc.getStockCode());
            stockNdataExample.setOrderByClause("timestamp asc");
            List<StockNdata> ls = sd.selectByExample(stockNdataExample);

            StockDataHistory stockDataHistory = new StockDataHistory();
            stockDataHistory.setCode(snc.getStockCode());
            stockDataHistory.getList().addAll(ls);

            try {
                FSTUtils.write(snc.getStockCode(), stockDataHistory, StockDataHistory.class, StockNdata.class);
            } catch (IOException e) {
                System.out.println("存储磁盘数据失败");
                System.out.println(ExceptionUtil.getRootCauseMessage(e));
            }
            System.out.println("存储磁盘" + snc.getCompanyName() + "成功");
        }

    }


}

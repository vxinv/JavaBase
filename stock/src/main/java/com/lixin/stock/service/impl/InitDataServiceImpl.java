package com.lixin.stock.service.impl;


import com.lixin.stock.mapper.StockCodeMapper;
import com.lixin.stock.mapper.StockNcodeMapper;
import com.lixin.stock.model.StockCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;

@Service
public class InitDataServiceImpl {

    @Autowired
    StockCodeMapper stockCodeMapper;

    @Autowired
    StockNcodeMapper stockNcodeMapper;

    String[] qualifiedCodes = new String[]{"600", "601", "603", "000", "002"};

    /**
     * 过滤不合格的代码
     */
    public void filterCode() {
        List<StockCode> stockCodes = stockCodeMapper.selectByExample(null);
        for (StockCode stockCode : stockCodes) {
            String substring = stockCode.getStockCode().substring(2, 5);
            /*for (String qualifiedCode : qualifiedCodes) {
                if (substring.equals(qualifiedCode)){
                    stockNcodeMapper.insert(stockCode);
                }
            }*/
            if (substring.equals("002")) {
                stockNcodeMapper.insert(stockCode);
            }
        }
    }

    /**
     * 过滤不合格的代码
     */
    public void filterCode2() {
        List<StockCode> stockCodes = stockNcodeMapper.selectByExample(null);
        for (StockCode stockCode : stockCodes) {
            String substring = stockCode.getCompanyName();
            if (substring.startsWith("S")) {
                stockNcodeMapper.deleteByPrimaryKey(stockCode.getId());
            }
        }
    }

    /**
     * 过滤重复的
     */
    public void filterDuplicateCode() {
        List<StockCode> stockCodes = stockCodeMapper.selectByExample(null);
        LinkedHashSet<String> codeSets = new LinkedHashSet<>();
        stockCodes.forEach(stockCode -> {
            if (!codeSets.contains(stockCode.getStockCode())) {
                codeSets.add(stockCode.getStockCode());
            } else {
                stockCodeMapper.deleteByPrimaryKey(stockCode.getId());
                System.out.println("删除重复" + stockCode.getCompanyName());
            }
        });
    }

}

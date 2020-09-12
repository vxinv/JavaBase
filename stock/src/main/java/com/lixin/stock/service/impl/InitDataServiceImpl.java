package com.lixin.stock.service.impl;


import com.lixin.stock.mapper.StockNcodeMapper;
import com.lixin.stock.model.StockNcode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;

@Service
public class InitDataServiceImpl {

    @Autowired
    StockNcodeMapper StockNcodeMapper;

    @Autowired
    StockNcodeMapper stockNcodeMapper;

    String[] qualifiedCodes = new String[]{"600", "601", "603", "000", "002"};

    /**
     * 过滤不合格的代码
     */
    public void filterCode() {
        List<StockNcode> StockNcodes = StockNcodeMapper.selectByExample(null);
        for (StockNcode StockNcode : StockNcodes) {
            String substring = StockNcode.getStockCode().substring(2, 5);
            /*for (String qualifiedCode : qualifiedCodes) {
                if (substring.equals(qualifiedCode)){
                    stockNcodeMapper.insert(StockNcode);
                }
            }*/
            if (substring.equals("002")) {
                stockNcodeMapper.insert(StockNcode);
            }
        }
    }

    /**
     * 过滤不合格的代码
     */
    public void filterCode2() {
        List<StockNcode> StockNcodes = stockNcodeMapper.selectByExample(null);
        for (StockNcode StockNcode : StockNcodes) {
            String substring = StockNcode.getCompanyName();
            if (substring.startsWith("S")) {
                stockNcodeMapper.deleteByPrimaryKey(StockNcode.getId());
            }
        }
    }

    /**
     * 过滤重复的
     */
    public void filterDuplicateCode() {
        List<StockNcode> StockNcodes = StockNcodeMapper.selectByExample(null);
        LinkedHashSet<String> codeSets = new LinkedHashSet<>();
        StockNcodes.forEach(StockNcode -> {
            if (!codeSets.contains(StockNcode.getStockCode())) {
                codeSets.add(StockNcode.getStockCode());
            } else {
                StockNcodeMapper.deleteByPrimaryKey(StockNcode.getId());
                System.out.println("删除重复" + StockNcode.getCompanyName());
            }
        });
    }

}

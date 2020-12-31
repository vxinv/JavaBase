package com.lixin.stock.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lixin.stock.StockApplication;
import com.lixin.stock.entity.StockInfoResDTO;
import com.lixin.stock.mapper.StockNcodeMapper;
import com.lixin.stock.mapper.StockNdataMapper;
import com.lixin.stock.model.StockNdata;
import com.lixin.stock.model.StockNdataExample;
import com.lixin.stock.utils.JsonUtil;
import com.lixin.stock.utils.TimeUtils;
import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StockApplication.class)
public class XQStockHistoryDataGetServiceImplTest {
    @Autowired
    XQStockHistoryDataGetServiceImpl xqStockHistoryDataGetService;
    @Autowired
    StockNcodeMapper stockNcodeMapper;
    @Autowired
    StockNdataMapper stockNdataMapper;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void getHistoryList() {
        xqStockHistoryDataGetService.getStockInfoFromTHS("ss");
    }

    @Test
    public void getStockInfo() {
        StockInfoResDTO s2701 = xqStockHistoryDataGetService.getStockInfo("S2701");
        System.out.println(s2701);
    }

    /**
     * 测试周一上涨的概率
     */
    @Test
    public void theProbabilityOfARiseOnMonday(){
        // 从2016年开始统计
        LocalDate f2016 = LocalDate.of(2016, 01, 01);
        LocalDate now = LocalDate.now();
        while (f2016.isBefore(now)) {
            f2016 = f2016.plusDays(1);
            if (f2016.getDayOfWeek() != DayOfWeek.MONDAY ){
                continue;
            }
            StockNdataExample stockNdataExample = new StockNdataExample();
            stockNdataExample.createCriteria()
                    .andTimestampEqualTo(f2016);

            List<StockNdata> stockNdata = stockNdataMapper.selectByExample(stockNdataExample);
            // 统计当前
            int[] down_flat_up = {0,0,0};
            for (StockNdata stockNdatum : stockNdata) {
                int i = stockNdatum.getClose().compareTo(stockNdatum.getOpen());
                if ( i > 0){
                    down_flat_up[2]++;
                }
                if (i < 0){
                    down_flat_up[0] ++;
                }
                down_flat_up[1]++;
            }
            System.out.println(f2016.format(TimeUtils.dateTimeFormatter)+"下跌"+down_flat_up[0]+"上涨"+down_flat_up[2]);
        }
    }

    /**
     * 测试添加索引后的数据访问速度
     */
    @Test
    public void testDataAcessV() throws JsonProcessingException {
        StockNdataExample stockNdataExample = new StockNdataExample();
        stockNdataExample.createCriteria()
                .andCodeEqualTo("SH603757");
        stockNdataExample.setOrderByClause("timestamp asc");
        List<StockNdata> stockNdata = stockNdataMapper.selectByExample(stockNdataExample);
        for (StockNdata stockNdatum : stockNdata) {
            System.out.println(objectMapper.writeValueAsString(stockNdatum));
        }
    }


}
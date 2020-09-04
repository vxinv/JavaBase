package com.lixin.stock.service.impl;

import com.lixin.stock.StockApplication;
import com.lixin.stock.mapper.StockCodeMapper;
import com.lixin.stock.mapper.StockDataMapper;
import com.lixin.stock.model.StockCode;
import com.lixin.stock.model.StockData;
import com.lixin.stock.service.GetStockCode;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StockApplication.class)
public class StockGetServiceImplTest {

    @Autowired
    GetStockCode getStockCode;
    @Autowired
    StockCodeMapper codeMapper;
    @Autowired
    XQStockHistoryDataGetServiceImpl stockGetService;
    @Autowired
    StockDataMapper stockDataMapper;


    volatile Boolean isEmpty =  false;

    @Test
    public void getHistoryList() {
        LocalDate date = LocalDate.of(2020, 9, 2);
        LocalDate now = LocalDate.now();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(12, 18, 1000, TimeUnit.MINUTES, new LinkedBlockingDeque<>(10000));
        List<StockCode> stockCodes = codeMapper.selectByExample(null);
        LinkedBlockingQueue<StockCode> queue = new LinkedBlockingQueue<>(10000);
        stockCodes.forEach(queue::offer);
        System.out.println(queue.size());
        while (!isEmpty) {
            StockCode poll = queue.poll();
            if (poll == null) {
                isEmpty = true;
                break;
            }
            executor.submit(() -> {
                List<StockData> historyList = stockGetService.getHistoryList(poll.getStockCode());
                /*ArrayList<StockData> stockDataArrayList = new ArrayList<>();
                int size = 0;*/
                /*for (StockData stockData : historyList) {
                    if (stockData.getTime().equals(now)) {
                        continue;
                    }
                    stockDataArrayList.add(stockData);
                    size++;
                }*/
                stockDataMapper.batchInsert(historyList);
                System.out.println(poll.getCompanyName() + "录入完毕  共录入" + historyList.size() + "条");
            });
        }
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("exit");
    }

    @Test
    public void initData() {
        ArrayList<StockCode> sh = getStockCode.getSimStockInfo("深圳");
        for (StockCode stockCode : sh) {
            codeMapper.insertSelective(stockCode);
        }
    }

}
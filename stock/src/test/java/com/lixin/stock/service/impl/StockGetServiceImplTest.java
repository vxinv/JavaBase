package com.lixin.stock.service.impl;

import com.lixin.stock.StockApplication;
import com.lixin.stock.mapper.StockNcodeMapper;
import com.lixin.stock.mapper.StockNdataMapper;
import com.lixin.stock.model.StockCode;
import com.lixin.stock.model.StockNdata;
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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StockApplication.class)
public class StockGetServiceImplTest {

    @Autowired
    GetStockCode getStockCode;
    @Autowired
    StockNcodeMapper codeMapper;
    @Autowired
    XQStockHistoryDataGetServiceImpl stockGetService;
    @Autowired
    StockNdataMapper stockNdataMapper;
    volatile Boolean isEmpty = false;
    Lock lock = new ReentrantLock();

    @Test
    public void getHistoryList() {

        LocalDate now = LocalDate.now();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(6, 12, 1000, TimeUnit.MINUTES, new LinkedBlockingDeque<>(10000));
        List<StockCode> stockCodes = codeMapper.selectByExample(null);
        LinkedBlockingQueue<StockCode> queue = new LinkedBlockingQueue<>(10000);
        stockCodes.forEach(queue::offer);
        System.out.println(queue.size());

        AtomicInteger item = new AtomicInteger();
        while (!isEmpty) {
            StockCode poll = queue.poll();
            if (poll == null) {
                isEmpty = true;
                break;
            }
            executor.execute(() -> {
                List<StockNdata> historyList = stockGetService.getHistoryList(poll.getStockCode());
//                ArrayList<StockNdata> stockDataArrayList = new ArrayList<>();
//                int size = 0;
//                for (StockNdata stockNdata : historyList) {
//                    if (stockNdata.getTimestamp().equals(now)) {
//                        continue;
//                    }
//                    stockDataArrayList.add(stockNdata);
//                    size++;
//                }
                stockNdataMapper.batchInsert(historyList);
                System.out.println(poll.getCompanyName() + "录入完毕  共录入" + historyList.size() + "条");
                lock.lock();
                item.getAndIncrement();
                System.out.println("已录入" + item.get() + "条数据");
                lock.unlock();
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
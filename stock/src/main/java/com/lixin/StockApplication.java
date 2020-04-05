package com.lixin;

import com.lixin.stockGain.ShortTimeAnalysis.TXstockRealTime;
import com.lixin.utils.Poster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockApplication {

    public static void main(String[] args)  {
        SpringApplication.run(StockApplication.class, args);
        try {
            new TXstockRealTime().MoniterStock();
        } catch (InterruptedException e) {
            Poster.send("股票监控", "异常退出");
            e.printStackTrace();
        }
    }


}

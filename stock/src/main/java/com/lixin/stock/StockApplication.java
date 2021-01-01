package com.lixin.stock;

import com.lixin.stock.strategy.Judge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StockApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(StockApplication.class, args);
       // ctx.getBean(Judge.class).initDiskData();
    }
}

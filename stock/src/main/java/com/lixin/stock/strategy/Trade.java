package com.lixin.stock.strategy;


import java.math.BigDecimal;
import java.time.LocalDate;

public interface Trade {

    void sell(String code, LocalDate time, int number, BigDecimal price);

    void buy(String code, LocalDate time, int number, BigDecimal price);

    void find(Stock stock, LocalDate localDate);

}

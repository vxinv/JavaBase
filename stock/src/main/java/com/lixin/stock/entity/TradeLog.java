package com.lixin.stock.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录
 */
@Data
@NoArgsConstructor
public class TradeLog {
    LocalDate buyTime;
    LocalDate sellTime;
    String StockNcode;
    float gain;
    float balance;
    BigDecimal buyPrice;
    BigDecimal sellPrice;
}

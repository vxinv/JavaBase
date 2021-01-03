package com.lixin.stock.entity;

import lombok.Data;

@Data
public class SortStockInfo {

    String code;
    double variance;
    double volume;
    double a20;
    double a5;
    double seaTurtleLine;
}

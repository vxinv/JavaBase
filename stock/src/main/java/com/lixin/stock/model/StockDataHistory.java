package com.lixin.stock.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * 股票历史数据
 */
@Data
@NoArgsConstructor
public class StockDataHistory implements Serializable {
    public static final long serialVersionUID = 2L;
    String code;
    LinkedList<StockNdata> list = new LinkedList<>();
}

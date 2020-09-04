package com.lixin.stock.service;

import com.lixin.stock.entity.StockInfoResDTO;
import com.lixin.stock.model.StockData;

import java.util.List;

public interface StockHistoryDataGetService {

     List<StockData> getHistoryList(String code);

     StockInfoResDTO getStockInfo(String ind_code);

}

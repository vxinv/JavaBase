package com.lixin.stock.service;

import com.lixin.stock.entity.StockInfoResDTO;
import com.lixin.stock.model.StockNdata;

import java.util.List;

public interface StockHistoryDataGetService {

     List<StockNdata> getHistoryList(String code);

     StockInfoResDTO getStockInfo(String ind_code);

}

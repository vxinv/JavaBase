package com.lixin.stock.service;
import com.lixin.stock.model.StockData;
import java.util.List;

public interface StockHistoryDataGetService {

     List<StockData> getHistoryList(String code);

}

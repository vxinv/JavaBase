package com.lixin.stock.strategy.strategyLibrary;

import com.lixin.stock.strategy.ChooseResult;
import com.lixin.stock.strategy.Stock;
import com.lixin.stock.strategy.Trade;
import com.lixin.stock.strategy.Trader;

public interface ChooseStock {


   ChooseResult choose(Stock stock, Trade trade);

   ChooseResult throwOut(Stock stock, Trader trader);
}

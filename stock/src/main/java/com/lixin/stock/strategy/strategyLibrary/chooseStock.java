package com.lixin.stock.strategy.strategyLibrary;

import com.lixin.stock.entity.Stock;
import com.lixin.stock.strategy.ChooseResult;
import com.lixin.stock.strategy.Trader;

public interface chooseStock {


   ChooseResult choose(Stock stock, Trader trader);

}

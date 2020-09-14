package com.lixin.stock.strategy;

import com.lixin.stock.entity.Stock;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * selectedResult
 */
@Data
@NoArgsConstructor
public class ChooseResult {
    public Stock stock;
    public float percentageBuy;
    public boolean choose = true;
}

package com.lixin.stock.strategy;

import com.lixin.stock.entity.PositionStock;
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
    public float percentageSell;
    public boolean choose = true;
    public BOS BOS;
    public PositionStock positionStock;
}

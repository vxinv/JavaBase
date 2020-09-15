package com.lixin.stock.strategy;

public enum BOS {
    SELL("sell"), BUY("buy");

    String action;

    BOS(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}

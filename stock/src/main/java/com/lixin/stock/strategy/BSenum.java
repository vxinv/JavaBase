package com.lixin.stock.strategy;

public enum BSenum {
    SELL("sell"), BUY("buy");

    String action;

    BSenum(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}

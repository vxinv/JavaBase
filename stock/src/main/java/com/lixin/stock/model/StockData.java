package com.lixin.stock.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class StockData implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "代码")
    private String code;

    @ApiModelProperty(value = "日期")
    private LocalDate time;

    @ApiModelProperty(value = "开盘价")
    private BigDecimal openPrice;

    @ApiModelProperty(value = "收盘价")
    private BigDecimal closePrice;

    @ApiModelProperty(value = "价格浮动")
    private BigDecimal rangePrice;

    @ApiModelProperty(value = "价格浮动率")
    private Float rangeRate;

    @ApiModelProperty(value = "最低价格")
    private BigDecimal lowestPrice;

    @ApiModelProperty(value = "最高价格")
    private BigDecimal highestPrice;

    @ApiModelProperty(value = "交易量(手)")
    private Long tradeVolume;

    @ApiModelProperty(value = "交易金额")
    private Float tradeMoney;

    @ApiModelProperty(value = "周转率")
    private BigDecimal turnoverRate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public BigDecimal getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }

    public BigDecimal getRangePrice() {
        return rangePrice;
    }

    public void setRangePrice(BigDecimal rangePrice) {
        this.rangePrice = rangePrice;
    }

    public Float getRangeRate() {
        return rangeRate;
    }

    public void setRangeRate(Float rangeRate) {
        this.rangeRate = rangeRate;
    }

    public BigDecimal getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(BigDecimal lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public BigDecimal getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(BigDecimal highestPrice) {
        this.highestPrice = highestPrice;
    }

    public Long getTradeVolume() {
        return tradeVolume;
    }

    public void setTradeVolume(Long tradeVolume) {
        this.tradeVolume = tradeVolume;
    }

    public Float getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(Float tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public BigDecimal getTurnoverRate() {
        return turnoverRate;
    }

    public void setTurnoverRate(BigDecimal turnoverRate) {
        this.turnoverRate = turnoverRate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", time=").append(time);
        sb.append(", openPrice=").append(openPrice);
        sb.append(", closePrice=").append(closePrice);
        sb.append(", rangePrice=").append(rangePrice);
        sb.append(", rangeRate=").append(rangeRate);
        sb.append(", lowestPrice=").append(lowestPrice);
        sb.append(", highestPrice=").append(highestPrice);
        sb.append(", tradeVolume=").append(tradeVolume);
        sb.append(", tradeMoney=").append(tradeMoney);
        sb.append(", turnoverRate=").append(turnoverRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
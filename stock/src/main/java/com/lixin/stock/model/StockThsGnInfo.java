package com.lixin.stock.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class StockThsGnInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    @ApiModelProperty(value = "概念名")
    private String gnName;
    @ApiModelProperty(value = "概念的code")
    private String gnCode;
    @ApiModelProperty(value = "股票code")
    private String stockCode;
    @ApiModelProperty(value = "股票名")
    private String stockName;
    @ApiModelProperty(value = "现价")
    private BigDecimal stockPrice;
    @ApiModelProperty(value = "涨跌幅（单位百分比：%）")
    private BigDecimal stockChange;
    @ApiModelProperty(value = "涨跌价格")
    private BigDecimal stockChangePrice;
    @ApiModelProperty(value = "涨跌速（单位百分比：%）")
    private BigDecimal stockChangeSpeed;
    @ApiModelProperty(value = "换手率（单位百分比：%）")
    private BigDecimal stockHandoverScale;
    @ApiModelProperty(value = "量比")
    private BigDecimal stockLiangBi;
    @ApiModelProperty(value = "振幅（单位百分比：%）")
    private BigDecimal stockAmplitude;
    @ApiModelProperty(value = "成交额(单位：万)")
    private BigDecimal stockDealAmount;
    @ApiModelProperty(value = "流通股票量（单位:万）")
    private BigDecimal stockFlowStockNumber;
    @ApiModelProperty(value = "流通市值（单位：万）")
    private BigDecimal stockFlowMakertValue;
    @ApiModelProperty(value = "市盈率")
    private BigDecimal stockMarketTtm;
    @ApiModelProperty(value = "发起抓取时间")
    private String crawlerTime;
    @ApiModelProperty(value = "当前抓取的版本")
    private String crawlerVersion;
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;
    @ApiModelProperty(value = "扩展数据")
    private String someExt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGnName() {
        return gnName;
    }

    public void setGnName(String gnName) {
        this.gnName = gnName;
    }

    public String getGnCode() {
        return gnCode;
    }

    public void setGnCode(String gnCode) {
        this.gnCode = gnCode;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public BigDecimal getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(BigDecimal stockPrice) {
        this.stockPrice = stockPrice;
    }

    public BigDecimal getStockChange() {
        return stockChange;
    }

    public void setStockChange(BigDecimal stockChange) {
        this.stockChange = stockChange;
    }

    public BigDecimal getStockChangePrice() {
        return stockChangePrice;
    }

    public void setStockChangePrice(BigDecimal stockChangePrice) {
        this.stockChangePrice = stockChangePrice;
    }

    public BigDecimal getStockChangeSpeed() {
        return stockChangeSpeed;
    }

    public void setStockChangeSpeed(BigDecimal stockChangeSpeed) {
        this.stockChangeSpeed = stockChangeSpeed;
    }

    public BigDecimal getStockHandoverScale() {
        return stockHandoverScale;
    }

    public void setStockHandoverScale(BigDecimal stockHandoverScale) {
        this.stockHandoverScale = stockHandoverScale;
    }

    public BigDecimal getStockLiangBi() {
        return stockLiangBi;
    }

    public void setStockLiangBi(BigDecimal stockLiangBi) {
        this.stockLiangBi = stockLiangBi;
    }

    public BigDecimal getStockAmplitude() {
        return stockAmplitude;
    }

    public void setStockAmplitude(BigDecimal stockAmplitude) {
        this.stockAmplitude = stockAmplitude;
    }

    public BigDecimal getStockDealAmount() {
        return stockDealAmount;
    }

    public void setStockDealAmount(BigDecimal stockDealAmount) {
        this.stockDealAmount = stockDealAmount;
    }

    public BigDecimal getStockFlowStockNumber() {
        return stockFlowStockNumber;
    }

    public void setStockFlowStockNumber(BigDecimal stockFlowStockNumber) {
        this.stockFlowStockNumber = stockFlowStockNumber;
    }

    public BigDecimal getStockFlowMakertValue() {
        return stockFlowMakertValue;
    }

    public void setStockFlowMakertValue(BigDecimal stockFlowMakertValue) {
        this.stockFlowMakertValue = stockFlowMakertValue;
    }

    public BigDecimal getStockMarketTtm() {
        return stockMarketTtm;
    }

    public void setStockMarketTtm(BigDecimal stockMarketTtm) {
        this.stockMarketTtm = stockMarketTtm;
    }

    public String getCrawlerTime() {
        return crawlerTime;
    }

    public void setCrawlerTime(String crawlerTime) {
        this.crawlerTime = crawlerTime;
    }

    public String getCrawlerVersion() {
        return crawlerVersion;
    }

    public void setCrawlerVersion(String crawlerVersion) {
        this.crawlerVersion = crawlerVersion;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getSomeExt() {
        return someExt;
    }

    public void setSomeExt(String someExt) {
        this.someExt = someExt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gnName=").append(gnName);
        sb.append(", gnCode=").append(gnCode);
        sb.append(", stockCode=").append(stockCode);
        sb.append(", stockName=").append(stockName);
        sb.append(", stockPrice=").append(stockPrice);
        sb.append(", stockChange=").append(stockChange);
        sb.append(", stockChangePrice=").append(stockChangePrice);
        sb.append(", stockChangeSpeed=").append(stockChangeSpeed);
        sb.append(", stockHandoverScale=").append(stockHandoverScale);
        sb.append(", stockLiangBi=").append(stockLiangBi);
        sb.append(", stockAmplitude=").append(stockAmplitude);
        sb.append(", stockDealAmount=").append(stockDealAmount);
        sb.append(", stockFlowStockNumber=").append(stockFlowStockNumber);
        sb.append(", stockFlowMakertValue=").append(stockFlowMakertValue);
        sb.append(", stockMarketTtm=").append(stockMarketTtm);
        sb.append(", crawlerTime=").append(crawlerTime);
        sb.append(", crawlerVersion=").append(crawlerVersion);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", someExt=").append(someExt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}

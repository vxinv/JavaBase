package com.lixin.stock.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class StockDfcfFundFlowInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "主键")
    private Long id;
    @ApiModelProperty(value = "股市名")
    private String stockMarket;
    @ApiModelProperty(value = "排行榜名")
    private String stockRank;
    @ApiModelProperty(value = "股票代码")
    private String stockCode;
    @ApiModelProperty(value = "股票名字")
    private String stockName;
    @ApiModelProperty(value = "股票最新价格")
    private BigDecimal priceNew;
    @ApiModelProperty(value = "涨跌幅")
    private BigDecimal stockChange;
    @ApiModelProperty(value = "主力净额,净流入,主力流入：超大单加大单买入成交额之和")
    private BigDecimal mainNetInflowAmount;
    @ApiModelProperty(value = "主力净流入--净占比")
    private BigDecimal mainNetProportion;
    @ApiModelProperty(value = "超大单净额,净流入,超大单：大于等于50万股或者100万元的成交单")
    private BigDecimal superBigPartNetInflowAmount;
    @ApiModelProperty(value = "超大单净流入--净占比")
    private BigDecimal superBigPartNetProportion;
    @ApiModelProperty(value = "大单净额,净流入,大单：大于等于10万股或者20万元且小于50万股和100万元的成交单")
    private BigDecimal bigPartNetInflowAmount;
    @ApiModelProperty(value = "大单净流入--净占比")
    private BigDecimal bigPartNetProportion;
    @ApiModelProperty(value = "中单净额,净流入,中单：大于等于2万股或者4万元且小于10万股和20万元的成交单")
    private BigDecimal middlePartNetInflowAmount;
    @ApiModelProperty(value = "中单净流入--净占比")
    private BigDecimal middlePartNetProportion;
    @ApiModelProperty(value = "小单净额,净流入,小单：小于2万股和4万元的成交单")
    private BigDecimal litterPartNetInflowAmount;
    @ApiModelProperty(value = "小单净流入--净占比")
    private BigDecimal litterPartNetProportion;
    @ApiModelProperty(value = "第几页")
    private Integer stockPage;
    @ApiModelProperty(value = "统计数据时间")
    private LocalDateTime countTime;
    @ApiModelProperty(value = "批次号")
    private String timeVersion;
    @ApiModelProperty(value = "抓取版本，规则：股市#排行榜#股市闭市时间")
    private String crawlerVersion;
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;
    @ApiModelProperty(value = "扩展数据")
    private String someinfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStockMarket() {
        return stockMarket;
    }

    public void setStockMarket(String stockMarket) {
        this.stockMarket = stockMarket;
    }

    public String getStockRank() {
        return stockRank;
    }

    public void setStockRank(String stockRank) {
        this.stockRank = stockRank;
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

    public BigDecimal getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    public BigDecimal getStockChange() {
        return stockChange;
    }

    public void setStockChange(BigDecimal stockChange) {
        this.stockChange = stockChange;
    }

    public BigDecimal getMainNetInflowAmount() {
        return mainNetInflowAmount;
    }

    public void setMainNetInflowAmount(BigDecimal mainNetInflowAmount) {
        this.mainNetInflowAmount = mainNetInflowAmount;
    }

    public BigDecimal getMainNetProportion() {
        return mainNetProportion;
    }

    public void setMainNetProportion(BigDecimal mainNetProportion) {
        this.mainNetProportion = mainNetProportion;
    }

    public BigDecimal getSuperBigPartNetInflowAmount() {
        return superBigPartNetInflowAmount;
    }

    public void setSuperBigPartNetInflowAmount(BigDecimal superBigPartNetInflowAmount) {
        this.superBigPartNetInflowAmount = superBigPartNetInflowAmount;
    }

    public BigDecimal getSuperBigPartNetProportion() {
        return superBigPartNetProportion;
    }

    public void setSuperBigPartNetProportion(BigDecimal superBigPartNetProportion) {
        this.superBigPartNetProportion = superBigPartNetProportion;
    }

    public BigDecimal getBigPartNetInflowAmount() {
        return bigPartNetInflowAmount;
    }

    public void setBigPartNetInflowAmount(BigDecimal bigPartNetInflowAmount) {
        this.bigPartNetInflowAmount = bigPartNetInflowAmount;
    }

    public BigDecimal getBigPartNetProportion() {
        return bigPartNetProportion;
    }

    public void setBigPartNetProportion(BigDecimal bigPartNetProportion) {
        this.bigPartNetProportion = bigPartNetProportion;
    }

    public BigDecimal getMiddlePartNetInflowAmount() {
        return middlePartNetInflowAmount;
    }

    public void setMiddlePartNetInflowAmount(BigDecimal middlePartNetInflowAmount) {
        this.middlePartNetInflowAmount = middlePartNetInflowAmount;
    }

    public BigDecimal getMiddlePartNetProportion() {
        return middlePartNetProportion;
    }

    public void setMiddlePartNetProportion(BigDecimal middlePartNetProportion) {
        this.middlePartNetProportion = middlePartNetProportion;
    }

    public BigDecimal getLitterPartNetInflowAmount() {
        return litterPartNetInflowAmount;
    }

    public void setLitterPartNetInflowAmount(BigDecimal litterPartNetInflowAmount) {
        this.litterPartNetInflowAmount = litterPartNetInflowAmount;
    }

    public BigDecimal getLitterPartNetProportion() {
        return litterPartNetProportion;
    }

    public void setLitterPartNetProportion(BigDecimal litterPartNetProportion) {
        this.litterPartNetProportion = litterPartNetProportion;
    }

    public Integer getStockPage() {
        return stockPage;
    }

    public void setStockPage(Integer stockPage) {
        this.stockPage = stockPage;
    }

    public LocalDateTime getCountTime() {
        return countTime;
    }

    public void setCountTime(LocalDateTime countTime) {
        this.countTime = countTime;
    }

    public String getTimeVersion() {
        return timeVersion;
    }

    public void setTimeVersion(String timeVersion) {
        this.timeVersion = timeVersion;
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

    public String getSomeinfo() {
        return someinfo;
    }

    public void setSomeinfo(String someinfo) {
        this.someinfo = someinfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stockMarket=").append(stockMarket);
        sb.append(", stockRank=").append(stockRank);
        sb.append(", stockCode=").append(stockCode);
        sb.append(", stockName=").append(stockName);
        sb.append(", priceNew=").append(priceNew);
        sb.append(", stockChange=").append(stockChange);
        sb.append(", mainNetInflowAmount=").append(mainNetInflowAmount);
        sb.append(", mainNetProportion=").append(mainNetProportion);
        sb.append(", superBigPartNetInflowAmount=").append(superBigPartNetInflowAmount);
        sb.append(", superBigPartNetProportion=").append(superBigPartNetProportion);
        sb.append(", bigPartNetInflowAmount=").append(bigPartNetInflowAmount);
        sb.append(", bigPartNetProportion=").append(bigPartNetProportion);
        sb.append(", middlePartNetInflowAmount=").append(middlePartNetInflowAmount);
        sb.append(", middlePartNetProportion=").append(middlePartNetProportion);
        sb.append(", litterPartNetInflowAmount=").append(litterPartNetInflowAmount);
        sb.append(", litterPartNetProportion=").append(litterPartNetProportion);
        sb.append(", stockPage=").append(stockPage);
        sb.append(", countTime=").append(countTime);
        sb.append(", timeVersion=").append(timeVersion);
        sb.append(", crawlerVersion=").append(crawlerVersion);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", someinfo=").append(someinfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}

package com.lixin.stock.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class StockNcode implements Serializable {
    public Integer id;

    public String companyName;

    public String stockCode;

    public Long totalShares;

    public Long totalAssets;

    public Float grossProfitMargin;

    public Float roe;

    public Float earningsPerShare;

    public Float netAssetPerShare;

    public Float cashFlowPerShare;

    public Long floatMarketCapital;

    public Long floatShares;

    public Long totalOperatingIncome;

    public Double netProfitCagr;

    public Integer oneCategoryId;

    public String oneCategory;

    public Integer twoCategoryId;

    public String twoCategory;

    public Integer threeCategoryId;

    public String threeCategory;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Long getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(Long totalShares) {
        this.totalShares = totalShares;
    }

    public Long getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(Long totalAssets) {
        this.totalAssets = totalAssets;
    }

    public Float getGrossProfitMargin() {
        return grossProfitMargin;
    }

    public void setGrossProfitMargin(Float grossProfitMargin) {
        this.grossProfitMargin = grossProfitMargin;
    }

    public Float getRoe() {
        return roe;
    }

    public void setRoe(Float roe) {
        this.roe = roe;
    }

    public Float getEarningsPerShare() {
        return earningsPerShare;
    }

    public void setEarningsPerShare(Float earningsPerShare) {
        this.earningsPerShare = earningsPerShare;
    }

    public Float getNetAssetPerShare() {
        return netAssetPerShare;
    }

    public void setNetAssetPerShare(Float netAssetPerShare) {
        this.netAssetPerShare = netAssetPerShare;
    }

    public Float getCashFlowPerShare() {
        return cashFlowPerShare;
    }

    public void setCashFlowPerShare(Float cashFlowPerShare) {
        this.cashFlowPerShare = cashFlowPerShare;
    }

    public Long getFloatMarketCapital() {
        return floatMarketCapital;
    }

    public void setFloatMarketCapital(Long floatMarketCapital) {
        this.floatMarketCapital = floatMarketCapital;
    }

    public Long getFloatShares() {
        return floatShares;
    }

    public void setFloatShares(Long floatShares) {
        this.floatShares = floatShares;
    }

    public Long getTotalOperatingIncome() {
        return totalOperatingIncome;
    }

    public void setTotalOperatingIncome(Long totalOperatingIncome) {
        this.totalOperatingIncome = totalOperatingIncome;
    }

    public Double getNetProfitCagr() {
        return netProfitCagr;
    }

    public void setNetProfitCagr(Double netProfitCagr) {
        this.netProfitCagr = netProfitCagr;
    }

    public Integer getOneCategoryId() {
        return oneCategoryId;
    }

    public void setOneCategoryId(Integer oneCategoryId) {
        this.oneCategoryId = oneCategoryId;
    }

    public String getOneCategory() {
        return oneCategory;
    }

    public void setOneCategory(String oneCategory) {
        this.oneCategory = oneCategory;
    }

    public Integer getTwoCategoryId() {
        return twoCategoryId;
    }

    public void setTwoCategoryId(Integer twoCategoryId) {
        this.twoCategoryId = twoCategoryId;
    }

    public String getTwoCategory() {
        return twoCategory;
    }

    public void setTwoCategory(String twoCategory) {
        this.twoCategory = twoCategory;
    }

    public Integer getThreeCategoryId() {
        return threeCategoryId;
    }

    public void setThreeCategoryId(Integer threeCategoryId) {
        this.threeCategoryId = threeCategoryId;
    }

    public String getThreeCategory() {
        return threeCategory;
    }

    public void setThreeCategory(String threeCategory) {
        this.threeCategory = threeCategory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyName=").append(companyName);
        sb.append(", stockCode=").append(stockCode);
        sb.append(", totalShares=").append(totalShares);
        sb.append(", totalAssets=").append(totalAssets);
        sb.append(", grossProfitMargin=").append(grossProfitMargin);
        sb.append(", roe=").append(roe);
        sb.append(", earningsPerShare=").append(earningsPerShare);
        sb.append(", netAssetPerShare=").append(netAssetPerShare);
        sb.append(", cashFlowPerShare=").append(cashFlowPerShare);
        sb.append(", floatMarketCapital=").append(floatMarketCapital);
        sb.append(", floatShares=").append(floatShares);
        sb.append(", totalOperatingIncome=").append(totalOperatingIncome);
        sb.append(", netProfitCagr=").append(netProfitCagr);
        sb.append(", oneCategoryId=").append(oneCategoryId);
        sb.append(", oneCategory=").append(oneCategory);
        sb.append(", twoCategoryId=").append(twoCategoryId);
        sb.append(", twoCategory=").append(twoCategory);
        sb.append(", threeCategoryId=").append(threeCategoryId);
        sb.append(", threeCategory=").append(threeCategory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
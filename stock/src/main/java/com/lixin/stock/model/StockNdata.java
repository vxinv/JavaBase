package com.lixin.stock.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class StockNdata implements Serializable {
    private Long id;

    private String code;

    private LocalDate timestamp;

    private Long volume;

    private BigDecimal open;

    private BigDecimal high;

    private BigDecimal low;

    private BigDecimal close;

    private Float chg;

    private Float percent;

    private Float turnoverrate;

    private Double amount;

    private Float pe;

    private Float pb;

    private Float ps;

    private Float pcf;

    private Float marketCapital;

    private Double holdVolumeCn;

    private Float holdRatioCn;

    private Long netVolumeCn;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public Float getChg() {
        return chg;
    }

    public void setChg(Float chg) {
        this.chg = chg;
    }

    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    public Float getTurnoverrate() {
        return turnoverrate;
    }

    public void setTurnoverrate(Float turnoverrate) {
        this.turnoverrate = turnoverrate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Float getPe() {
        return pe;
    }

    public void setPe(Float pe) {
        this.pe = pe;
    }

    public Float getPb() {
        return pb;
    }

    public void setPb(Float pb) {
        this.pb = pb;
    }

    public Float getPs() {
        return ps;
    }

    public void setPs(Float ps) {
        this.ps = ps;
    }

    public Float getPcf() {
        return pcf;
    }

    public void setPcf(Float pcf) {
        this.pcf = pcf;
    }

    public Float getMarketCapital() {
        return marketCapital;
    }

    public void setMarketCapital(Float marketCapital) {
        this.marketCapital = marketCapital;
    }

    public Double getHoldVolumeCn() {
        return holdVolumeCn;
    }

    public void setHoldVolumeCn(Double holdVolumeCn) {
        this.holdVolumeCn = holdVolumeCn;
    }

    public Float getHoldRatioCn() {
        return holdRatioCn;
    }

    public void setHoldRatioCn(Float holdRatioCn) {
        this.holdRatioCn = holdRatioCn;
    }

    public Long getNetVolumeCn() {
        return netVolumeCn;
    }

    public void setNetVolumeCn(Long netVolumeCn) {
        this.netVolumeCn = netVolumeCn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", volume=").append(volume);
        sb.append(", open=").append(open);
        sb.append(", high=").append(high);
        sb.append(", low=").append(low);
        sb.append(", close=").append(close);
        sb.append(", chg=").append(chg);
        sb.append(", percent=").append(percent);
        sb.append(", turnoverrate=").append(turnoverrate);
        sb.append(", amount=").append(amount);
        sb.append(", pe=").append(pe);
        sb.append(", pb=").append(pb);
        sb.append(", ps=").append(ps);
        sb.append(", pcf=").append(pcf);
        sb.append(", marketCapital=").append(marketCapital);
        sb.append(", holdVolumeCn=").append(holdVolumeCn);
        sb.append(", holdRatioCn=").append(holdRatioCn);
        sb.append(", netVolumeCn=").append(netVolumeCn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
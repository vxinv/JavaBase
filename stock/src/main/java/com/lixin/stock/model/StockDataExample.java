package com.lixin.stock.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andOpenPriceIsNull() {
            addCriterion("open_price is null");
            return (Criteria) this;
        }

        public Criteria andOpenPriceIsNotNull() {
            addCriterion("open_price is not null");
            return (Criteria) this;
        }

        public Criteria andOpenPriceEqualTo(BigDecimal value) {
            addCriterion("open_price =", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotEqualTo(BigDecimal value) {
            addCriterion("open_price <>", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceGreaterThan(BigDecimal value) {
            addCriterion("open_price >", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("open_price >=", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceLessThan(BigDecimal value) {
            addCriterion("open_price <", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("open_price <=", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceIn(List<BigDecimal> values) {
            addCriterion("open_price in", values, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotIn(List<BigDecimal> values) {
            addCriterion("open_price not in", values, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("open_price between", value1, value2, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("open_price not between", value1, value2, "openPrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceIsNull() {
            addCriterion("close_price is null");
            return (Criteria) this;
        }

        public Criteria andClosePriceIsNotNull() {
            addCriterion("close_price is not null");
            return (Criteria) this;
        }

        public Criteria andClosePriceEqualTo(BigDecimal value) {
            addCriterion("close_price =", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceNotEqualTo(BigDecimal value) {
            addCriterion("close_price <>", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceGreaterThan(BigDecimal value) {
            addCriterion("close_price >", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("close_price >=", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceLessThan(BigDecimal value) {
            addCriterion("close_price <", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("close_price <=", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceIn(List<BigDecimal> values) {
            addCriterion("close_price in", values, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceNotIn(List<BigDecimal> values) {
            addCriterion("close_price not in", values, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("close_price between", value1, value2, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("close_price not between", value1, value2, "closePrice");
            return (Criteria) this;
        }

        public Criteria andRangePriceIsNull() {
            addCriterion("range_price is null");
            return (Criteria) this;
        }

        public Criteria andRangePriceIsNotNull() {
            addCriterion("range_price is not null");
            return (Criteria) this;
        }

        public Criteria andRangePriceEqualTo(BigDecimal value) {
            addCriterion("range_price =", value, "rangePrice");
            return (Criteria) this;
        }

        public Criteria andRangePriceNotEqualTo(BigDecimal value) {
            addCriterion("range_price <>", value, "rangePrice");
            return (Criteria) this;
        }

        public Criteria andRangePriceGreaterThan(BigDecimal value) {
            addCriterion("range_price >", value, "rangePrice");
            return (Criteria) this;
        }

        public Criteria andRangePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("range_price >=", value, "rangePrice");
            return (Criteria) this;
        }

        public Criteria andRangePriceLessThan(BigDecimal value) {
            addCriterion("range_price <", value, "rangePrice");
            return (Criteria) this;
        }

        public Criteria andRangePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("range_price <=", value, "rangePrice");
            return (Criteria) this;
        }

        public Criteria andRangePriceIn(List<BigDecimal> values) {
            addCriterion("range_price in", values, "rangePrice");
            return (Criteria) this;
        }

        public Criteria andRangePriceNotIn(List<BigDecimal> values) {
            addCriterion("range_price not in", values, "rangePrice");
            return (Criteria) this;
        }

        public Criteria andRangePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("range_price between", value1, value2, "rangePrice");
            return (Criteria) this;
        }

        public Criteria andRangePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("range_price not between", value1, value2, "rangePrice");
            return (Criteria) this;
        }

        public Criteria andRangeRateIsNull() {
            addCriterion("range_rate is null");
            return (Criteria) this;
        }

        public Criteria andRangeRateIsNotNull() {
            addCriterion("range_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRangeRateEqualTo(Float value) {
            addCriterion("range_rate =", value, "rangeRate");
            return (Criteria) this;
        }

        public Criteria andRangeRateNotEqualTo(Float value) {
            addCriterion("range_rate <>", value, "rangeRate");
            return (Criteria) this;
        }

        public Criteria andRangeRateGreaterThan(Float value) {
            addCriterion("range_rate >", value, "rangeRate");
            return (Criteria) this;
        }

        public Criteria andRangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("range_rate >=", value, "rangeRate");
            return (Criteria) this;
        }

        public Criteria andRangeRateLessThan(Float value) {
            addCriterion("range_rate <", value, "rangeRate");
            return (Criteria) this;
        }

        public Criteria andRangeRateLessThanOrEqualTo(Float value) {
            addCriterion("range_rate <=", value, "rangeRate");
            return (Criteria) this;
        }

        public Criteria andRangeRateIn(List<Float> values) {
            addCriterion("range_rate in", values, "rangeRate");
            return (Criteria) this;
        }

        public Criteria andRangeRateNotIn(List<Float> values) {
            addCriterion("range_rate not in", values, "rangeRate");
            return (Criteria) this;
        }

        public Criteria andRangeRateBetween(Float value1, Float value2) {
            addCriterion("range_rate between", value1, value2, "rangeRate");
            return (Criteria) this;
        }

        public Criteria andRangeRateNotBetween(Float value1, Float value2) {
            addCriterion("range_rate not between", value1, value2, "rangeRate");
            return (Criteria) this;
        }

        public Criteria andLowestPriceIsNull() {
            addCriterion("lowest_price is null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceIsNotNull() {
            addCriterion("lowest_price is not null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceEqualTo(BigDecimal value) {
            addCriterion("lowest_price =", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceNotEqualTo(BigDecimal value) {
            addCriterion("lowest_price <>", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceGreaterThan(BigDecimal value) {
            addCriterion("lowest_price >", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lowest_price >=", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLessThan(BigDecimal value) {
            addCriterion("lowest_price <", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lowest_price <=", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceIn(List<BigDecimal> values) {
            addCriterion("lowest_price in", values, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceNotIn(List<BigDecimal> values) {
            addCriterion("lowest_price not in", values, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowest_price between", value1, value2, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowest_price not between", value1, value2, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceIsNull() {
            addCriterion("highest_price is null");
            return (Criteria) this;
        }

        public Criteria andHighestPriceIsNotNull() {
            addCriterion("highest_price is not null");
            return (Criteria) this;
        }

        public Criteria andHighestPriceEqualTo(BigDecimal value) {
            addCriterion("highest_price =", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceNotEqualTo(BigDecimal value) {
            addCriterion("highest_price <>", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceGreaterThan(BigDecimal value) {
            addCriterion("highest_price >", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("highest_price >=", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceLessThan(BigDecimal value) {
            addCriterion("highest_price <", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("highest_price <=", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceIn(List<BigDecimal> values) {
            addCriterion("highest_price in", values, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceNotIn(List<BigDecimal> values) {
            addCriterion("highest_price not in", values, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("highest_price between", value1, value2, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("highest_price not between", value1, value2, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeIsNull() {
            addCriterion("trade_volume is null");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeIsNotNull() {
            addCriterion("trade_volume is not null");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeEqualTo(Long value) {
            addCriterion("trade_volume =", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeNotEqualTo(Long value) {
            addCriterion("trade_volume <>", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeGreaterThan(Long value) {
            addCriterion("trade_volume >", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_volume >=", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeLessThan(Long value) {
            addCriterion("trade_volume <", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeLessThanOrEqualTo(Long value) {
            addCriterion("trade_volume <=", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeIn(List<Long> values) {
            addCriterion("trade_volume in", values, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeNotIn(List<Long> values) {
            addCriterion("trade_volume not in", values, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeBetween(Long value1, Long value2) {
            addCriterion("trade_volume between", value1, value2, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeNotBetween(Long value1, Long value2) {
            addCriterion("trade_volume not between", value1, value2, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIsNull() {
            addCriterion("trade_money is null");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIsNotNull() {
            addCriterion("trade_money is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyEqualTo(Float value) {
            addCriterion("trade_money =", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotEqualTo(Float value) {
            addCriterion("trade_money <>", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyGreaterThan(Float value) {
            addCriterion("trade_money >", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("trade_money >=", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyLessThan(Float value) {
            addCriterion("trade_money <", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyLessThanOrEqualTo(Float value) {
            addCriterion("trade_money <=", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIn(List<Float> values) {
            addCriterion("trade_money in", values, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotIn(List<Float> values) {
            addCriterion("trade_money not in", values, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyBetween(Float value1, Float value2) {
            addCriterion("trade_money between", value1, value2, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotBetween(Float value1, Float value2) {
            addCriterion("trade_money not between", value1, value2, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIsNull() {
            addCriterion("turnover_rate is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIsNotNull() {
            addCriterion("turnover_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateEqualTo(BigDecimal value) {
            addCriterion("turnover_rate =", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotEqualTo(BigDecimal value) {
            addCriterion("turnover_rate <>", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateGreaterThan(BigDecimal value) {
            addCriterion("turnover_rate >", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("turnover_rate >=", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLessThan(BigDecimal value) {
            addCriterion("turnover_rate <", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("turnover_rate <=", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIn(List<BigDecimal> values) {
            addCriterion("turnover_rate in", values, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotIn(List<BigDecimal> values) {
            addCriterion("turnover_rate not in", values, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("turnover_rate between", value1, value2, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("turnover_rate not between", value1, value2, "turnoverRate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
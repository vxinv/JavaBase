package com.lixin.stock.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StockThsGnInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockThsGnInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGnNameIsNull() {
            addCriterion("gn_name is null");
            return (Criteria) this;
        }

        public Criteria andGnNameIsNotNull() {
            addCriterion("gn_name is not null");
            return (Criteria) this;
        }

        public Criteria andGnNameEqualTo(String value) {
            addCriterion("gn_name =", value, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameNotEqualTo(String value) {
            addCriterion("gn_name <>", value, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameGreaterThan(String value) {
            addCriterion("gn_name >", value, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameGreaterThanOrEqualTo(String value) {
            addCriterion("gn_name >=", value, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameLessThan(String value) {
            addCriterion("gn_name <", value, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameLessThanOrEqualTo(String value) {
            addCriterion("gn_name <=", value, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameLike(String value) {
            addCriterion("gn_name like", value, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameNotLike(String value) {
            addCriterion("gn_name not like", value, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameIn(List<String> values) {
            addCriterion("gn_name in", values, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameNotIn(List<String> values) {
            addCriterion("gn_name not in", values, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameBetween(String value1, String value2) {
            addCriterion("gn_name between", value1, value2, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnNameNotBetween(String value1, String value2) {
            addCriterion("gn_name not between", value1, value2, "gnName");
            return (Criteria) this;
        }

        public Criteria andGnCodeIsNull() {
            addCriterion("gn_code is null");
            return (Criteria) this;
        }

        public Criteria andGnCodeIsNotNull() {
            addCriterion("gn_code is not null");
            return (Criteria) this;
        }

        public Criteria andGnCodeEqualTo(String value) {
            addCriterion("gn_code =", value, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeNotEqualTo(String value) {
            addCriterion("gn_code <>", value, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeGreaterThan(String value) {
            addCriterion("gn_code >", value, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gn_code >=", value, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeLessThan(String value) {
            addCriterion("gn_code <", value, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeLessThanOrEqualTo(String value) {
            addCriterion("gn_code <=", value, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeLike(String value) {
            addCriterion("gn_code like", value, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeNotLike(String value) {
            addCriterion("gn_code not like", value, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeIn(List<String> values) {
            addCriterion("gn_code in", values, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeNotIn(List<String> values) {
            addCriterion("gn_code not in", values, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeBetween(String value1, String value2) {
            addCriterion("gn_code between", value1, value2, "gnCode");
            return (Criteria) this;
        }

        public Criteria andGnCodeNotBetween(String value1, String value2) {
            addCriterion("gn_code not between", value1, value2, "gnCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockPriceIsNull() {
            addCriterion("stock_price is null");
            return (Criteria) this;
        }

        public Criteria andStockPriceIsNotNull() {
            addCriterion("stock_price is not null");
            return (Criteria) this;
        }

        public Criteria andStockPriceEqualTo(BigDecimal value) {
            addCriterion("stock_price =", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotEqualTo(BigDecimal value) {
            addCriterion("stock_price <>", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceGreaterThan(BigDecimal value) {
            addCriterion("stock_price >", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_price >=", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceLessThan(BigDecimal value) {
            addCriterion("stock_price <", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_price <=", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceIn(List<BigDecimal> values) {
            addCriterion("stock_price in", values, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotIn(List<BigDecimal> values) {
            addCriterion("stock_price not in", values, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_price between", value1, value2, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_price not between", value1, value2, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockChangeIsNull() {
            addCriterion("stock_change is null");
            return (Criteria) this;
        }

        public Criteria andStockChangeIsNotNull() {
            addCriterion("stock_change is not null");
            return (Criteria) this;
        }

        public Criteria andStockChangeEqualTo(BigDecimal value) {
            addCriterion("stock_change =", value, "stockChange");
            return (Criteria) this;
        }

        public Criteria andStockChangeNotEqualTo(BigDecimal value) {
            addCriterion("stock_change <>", value, "stockChange");
            return (Criteria) this;
        }

        public Criteria andStockChangeGreaterThan(BigDecimal value) {
            addCriterion("stock_change >", value, "stockChange");
            return (Criteria) this;
        }

        public Criteria andStockChangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_change >=", value, "stockChange");
            return (Criteria) this;
        }

        public Criteria andStockChangeLessThan(BigDecimal value) {
            addCriterion("stock_change <", value, "stockChange");
            return (Criteria) this;
        }

        public Criteria andStockChangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_change <=", value, "stockChange");
            return (Criteria) this;
        }

        public Criteria andStockChangeIn(List<BigDecimal> values) {
            addCriterion("stock_change in", values, "stockChange");
            return (Criteria) this;
        }

        public Criteria andStockChangeNotIn(List<BigDecimal> values) {
            addCriterion("stock_change not in", values, "stockChange");
            return (Criteria) this;
        }

        public Criteria andStockChangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_change between", value1, value2, "stockChange");
            return (Criteria) this;
        }

        public Criteria andStockChangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_change not between", value1, value2, "stockChange");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceIsNull() {
            addCriterion("stock_change_price is null");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceIsNotNull() {
            addCriterion("stock_change_price is not null");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceEqualTo(BigDecimal value) {
            addCriterion("stock_change_price =", value, "stockChangePrice");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceNotEqualTo(BigDecimal value) {
            addCriterion("stock_change_price <>", value, "stockChangePrice");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceGreaterThan(BigDecimal value) {
            addCriterion("stock_change_price >", value, "stockChangePrice");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_change_price >=", value, "stockChangePrice");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceLessThan(BigDecimal value) {
            addCriterion("stock_change_price <", value, "stockChangePrice");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_change_price <=", value, "stockChangePrice");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceIn(List<BigDecimal> values) {
            addCriterion("stock_change_price in", values, "stockChangePrice");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceNotIn(List<BigDecimal> values) {
            addCriterion("stock_change_price not in", values, "stockChangePrice");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_change_price between", value1, value2, "stockChangePrice");
            return (Criteria) this;
        }

        public Criteria andStockChangePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_change_price not between", value1, value2, "stockChangePrice");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedIsNull() {
            addCriterion("stock_change_speed is null");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedIsNotNull() {
            addCriterion("stock_change_speed is not null");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedEqualTo(BigDecimal value) {
            addCriterion("stock_change_speed =", value, "stockChangeSpeed");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedNotEqualTo(BigDecimal value) {
            addCriterion("stock_change_speed <>", value, "stockChangeSpeed");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedGreaterThan(BigDecimal value) {
            addCriterion("stock_change_speed >", value, "stockChangeSpeed");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_change_speed >=", value, "stockChangeSpeed");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedLessThan(BigDecimal value) {
            addCriterion("stock_change_speed <", value, "stockChangeSpeed");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_change_speed <=", value, "stockChangeSpeed");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedIn(List<BigDecimal> values) {
            addCriterion("stock_change_speed in", values, "stockChangeSpeed");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedNotIn(List<BigDecimal> values) {
            addCriterion("stock_change_speed not in", values, "stockChangeSpeed");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_change_speed between", value1, value2, "stockChangeSpeed");
            return (Criteria) this;
        }

        public Criteria andStockChangeSpeedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_change_speed not between", value1, value2, "stockChangeSpeed");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleIsNull() {
            addCriterion("stock_handover_scale is null");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleIsNotNull() {
            addCriterion("stock_handover_scale is not null");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleEqualTo(BigDecimal value) {
            addCriterion("stock_handover_scale =", value, "stockHandoverScale");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleNotEqualTo(BigDecimal value) {
            addCriterion("stock_handover_scale <>", value, "stockHandoverScale");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleGreaterThan(BigDecimal value) {
            addCriterion("stock_handover_scale >", value, "stockHandoverScale");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_handover_scale >=", value, "stockHandoverScale");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleLessThan(BigDecimal value) {
            addCriterion("stock_handover_scale <", value, "stockHandoverScale");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_handover_scale <=", value, "stockHandoverScale");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleIn(List<BigDecimal> values) {
            addCriterion("stock_handover_scale in", values, "stockHandoverScale");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleNotIn(List<BigDecimal> values) {
            addCriterion("stock_handover_scale not in", values, "stockHandoverScale");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_handover_scale between", value1, value2, "stockHandoverScale");
            return (Criteria) this;
        }

        public Criteria andStockHandoverScaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_handover_scale not between", value1, value2, "stockHandoverScale");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiIsNull() {
            addCriterion("stock_liang_bi is null");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiIsNotNull() {
            addCriterion("stock_liang_bi is not null");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiEqualTo(BigDecimal value) {
            addCriterion("stock_liang_bi =", value, "stockLiangBi");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiNotEqualTo(BigDecimal value) {
            addCriterion("stock_liang_bi <>", value, "stockLiangBi");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiGreaterThan(BigDecimal value) {
            addCriterion("stock_liang_bi >", value, "stockLiangBi");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_liang_bi >=", value, "stockLiangBi");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiLessThan(BigDecimal value) {
            addCriterion("stock_liang_bi <", value, "stockLiangBi");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_liang_bi <=", value, "stockLiangBi");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiIn(List<BigDecimal> values) {
            addCriterion("stock_liang_bi in", values, "stockLiangBi");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiNotIn(List<BigDecimal> values) {
            addCriterion("stock_liang_bi not in", values, "stockLiangBi");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_liang_bi between", value1, value2, "stockLiangBi");
            return (Criteria) this;
        }

        public Criteria andStockLiangBiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_liang_bi not between", value1, value2, "stockLiangBi");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeIsNull() {
            addCriterion("stock_amplitude is null");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeIsNotNull() {
            addCriterion("stock_amplitude is not null");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeEqualTo(BigDecimal value) {
            addCriterion("stock_amplitude =", value, "stockAmplitude");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeNotEqualTo(BigDecimal value) {
            addCriterion("stock_amplitude <>", value, "stockAmplitude");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeGreaterThan(BigDecimal value) {
            addCriterion("stock_amplitude >", value, "stockAmplitude");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_amplitude >=", value, "stockAmplitude");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeLessThan(BigDecimal value) {
            addCriterion("stock_amplitude <", value, "stockAmplitude");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_amplitude <=", value, "stockAmplitude");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeIn(List<BigDecimal> values) {
            addCriterion("stock_amplitude in", values, "stockAmplitude");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeNotIn(List<BigDecimal> values) {
            addCriterion("stock_amplitude not in", values, "stockAmplitude");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_amplitude between", value1, value2, "stockAmplitude");
            return (Criteria) this;
        }

        public Criteria andStockAmplitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_amplitude not between", value1, value2, "stockAmplitude");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountIsNull() {
            addCriterion("stock_deal_amount is null");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountIsNotNull() {
            addCriterion("stock_deal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountEqualTo(BigDecimal value) {
            addCriterion("stock_deal_amount =", value, "stockDealAmount");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountNotEqualTo(BigDecimal value) {
            addCriterion("stock_deal_amount <>", value, "stockDealAmount");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountGreaterThan(BigDecimal value) {
            addCriterion("stock_deal_amount >", value, "stockDealAmount");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_deal_amount >=", value, "stockDealAmount");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountLessThan(BigDecimal value) {
            addCriterion("stock_deal_amount <", value, "stockDealAmount");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_deal_amount <=", value, "stockDealAmount");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountIn(List<BigDecimal> values) {
            addCriterion("stock_deal_amount in", values, "stockDealAmount");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountNotIn(List<BigDecimal> values) {
            addCriterion("stock_deal_amount not in", values, "stockDealAmount");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_deal_amount between", value1, value2, "stockDealAmount");
            return (Criteria) this;
        }

        public Criteria andStockDealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_deal_amount not between", value1, value2, "stockDealAmount");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberIsNull() {
            addCriterion("stock_flow_stock_number is null");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberIsNotNull() {
            addCriterion("stock_flow_stock_number is not null");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberEqualTo(BigDecimal value) {
            addCriterion("stock_flow_stock_number =", value, "stockFlowStockNumber");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberNotEqualTo(BigDecimal value) {
            addCriterion("stock_flow_stock_number <>", value, "stockFlowStockNumber");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberGreaterThan(BigDecimal value) {
            addCriterion("stock_flow_stock_number >", value, "stockFlowStockNumber");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_flow_stock_number >=", value, "stockFlowStockNumber");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberLessThan(BigDecimal value) {
            addCriterion("stock_flow_stock_number <", value, "stockFlowStockNumber");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_flow_stock_number <=", value, "stockFlowStockNumber");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberIn(List<BigDecimal> values) {
            addCriterion("stock_flow_stock_number in", values, "stockFlowStockNumber");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberNotIn(List<BigDecimal> values) {
            addCriterion("stock_flow_stock_number not in", values, "stockFlowStockNumber");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_flow_stock_number between", value1, value2, "stockFlowStockNumber");
            return (Criteria) this;
        }

        public Criteria andStockFlowStockNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_flow_stock_number not between", value1, value2, "stockFlowStockNumber");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueIsNull() {
            addCriterion("stock_flow_makert_value is null");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueIsNotNull() {
            addCriterion("stock_flow_makert_value is not null");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueEqualTo(BigDecimal value) {
            addCriterion("stock_flow_makert_value =", value, "stockFlowMakertValue");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueNotEqualTo(BigDecimal value) {
            addCriterion("stock_flow_makert_value <>", value, "stockFlowMakertValue");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueGreaterThan(BigDecimal value) {
            addCriterion("stock_flow_makert_value >", value, "stockFlowMakertValue");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_flow_makert_value >=", value, "stockFlowMakertValue");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueLessThan(BigDecimal value) {
            addCriterion("stock_flow_makert_value <", value, "stockFlowMakertValue");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_flow_makert_value <=", value, "stockFlowMakertValue");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueIn(List<BigDecimal> values) {
            addCriterion("stock_flow_makert_value in", values, "stockFlowMakertValue");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueNotIn(List<BigDecimal> values) {
            addCriterion("stock_flow_makert_value not in", values, "stockFlowMakertValue");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_flow_makert_value between", value1, value2, "stockFlowMakertValue");
            return (Criteria) this;
        }

        public Criteria andStockFlowMakertValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_flow_makert_value not between", value1, value2, "stockFlowMakertValue");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmIsNull() {
            addCriterion("stock_market_ttm is null");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmIsNotNull() {
            addCriterion("stock_market_ttm is not null");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmEqualTo(BigDecimal value) {
            addCriterion("stock_market_ttm =", value, "stockMarketTtm");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmNotEqualTo(BigDecimal value) {
            addCriterion("stock_market_ttm <>", value, "stockMarketTtm");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmGreaterThan(BigDecimal value) {
            addCriterion("stock_market_ttm >", value, "stockMarketTtm");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_market_ttm >=", value, "stockMarketTtm");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmLessThan(BigDecimal value) {
            addCriterion("stock_market_ttm <", value, "stockMarketTtm");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_market_ttm <=", value, "stockMarketTtm");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmIn(List<BigDecimal> values) {
            addCriterion("stock_market_ttm in", values, "stockMarketTtm");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmNotIn(List<BigDecimal> values) {
            addCriterion("stock_market_ttm not in", values, "stockMarketTtm");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_market_ttm between", value1, value2, "stockMarketTtm");
            return (Criteria) this;
        }

        public Criteria andStockMarketTtmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_market_ttm not between", value1, value2, "stockMarketTtm");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeIsNull() {
            addCriterion("crawler_time is null");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeIsNotNull() {
            addCriterion("crawler_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeEqualTo(String value) {
            addCriterion("crawler_time =", value, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeNotEqualTo(String value) {
            addCriterion("crawler_time <>", value, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeGreaterThan(String value) {
            addCriterion("crawler_time >", value, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeGreaterThanOrEqualTo(String value) {
            addCriterion("crawler_time >=", value, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeLessThan(String value) {
            addCriterion("crawler_time <", value, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeLessThanOrEqualTo(String value) {
            addCriterion("crawler_time <=", value, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeLike(String value) {
            addCriterion("crawler_time like", value, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeNotLike(String value) {
            addCriterion("crawler_time not like", value, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeIn(List<String> values) {
            addCriterion("crawler_time in", values, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeNotIn(List<String> values) {
            addCriterion("crawler_time not in", values, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeBetween(String value1, String value2) {
            addCriterion("crawler_time between", value1, value2, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerTimeNotBetween(String value1, String value2) {
            addCriterion("crawler_time not between", value1, value2, "crawlerTime");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionIsNull() {
            addCriterion("crawler_version is null");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionIsNotNull() {
            addCriterion("crawler_version is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionEqualTo(String value) {
            addCriterion("crawler_version =", value, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionNotEqualTo(String value) {
            addCriterion("crawler_version <>", value, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionGreaterThan(String value) {
            addCriterion("crawler_version >", value, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionGreaterThanOrEqualTo(String value) {
            addCriterion("crawler_version >=", value, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionLessThan(String value) {
            addCriterion("crawler_version <", value, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionLessThanOrEqualTo(String value) {
            addCriterion("crawler_version <=", value, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionLike(String value) {
            addCriterion("crawler_version like", value, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionNotLike(String value) {
            addCriterion("crawler_version not like", value, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionIn(List<String> values) {
            addCriterion("crawler_version in", values, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionNotIn(List<String> values) {
            addCriterion("crawler_version not in", values, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionBetween(String value1, String value2) {
            addCriterion("crawler_version between", value1, value2, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCrawlerVersionNotBetween(String value1, String value2) {
            addCriterion("crawler_version not between", value1, value2, "crawlerVersion");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private final String condition;
        private final String typeHandler;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;

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
    }
}

package com.lixin.stock.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StockDfcfFundFlowInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockDfcfFundFlowInfoExample() {
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

        public Criteria andStockMarketIsNull() {
            addCriterion("stock_market is null");
            return (Criteria) this;
        }

        public Criteria andStockMarketIsNotNull() {
            addCriterion("stock_market is not null");
            return (Criteria) this;
        }

        public Criteria andStockMarketEqualTo(String value) {
            addCriterion("stock_market =", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotEqualTo(String value) {
            addCriterion("stock_market <>", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketGreaterThan(String value) {
            addCriterion("stock_market >", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketGreaterThanOrEqualTo(String value) {
            addCriterion("stock_market >=", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketLessThan(String value) {
            addCriterion("stock_market <", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketLessThanOrEqualTo(String value) {
            addCriterion("stock_market <=", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketLike(String value) {
            addCriterion("stock_market like", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotLike(String value) {
            addCriterion("stock_market not like", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketIn(List<String> values) {
            addCriterion("stock_market in", values, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotIn(List<String> values) {
            addCriterion("stock_market not in", values, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketBetween(String value1, String value2) {
            addCriterion("stock_market between", value1, value2, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotBetween(String value1, String value2) {
            addCriterion("stock_market not between", value1, value2, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockRankIsNull() {
            addCriterion("stock_rank is null");
            return (Criteria) this;
        }

        public Criteria andStockRankIsNotNull() {
            addCriterion("stock_rank is not null");
            return (Criteria) this;
        }

        public Criteria andStockRankEqualTo(String value) {
            addCriterion("stock_rank =", value, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankNotEqualTo(String value) {
            addCriterion("stock_rank <>", value, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankGreaterThan(String value) {
            addCriterion("stock_rank >", value, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankGreaterThanOrEqualTo(String value) {
            addCriterion("stock_rank >=", value, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankLessThan(String value) {
            addCriterion("stock_rank <", value, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankLessThanOrEqualTo(String value) {
            addCriterion("stock_rank <=", value, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankLike(String value) {
            addCriterion("stock_rank like", value, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankNotLike(String value) {
            addCriterion("stock_rank not like", value, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankIn(List<String> values) {
            addCriterion("stock_rank in", values, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankNotIn(List<String> values) {
            addCriterion("stock_rank not in", values, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankBetween(String value1, String value2) {
            addCriterion("stock_rank between", value1, value2, "stockRank");
            return (Criteria) this;
        }

        public Criteria andStockRankNotBetween(String value1, String value2) {
            addCriterion("stock_rank not between", value1, value2, "stockRank");
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

        public Criteria andPriceNewIsNull() {
            addCriterion("price_new is null");
            return (Criteria) this;
        }

        public Criteria andPriceNewIsNotNull() {
            addCriterion("price_new is not null");
            return (Criteria) this;
        }

        public Criteria andPriceNewEqualTo(BigDecimal value) {
            addCriterion("price_new =", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewNotEqualTo(BigDecimal value) {
            addCriterion("price_new <>", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewGreaterThan(BigDecimal value) {
            addCriterion("price_new >", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_new >=", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewLessThan(BigDecimal value) {
            addCriterion("price_new <", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_new <=", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewIn(List<BigDecimal> values) {
            addCriterion("price_new in", values, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewNotIn(List<BigDecimal> values) {
            addCriterion("price_new not in", values, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_new between", value1, value2, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_new not between", value1, value2, "priceNew");
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

        public Criteria andMainNetInflowAmountIsNull() {
            addCriterion("main_net_inflow_amount is null");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountIsNotNull() {
            addCriterion("main_net_inflow_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountEqualTo(BigDecimal value) {
            addCriterion("main_net_inflow_amount =", value, "mainNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountNotEqualTo(BigDecimal value) {
            addCriterion("main_net_inflow_amount <>", value, "mainNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountGreaterThan(BigDecimal value) {
            addCriterion("main_net_inflow_amount >", value, "mainNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("main_net_inflow_amount >=", value, "mainNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountLessThan(BigDecimal value) {
            addCriterion("main_net_inflow_amount <", value, "mainNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("main_net_inflow_amount <=", value, "mainNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountIn(List<BigDecimal> values) {
            addCriterion("main_net_inflow_amount in", values, "mainNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountNotIn(List<BigDecimal> values) {
            addCriterion("main_net_inflow_amount not in", values, "mainNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_net_inflow_amount between", value1, value2, "mainNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainNetInflowAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_net_inflow_amount not between", value1, value2, "mainNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionIsNull() {
            addCriterion("main_net_proportion is null");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionIsNotNull() {
            addCriterion("main_net_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionEqualTo(BigDecimal value) {
            addCriterion("main_net_proportion =", value, "mainNetProportion");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionNotEqualTo(BigDecimal value) {
            addCriterion("main_net_proportion <>", value, "mainNetProportion");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionGreaterThan(BigDecimal value) {
            addCriterion("main_net_proportion >", value, "mainNetProportion");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("main_net_proportion >=", value, "mainNetProportion");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionLessThan(BigDecimal value) {
            addCriterion("main_net_proportion <", value, "mainNetProportion");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("main_net_proportion <=", value, "mainNetProportion");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionIn(List<BigDecimal> values) {
            addCriterion("main_net_proportion in", values, "mainNetProportion");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionNotIn(List<BigDecimal> values) {
            addCriterion("main_net_proportion not in", values, "mainNetProportion");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_net_proportion between", value1, value2, "mainNetProportion");
            return (Criteria) this;
        }

        public Criteria andMainNetProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_net_proportion not between", value1, value2, "mainNetProportion");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountIsNull() {
            addCriterion("super_big_part_net_inFlow_amount is null");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountIsNotNull() {
            addCriterion("super_big_part_net_inFlow_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountEqualTo(BigDecimal value) {
            addCriterion("super_big_part_net_inFlow_amount =", value, "superBigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountNotEqualTo(BigDecimal value) {
            addCriterion("super_big_part_net_inFlow_amount <>", value, "superBigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountGreaterThan(BigDecimal value) {
            addCriterion("super_big_part_net_inFlow_amount >", value, "superBigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("super_big_part_net_inFlow_amount >=", value, "superBigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountLessThan(BigDecimal value) {
            addCriterion("super_big_part_net_inFlow_amount <", value, "superBigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("super_big_part_net_inFlow_amount <=", value, "superBigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountIn(List<BigDecimal> values) {
            addCriterion("super_big_part_net_inFlow_amount in", values, "superBigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountNotIn(List<BigDecimal> values) {
            addCriterion("super_big_part_net_inFlow_amount not in", values, "superBigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("super_big_part_net_inFlow_amount between", value1, value2, "superBigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetInflowAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("super_big_part_net_inFlow_amount not between", value1, value2, "superBigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionIsNull() {
            addCriterion("super_big_part_net_proportion is null");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionIsNotNull() {
            addCriterion("super_big_part_net_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionEqualTo(BigDecimal value) {
            addCriterion("super_big_part_net_proportion =", value, "superBigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionNotEqualTo(BigDecimal value) {
            addCriterion("super_big_part_net_proportion <>", value, "superBigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionGreaterThan(BigDecimal value) {
            addCriterion("super_big_part_net_proportion >", value, "superBigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("super_big_part_net_proportion >=", value, "superBigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionLessThan(BigDecimal value) {
            addCriterion("super_big_part_net_proportion <", value, "superBigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("super_big_part_net_proportion <=", value, "superBigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionIn(List<BigDecimal> values) {
            addCriterion("super_big_part_net_proportion in", values, "superBigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionNotIn(List<BigDecimal> values) {
            addCriterion("super_big_part_net_proportion not in", values, "superBigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("super_big_part_net_proportion between", value1, value2, "superBigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andSuperBigPartNetProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("super_big_part_net_proportion not between", value1, value2, "superBigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountIsNull() {
            addCriterion("big_part_net_inFlow_amount is null");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountIsNotNull() {
            addCriterion("big_part_net_inFlow_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountEqualTo(BigDecimal value) {
            addCriterion("big_part_net_inFlow_amount =", value, "bigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountNotEqualTo(BigDecimal value) {
            addCriterion("big_part_net_inFlow_amount <>", value, "bigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountGreaterThan(BigDecimal value) {
            addCriterion("big_part_net_inFlow_amount >", value, "bigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("big_part_net_inFlow_amount >=", value, "bigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountLessThan(BigDecimal value) {
            addCriterion("big_part_net_inFlow_amount <", value, "bigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("big_part_net_inFlow_amount <=", value, "bigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountIn(List<BigDecimal> values) {
            addCriterion("big_part_net_inFlow_amount in", values, "bigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountNotIn(List<BigDecimal> values) {
            addCriterion("big_part_net_inFlow_amount not in", values, "bigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("big_part_net_inFlow_amount between", value1, value2, "bigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andBigPartNetInflowAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("big_part_net_inFlow_amount not between", value1, value2, "bigPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionIsNull() {
            addCriterion("big_part_net_proportion is null");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionIsNotNull() {
            addCriterion("big_part_net_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionEqualTo(BigDecimal value) {
            addCriterion("big_part_net_proportion =", value, "bigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionNotEqualTo(BigDecimal value) {
            addCriterion("big_part_net_proportion <>", value, "bigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionGreaterThan(BigDecimal value) {
            addCriterion("big_part_net_proportion >", value, "bigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("big_part_net_proportion >=", value, "bigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionLessThan(BigDecimal value) {
            addCriterion("big_part_net_proportion <", value, "bigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("big_part_net_proportion <=", value, "bigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionIn(List<BigDecimal> values) {
            addCriterion("big_part_net_proportion in", values, "bigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionNotIn(List<BigDecimal> values) {
            addCriterion("big_part_net_proportion not in", values, "bigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("big_part_net_proportion between", value1, value2, "bigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andBigPartNetProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("big_part_net_proportion not between", value1, value2, "bigPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountIsNull() {
            addCriterion("middle_part_net_inFlow_amount is null");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountIsNotNull() {
            addCriterion("middle_part_net_inFlow_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountEqualTo(BigDecimal value) {
            addCriterion("middle_part_net_inFlow_amount =", value, "middlePartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountNotEqualTo(BigDecimal value) {
            addCriterion("middle_part_net_inFlow_amount <>", value, "middlePartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountGreaterThan(BigDecimal value) {
            addCriterion("middle_part_net_inFlow_amount >", value, "middlePartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("middle_part_net_inFlow_amount >=", value, "middlePartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountLessThan(BigDecimal value) {
            addCriterion("middle_part_net_inFlow_amount <", value, "middlePartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("middle_part_net_inFlow_amount <=", value, "middlePartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountIn(List<BigDecimal> values) {
            addCriterion("middle_part_net_inFlow_amount in", values, "middlePartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountNotIn(List<BigDecimal> values) {
            addCriterion("middle_part_net_inFlow_amount not in", values, "middlePartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("middle_part_net_inFlow_amount between", value1, value2, "middlePartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetInflowAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("middle_part_net_inFlow_amount not between", value1, value2, "middlePartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionIsNull() {
            addCriterion("middle_part_net_proportion is null");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionIsNotNull() {
            addCriterion("middle_part_net_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionEqualTo(BigDecimal value) {
            addCriterion("middle_part_net_proportion =", value, "middlePartNetProportion");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionNotEqualTo(BigDecimal value) {
            addCriterion("middle_part_net_proportion <>", value, "middlePartNetProportion");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionGreaterThan(BigDecimal value) {
            addCriterion("middle_part_net_proportion >", value, "middlePartNetProportion");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("middle_part_net_proportion >=", value, "middlePartNetProportion");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionLessThan(BigDecimal value) {
            addCriterion("middle_part_net_proportion <", value, "middlePartNetProportion");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("middle_part_net_proportion <=", value, "middlePartNetProportion");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionIn(List<BigDecimal> values) {
            addCriterion("middle_part_net_proportion in", values, "middlePartNetProportion");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionNotIn(List<BigDecimal> values) {
            addCriterion("middle_part_net_proportion not in", values, "middlePartNetProportion");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("middle_part_net_proportion between", value1, value2, "middlePartNetProportion");
            return (Criteria) this;
        }

        public Criteria andMiddlePartNetProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("middle_part_net_proportion not between", value1, value2, "middlePartNetProportion");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountIsNull() {
            addCriterion("litter_part_net_inFlow_amount is null");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountIsNotNull() {
            addCriterion("litter_part_net_inFlow_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountEqualTo(BigDecimal value) {
            addCriterion("litter_part_net_inFlow_amount =", value, "litterPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountNotEqualTo(BigDecimal value) {
            addCriterion("litter_part_net_inFlow_amount <>", value, "litterPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountGreaterThan(BigDecimal value) {
            addCriterion("litter_part_net_inFlow_amount >", value, "litterPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("litter_part_net_inFlow_amount >=", value, "litterPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountLessThan(BigDecimal value) {
            addCriterion("litter_part_net_inFlow_amount <", value, "litterPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("litter_part_net_inFlow_amount <=", value, "litterPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountIn(List<BigDecimal> values) {
            addCriterion("litter_part_net_inFlow_amount in", values, "litterPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountNotIn(List<BigDecimal> values) {
            addCriterion("litter_part_net_inFlow_amount not in", values, "litterPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("litter_part_net_inFlow_amount between", value1, value2, "litterPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetInflowAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("litter_part_net_inFlow_amount not between", value1, value2, "litterPartNetInflowAmount");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionIsNull() {
            addCriterion("litter_part_net_proportion is null");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionIsNotNull() {
            addCriterion("litter_part_net_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionEqualTo(BigDecimal value) {
            addCriterion("litter_part_net_proportion =", value, "litterPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionNotEqualTo(BigDecimal value) {
            addCriterion("litter_part_net_proportion <>", value, "litterPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionGreaterThan(BigDecimal value) {
            addCriterion("litter_part_net_proportion >", value, "litterPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("litter_part_net_proportion >=", value, "litterPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionLessThan(BigDecimal value) {
            addCriterion("litter_part_net_proportion <", value, "litterPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("litter_part_net_proportion <=", value, "litterPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionIn(List<BigDecimal> values) {
            addCriterion("litter_part_net_proportion in", values, "litterPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionNotIn(List<BigDecimal> values) {
            addCriterion("litter_part_net_proportion not in", values, "litterPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("litter_part_net_proportion between", value1, value2, "litterPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andLitterPartNetProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("litter_part_net_proportion not between", value1, value2, "litterPartNetProportion");
            return (Criteria) this;
        }

        public Criteria andStockPageIsNull() {
            addCriterion("stock_page is null");
            return (Criteria) this;
        }

        public Criteria andStockPageIsNotNull() {
            addCriterion("stock_page is not null");
            return (Criteria) this;
        }

        public Criteria andStockPageEqualTo(Integer value) {
            addCriterion("stock_page =", value, "stockPage");
            return (Criteria) this;
        }

        public Criteria andStockPageNotEqualTo(Integer value) {
            addCriterion("stock_page <>", value, "stockPage");
            return (Criteria) this;
        }

        public Criteria andStockPageGreaterThan(Integer value) {
            addCriterion("stock_page >", value, "stockPage");
            return (Criteria) this;
        }

        public Criteria andStockPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_page >=", value, "stockPage");
            return (Criteria) this;
        }

        public Criteria andStockPageLessThan(Integer value) {
            addCriterion("stock_page <", value, "stockPage");
            return (Criteria) this;
        }

        public Criteria andStockPageLessThanOrEqualTo(Integer value) {
            addCriterion("stock_page <=", value, "stockPage");
            return (Criteria) this;
        }

        public Criteria andStockPageIn(List<Integer> values) {
            addCriterion("stock_page in", values, "stockPage");
            return (Criteria) this;
        }

        public Criteria andStockPageNotIn(List<Integer> values) {
            addCriterion("stock_page not in", values, "stockPage");
            return (Criteria) this;
        }

        public Criteria andStockPageBetween(Integer value1, Integer value2) {
            addCriterion("stock_page between", value1, value2, "stockPage");
            return (Criteria) this;
        }

        public Criteria andStockPageNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_page not between", value1, value2, "stockPage");
            return (Criteria) this;
        }

        public Criteria andCountTimeIsNull() {
            addCriterion("count_time is null");
            return (Criteria) this;
        }

        public Criteria andCountTimeIsNotNull() {
            addCriterion("count_time is not null");
            return (Criteria) this;
        }

        public Criteria andCountTimeEqualTo(LocalDateTime value) {
            addCriterion("count_time =", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeNotEqualTo(LocalDateTime value) {
            addCriterion("count_time <>", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeGreaterThan(LocalDateTime value) {
            addCriterion("count_time >", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("count_time >=", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeLessThan(LocalDateTime value) {
            addCriterion("count_time <", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("count_time <=", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeIn(List<LocalDateTime> values) {
            addCriterion("count_time in", values, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeNotIn(List<LocalDateTime> values) {
            addCriterion("count_time not in", values, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("count_time between", value1, value2, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("count_time not between", value1, value2, "countTime");
            return (Criteria) this;
        }

        public Criteria andTimeVersionIsNull() {
            addCriterion("time_version is null");
            return (Criteria) this;
        }

        public Criteria andTimeVersionIsNotNull() {
            addCriterion("time_version is not null");
            return (Criteria) this;
        }

        public Criteria andTimeVersionEqualTo(String value) {
            addCriterion("time_version =", value, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionNotEqualTo(String value) {
            addCriterion("time_version <>", value, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionGreaterThan(String value) {
            addCriterion("time_version >", value, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionGreaterThanOrEqualTo(String value) {
            addCriterion("time_version >=", value, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionLessThan(String value) {
            addCriterion("time_version <", value, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionLessThanOrEqualTo(String value) {
            addCriterion("time_version <=", value, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionLike(String value) {
            addCriterion("time_version like", value, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionNotLike(String value) {
            addCriterion("time_version not like", value, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionIn(List<String> values) {
            addCriterion("time_version in", values, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionNotIn(List<String> values) {
            addCriterion("time_version not in", values, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionBetween(String value1, String value2) {
            addCriterion("time_version between", value1, value2, "timeVersion");
            return (Criteria) this;
        }

        public Criteria andTimeVersionNotBetween(String value1, String value2) {
            addCriterion("time_version not between", value1, value2, "timeVersion");
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

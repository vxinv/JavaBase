package com.lixin.stock.model;

import java.util.ArrayList;
import java.util.List;

public class StockNcodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockNcodeExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
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

        public Criteria andTotalSharesIsNull() {
            addCriterion("total_shares is null");
            return (Criteria) this;
        }

        public Criteria andTotalSharesIsNotNull() {
            addCriterion("total_shares is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSharesEqualTo(Long value) {
            addCriterion("total_shares =", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotEqualTo(Long value) {
            addCriterion("total_shares <>", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesGreaterThan(Long value) {
            addCriterion("total_shares >", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesGreaterThanOrEqualTo(Long value) {
            addCriterion("total_shares >=", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesLessThan(Long value) {
            addCriterion("total_shares <", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesLessThanOrEqualTo(Long value) {
            addCriterion("total_shares <=", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesIn(List<Long> values) {
            addCriterion("total_shares in", values, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotIn(List<Long> values) {
            addCriterion("total_shares not in", values, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesBetween(Long value1, Long value2) {
            addCriterion("total_shares between", value1, value2, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotBetween(Long value1, Long value2) {
            addCriterion("total_shares not between", value1, value2, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIsNull() {
            addCriterion("total_assets is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIsNotNull() {
            addCriterion("total_assets is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsEqualTo(Long value) {
            addCriterion("total_assets =", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotEqualTo(Long value) {
            addCriterion("total_assets <>", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThan(Long value) {
            addCriterion("total_assets >", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThanOrEqualTo(Long value) {
            addCriterion("total_assets >=", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThan(Long value) {
            addCriterion("total_assets <", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThanOrEqualTo(Long value) {
            addCriterion("total_assets <=", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIn(List<Long> values) {
            addCriterion("total_assets in", values, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotIn(List<Long> values) {
            addCriterion("total_assets not in", values, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsBetween(Long value1, Long value2) {
            addCriterion("total_assets between", value1, value2, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotBetween(Long value1, Long value2) {
            addCriterion("total_assets not between", value1, value2, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginIsNull() {
            addCriterion("gross_profit_margin is null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginIsNotNull() {
            addCriterion("gross_profit_margin is not null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginEqualTo(Float value) {
            addCriterion("gross_profit_margin =", value, "grossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginNotEqualTo(Float value) {
            addCriterion("gross_profit_margin <>", value, "grossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginGreaterThan(Float value) {
            addCriterion("gross_profit_margin >", value, "grossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginGreaterThanOrEqualTo(Float value) {
            addCriterion("gross_profit_margin >=", value, "grossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginLessThan(Float value) {
            addCriterion("gross_profit_margin <", value, "grossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginLessThanOrEqualTo(Float value) {
            addCriterion("gross_profit_margin <=", value, "grossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginIn(List<Float> values) {
            addCriterion("gross_profit_margin in", values, "grossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginNotIn(List<Float> values) {
            addCriterion("gross_profit_margin not in", values, "grossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginBetween(Float value1, Float value2) {
            addCriterion("gross_profit_margin between", value1, value2, "grossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginNotBetween(Float value1, Float value2) {
            addCriterion("gross_profit_margin not between", value1, value2, "grossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andRoeIsNull() {
            addCriterion("roe is null");
            return (Criteria) this;
        }

        public Criteria andRoeIsNotNull() {
            addCriterion("roe is not null");
            return (Criteria) this;
        }

        public Criteria andRoeEqualTo(Float value) {
            addCriterion("roe =", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeNotEqualTo(Float value) {
            addCriterion("roe <>", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeGreaterThan(Float value) {
            addCriterion("roe >", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeGreaterThanOrEqualTo(Float value) {
            addCriterion("roe >=", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeLessThan(Float value) {
            addCriterion("roe <", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeLessThanOrEqualTo(Float value) {
            addCriterion("roe <=", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeIn(List<Float> values) {
            addCriterion("roe in", values, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeNotIn(List<Float> values) {
            addCriterion("roe not in", values, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeBetween(Float value1, Float value2) {
            addCriterion("roe between", value1, value2, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeNotBetween(Float value1, Float value2) {
            addCriterion("roe not between", value1, value2, "roe");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareIsNull() {
            addCriterion("earnings_per_share is null");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareIsNotNull() {
            addCriterion("earnings_per_share is not null");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareEqualTo(Float value) {
            addCriterion("earnings_per_share =", value, "earningsPerShare");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareNotEqualTo(Float value) {
            addCriterion("earnings_per_share <>", value, "earningsPerShare");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareGreaterThan(Float value) {
            addCriterion("earnings_per_share >", value, "earningsPerShare");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareGreaterThanOrEqualTo(Float value) {
            addCriterion("earnings_per_share >=", value, "earningsPerShare");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareLessThan(Float value) {
            addCriterion("earnings_per_share <", value, "earningsPerShare");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareLessThanOrEqualTo(Float value) {
            addCriterion("earnings_per_share <=", value, "earningsPerShare");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareIn(List<Float> values) {
            addCriterion("earnings_per_share in", values, "earningsPerShare");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareNotIn(List<Float> values) {
            addCriterion("earnings_per_share not in", values, "earningsPerShare");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareBetween(Float value1, Float value2) {
            addCriterion("earnings_per_share between", value1, value2, "earningsPerShare");
            return (Criteria) this;
        }

        public Criteria andEarningsPerShareNotBetween(Float value1, Float value2) {
            addCriterion("earnings_per_share not between", value1, value2, "earningsPerShare");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareIsNull() {
            addCriterion("net_asset_per_share is null");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareIsNotNull() {
            addCriterion("net_asset_per_share is not null");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareEqualTo(Float value) {
            addCriterion("net_asset_per_share =", value, "netAssetPerShare");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareNotEqualTo(Float value) {
            addCriterion("net_asset_per_share <>", value, "netAssetPerShare");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareGreaterThan(Float value) {
            addCriterion("net_asset_per_share >", value, "netAssetPerShare");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareGreaterThanOrEqualTo(Float value) {
            addCriterion("net_asset_per_share >=", value, "netAssetPerShare");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareLessThan(Float value) {
            addCriterion("net_asset_per_share <", value, "netAssetPerShare");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareLessThanOrEqualTo(Float value) {
            addCriterion("net_asset_per_share <=", value, "netAssetPerShare");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareIn(List<Float> values) {
            addCriterion("net_asset_per_share in", values, "netAssetPerShare");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareNotIn(List<Float> values) {
            addCriterion("net_asset_per_share not in", values, "netAssetPerShare");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareBetween(Float value1, Float value2) {
            addCriterion("net_asset_per_share between", value1, value2, "netAssetPerShare");
            return (Criteria) this;
        }

        public Criteria andNetAssetPerShareNotBetween(Float value1, Float value2) {
            addCriterion("net_asset_per_share not between", value1, value2, "netAssetPerShare");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareIsNull() {
            addCriterion("cash_flow_per_share is null");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareIsNotNull() {
            addCriterion("cash_flow_per_share is not null");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareEqualTo(Float value) {
            addCriterion("cash_flow_per_share =", value, "cashFlowPerShare");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareNotEqualTo(Float value) {
            addCriterion("cash_flow_per_share <>", value, "cashFlowPerShare");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareGreaterThan(Float value) {
            addCriterion("cash_flow_per_share >", value, "cashFlowPerShare");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareGreaterThanOrEqualTo(Float value) {
            addCriterion("cash_flow_per_share >=", value, "cashFlowPerShare");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareLessThan(Float value) {
            addCriterion("cash_flow_per_share <", value, "cashFlowPerShare");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareLessThanOrEqualTo(Float value) {
            addCriterion("cash_flow_per_share <=", value, "cashFlowPerShare");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareIn(List<Float> values) {
            addCriterion("cash_flow_per_share in", values, "cashFlowPerShare");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareNotIn(List<Float> values) {
            addCriterion("cash_flow_per_share not in", values, "cashFlowPerShare");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareBetween(Float value1, Float value2) {
            addCriterion("cash_flow_per_share between", value1, value2, "cashFlowPerShare");
            return (Criteria) this;
        }

        public Criteria andCashFlowPerShareNotBetween(Float value1, Float value2) {
            addCriterion("cash_flow_per_share not between", value1, value2, "cashFlowPerShare");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalIsNull() {
            addCriterion("float_market_capital is null");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalIsNotNull() {
            addCriterion("float_market_capital is not null");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalEqualTo(Long value) {
            addCriterion("float_market_capital =", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalNotEqualTo(Long value) {
            addCriterion("float_market_capital <>", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalGreaterThan(Long value) {
            addCriterion("float_market_capital >", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalGreaterThanOrEqualTo(Long value) {
            addCriterion("float_market_capital >=", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalLessThan(Long value) {
            addCriterion("float_market_capital <", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalLessThanOrEqualTo(Long value) {
            addCriterion("float_market_capital <=", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalIn(List<Long> values) {
            addCriterion("float_market_capital in", values, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalNotIn(List<Long> values) {
            addCriterion("float_market_capital not in", values, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalBetween(Long value1, Long value2) {
            addCriterion("float_market_capital between", value1, value2, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalNotBetween(Long value1, Long value2) {
            addCriterion("float_market_capital not between", value1, value2, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatSharesIsNull() {
            addCriterion("float_shares is null");
            return (Criteria) this;
        }

        public Criteria andFloatSharesIsNotNull() {
            addCriterion("float_shares is not null");
            return (Criteria) this;
        }

        public Criteria andFloatSharesEqualTo(Long value) {
            addCriterion("float_shares =", value, "floatShares");
            return (Criteria) this;
        }

        public Criteria andFloatSharesNotEqualTo(Long value) {
            addCriterion("float_shares <>", value, "floatShares");
            return (Criteria) this;
        }

        public Criteria andFloatSharesGreaterThan(Long value) {
            addCriterion("float_shares >", value, "floatShares");
            return (Criteria) this;
        }

        public Criteria andFloatSharesGreaterThanOrEqualTo(Long value) {
            addCriterion("float_shares >=", value, "floatShares");
            return (Criteria) this;
        }

        public Criteria andFloatSharesLessThan(Long value) {
            addCriterion("float_shares <", value, "floatShares");
            return (Criteria) this;
        }

        public Criteria andFloatSharesLessThanOrEqualTo(Long value) {
            addCriterion("float_shares <=", value, "floatShares");
            return (Criteria) this;
        }

        public Criteria andFloatSharesIn(List<Long> values) {
            addCriterion("float_shares in", values, "floatShares");
            return (Criteria) this;
        }

        public Criteria andFloatSharesNotIn(List<Long> values) {
            addCriterion("float_shares not in", values, "floatShares");
            return (Criteria) this;
        }

        public Criteria andFloatSharesBetween(Long value1, Long value2) {
            addCriterion("float_shares between", value1, value2, "floatShares");
            return (Criteria) this;
        }

        public Criteria andFloatSharesNotBetween(Long value1, Long value2) {
            addCriterion("float_shares not between", value1, value2, "floatShares");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeIsNull() {
            addCriterion("total_operating_income is null");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeIsNotNull() {
            addCriterion("total_operating_income is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeEqualTo(Long value) {
            addCriterion("total_operating_income =", value, "totalOperatingIncome");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeNotEqualTo(Long value) {
            addCriterion("total_operating_income <>", value, "totalOperatingIncome");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeGreaterThan(Long value) {
            addCriterion("total_operating_income >", value, "totalOperatingIncome");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeGreaterThanOrEqualTo(Long value) {
            addCriterion("total_operating_income >=", value, "totalOperatingIncome");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeLessThan(Long value) {
            addCriterion("total_operating_income <", value, "totalOperatingIncome");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeLessThanOrEqualTo(Long value) {
            addCriterion("total_operating_income <=", value, "totalOperatingIncome");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeIn(List<Long> values) {
            addCriterion("total_operating_income in", values, "totalOperatingIncome");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeNotIn(List<Long> values) {
            addCriterion("total_operating_income not in", values, "totalOperatingIncome");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeBetween(Long value1, Long value2) {
            addCriterion("total_operating_income between", value1, value2, "totalOperatingIncome");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingIncomeNotBetween(Long value1, Long value2) {
            addCriterion("total_operating_income not between", value1, value2, "totalOperatingIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrIsNull() {
            addCriterion("net_profit_cagr is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrIsNotNull() {
            addCriterion("net_profit_cagr is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrEqualTo(Double value) {
            addCriterion("net_profit_cagr =", value, "netProfitCagr");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrNotEqualTo(Double value) {
            addCriterion("net_profit_cagr <>", value, "netProfitCagr");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrGreaterThan(Double value) {
            addCriterion("net_profit_cagr >", value, "netProfitCagr");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrGreaterThanOrEqualTo(Double value) {
            addCriterion("net_profit_cagr >=", value, "netProfitCagr");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrLessThan(Double value) {
            addCriterion("net_profit_cagr <", value, "netProfitCagr");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrLessThanOrEqualTo(Double value) {
            addCriterion("net_profit_cagr <=", value, "netProfitCagr");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrIn(List<Double> values) {
            addCriterion("net_profit_cagr in", values, "netProfitCagr");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrNotIn(List<Double> values) {
            addCriterion("net_profit_cagr not in", values, "netProfitCagr");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrBetween(Double value1, Double value2) {
            addCriterion("net_profit_cagr between", value1, value2, "netProfitCagr");
            return (Criteria) this;
        }

        public Criteria andNetProfitCagrNotBetween(Double value1, Double value2) {
            addCriterion("net_profit_cagr not between", value1, value2, "netProfitCagr");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdIsNull() {
            addCriterion("one_category_id is null");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdIsNotNull() {
            addCriterion("one_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdEqualTo(Integer value) {
            addCriterion("one_category_id =", value, "oneCategoryId");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdNotEqualTo(Integer value) {
            addCriterion("one_category_id <>", value, "oneCategoryId");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdGreaterThan(Integer value) {
            addCriterion("one_category_id >", value, "oneCategoryId");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("one_category_id >=", value, "oneCategoryId");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdLessThan(Integer value) {
            addCriterion("one_category_id <", value, "oneCategoryId");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("one_category_id <=", value, "oneCategoryId");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdIn(List<Integer> values) {
            addCriterion("one_category_id in", values, "oneCategoryId");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdNotIn(List<Integer> values) {
            addCriterion("one_category_id not in", values, "oneCategoryId");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("one_category_id between", value1, value2, "oneCategoryId");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("one_category_id not between", value1, value2, "oneCategoryId");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIsNull() {
            addCriterion("one_category is null");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIsNotNull() {
            addCriterion("one_category is not null");
            return (Criteria) this;
        }

        public Criteria andOneCategoryEqualTo(String value) {
            addCriterion("one_category =", value, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryNotEqualTo(String value) {
            addCriterion("one_category <>", value, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryGreaterThan(String value) {
            addCriterion("one_category >", value, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("one_category >=", value, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryLessThan(String value) {
            addCriterion("one_category <", value, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryLessThanOrEqualTo(String value) {
            addCriterion("one_category <=", value, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryLike(String value) {
            addCriterion("one_category like", value, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryNotLike(String value) {
            addCriterion("one_category not like", value, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryIn(List<String> values) {
            addCriterion("one_category in", values, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryNotIn(List<String> values) {
            addCriterion("one_category not in", values, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryBetween(String value1, String value2) {
            addCriterion("one_category between", value1, value2, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andOneCategoryNotBetween(String value1, String value2) {
            addCriterion("one_category not between", value1, value2, "oneCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdIsNull() {
            addCriterion("two_category_id is null");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdIsNotNull() {
            addCriterion("two_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdEqualTo(Integer value) {
            addCriterion("two_category_id =", value, "twoCategoryId");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdNotEqualTo(Integer value) {
            addCriterion("two_category_id <>", value, "twoCategoryId");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdGreaterThan(Integer value) {
            addCriterion("two_category_id >", value, "twoCategoryId");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("two_category_id >=", value, "twoCategoryId");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdLessThan(Integer value) {
            addCriterion("two_category_id <", value, "twoCategoryId");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("two_category_id <=", value, "twoCategoryId");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdIn(List<Integer> values) {
            addCriterion("two_category_id in", values, "twoCategoryId");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdNotIn(List<Integer> values) {
            addCriterion("two_category_id not in", values, "twoCategoryId");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("two_category_id between", value1, value2, "twoCategoryId");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("two_category_id not between", value1, value2, "twoCategoryId");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIsNull() {
            addCriterion("two_category is null");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIsNotNull() {
            addCriterion("two_category is not null");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryEqualTo(String value) {
            addCriterion("two_category =", value, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryNotEqualTo(String value) {
            addCriterion("two_category <>", value, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryGreaterThan(String value) {
            addCriterion("two_category >", value, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("two_category >=", value, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryLessThan(String value) {
            addCriterion("two_category <", value, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryLessThanOrEqualTo(String value) {
            addCriterion("two_category <=", value, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryLike(String value) {
            addCriterion("two_category like", value, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryNotLike(String value) {
            addCriterion("two_category not like", value, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryIn(List<String> values) {
            addCriterion("two_category in", values, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryNotIn(List<String> values) {
            addCriterion("two_category not in", values, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryBetween(String value1, String value2) {
            addCriterion("two_category between", value1, value2, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andTwoCategoryNotBetween(String value1, String value2) {
            addCriterion("two_category not between", value1, value2, "twoCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdIsNull() {
            addCriterion("three_category_id is null");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdIsNotNull() {
            addCriterion("three_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdEqualTo(Integer value) {
            addCriterion("three_category_id =", value, "threeCategoryId");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdNotEqualTo(Integer value) {
            addCriterion("three_category_id <>", value, "threeCategoryId");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdGreaterThan(Integer value) {
            addCriterion("three_category_id >", value, "threeCategoryId");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("three_category_id >=", value, "threeCategoryId");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdLessThan(Integer value) {
            addCriterion("three_category_id <", value, "threeCategoryId");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("three_category_id <=", value, "threeCategoryId");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdIn(List<Integer> values) {
            addCriterion("three_category_id in", values, "threeCategoryId");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdNotIn(List<Integer> values) {
            addCriterion("three_category_id not in", values, "threeCategoryId");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("three_category_id between", value1, value2, "threeCategoryId");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("three_category_id not between", value1, value2, "threeCategoryId");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIsNull() {
            addCriterion("three_category is null");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIsNotNull() {
            addCriterion("three_category is not null");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryEqualTo(String value) {
            addCriterion("three_category =", value, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryNotEqualTo(String value) {
            addCriterion("three_category <>", value, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryGreaterThan(String value) {
            addCriterion("three_category >", value, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("three_category >=", value, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryLessThan(String value) {
            addCriterion("three_category <", value, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryLessThanOrEqualTo(String value) {
            addCriterion("three_category <=", value, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryLike(String value) {
            addCriterion("three_category like", value, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryNotLike(String value) {
            addCriterion("three_category not like", value, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryIn(List<String> values) {
            addCriterion("three_category in", values, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryNotIn(List<String> values) {
            addCriterion("three_category not in", values, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryBetween(String value1, String value2) {
            addCriterion("three_category between", value1, value2, "threeCategory");
            return (Criteria) this;
        }

        public Criteria andThreeCategoryNotBetween(String value1, String value2) {
            addCriterion("three_category not between", value1, value2, "threeCategory");
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
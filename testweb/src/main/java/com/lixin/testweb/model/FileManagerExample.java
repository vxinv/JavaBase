package com.lixin.testweb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileManagerExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileTimeIsNull() {
            addCriterion("file_time is null");
            return (Criteria) this;
        }

        public Criteria andFileTimeIsNotNull() {
            addCriterion("file_time is not null");
            return (Criteria) this;
        }

        public Criteria andFileTimeEqualTo(Date value) {
            addCriterion("file_time =", value, "fileTime");
            return (Criteria) this;
        }

        public Criteria andFileTimeNotEqualTo(Date value) {
            addCriterion("file_time <>", value, "fileTime");
            return (Criteria) this;
        }

        public Criteria andFileTimeGreaterThan(Date value) {
            addCriterion("file_time >", value, "fileTime");
            return (Criteria) this;
        }

        public Criteria andFileTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("file_time >=", value, "fileTime");
            return (Criteria) this;
        }

        public Criteria andFileTimeLessThan(Date value) {
            addCriterion("file_time <", value, "fileTime");
            return (Criteria) this;
        }

        public Criteria andFileTimeLessThanOrEqualTo(Date value) {
            addCriterion("file_time <=", value, "fileTime");
            return (Criteria) this;
        }

        public Criteria andFileTimeIn(List<Date> values) {
            addCriterion("file_time in", values, "fileTime");
            return (Criteria) this;
        }

        public Criteria andFileTimeNotIn(List<Date> values) {
            addCriterion("file_time not in", values, "fileTime");
            return (Criteria) this;
        }

        public Criteria andFileTimeBetween(Date value1, Date value2) {
            addCriterion("file_time between", value1, value2, "fileTime");
            return (Criteria) this;
        }

        public Criteria andFileTimeNotBetween(Date value1, Date value2) {
            addCriterion("file_time not between", value1, value2, "fileTime");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andFileKeyIsNull() {
            addCriterion("file_key is null");
            return (Criteria) this;
        }

        public Criteria andFileKeyIsNotNull() {
            addCriterion("file_key is not null");
            return (Criteria) this;
        }

        public Criteria andFileKeyEqualTo(String value) {
            addCriterion("file_key =", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyNotEqualTo(String value) {
            addCriterion("file_key <>", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyGreaterThan(String value) {
            addCriterion("file_key >", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyGreaterThanOrEqualTo(String value) {
            addCriterion("file_key >=", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyLessThan(String value) {
            addCriterion("file_key <", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyLessThanOrEqualTo(String value) {
            addCriterion("file_key <=", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyLike(String value) {
            addCriterion("file_key like", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyNotLike(String value) {
            addCriterion("file_key not like", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyIn(List<String> values) {
            addCriterion("file_key in", values, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyNotIn(List<String> values) {
            addCriterion("file_key not in", values, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyBetween(String value1, String value2) {
            addCriterion("file_key between", value1, value2, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyNotBetween(String value1, String value2) {
            addCriterion("file_key not between", value1, value2, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Integer value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Integer value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Integer value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Integer value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Integer value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Integer> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Integer> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Integer value1, Integer value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileClassIsNull() {
            addCriterion("file_class is null");
            return (Criteria) this;
        }

        public Criteria andFileClassIsNotNull() {
            addCriterion("file_class is not null");
            return (Criteria) this;
        }

        public Criteria andFileClassEqualTo(String value) {
            addCriterion("file_class =", value, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassNotEqualTo(String value) {
            addCriterion("file_class <>", value, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassGreaterThan(String value) {
            addCriterion("file_class >", value, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassGreaterThanOrEqualTo(String value) {
            addCriterion("file_class >=", value, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassLessThan(String value) {
            addCriterion("file_class <", value, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassLessThanOrEqualTo(String value) {
            addCriterion("file_class <=", value, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassLike(String value) {
            addCriterion("file_class like", value, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassNotLike(String value) {
            addCriterion("file_class not like", value, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassIn(List<String> values) {
            addCriterion("file_class in", values, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassNotIn(List<String> values) {
            addCriterion("file_class not in", values, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassBetween(String value1, String value2) {
            addCriterion("file_class between", value1, value2, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileClassNotBetween(String value1, String value2) {
            addCriterion("file_class not between", value1, value2, "fileClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassIsNull() {
            addCriterion("file_second_class is null");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassIsNotNull() {
            addCriterion("file_second_class is not null");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassEqualTo(String value) {
            addCriterion("file_second_class =", value, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassNotEqualTo(String value) {
            addCriterion("file_second_class <>", value, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassGreaterThan(String value) {
            addCriterion("file_second_class >", value, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassGreaterThanOrEqualTo(String value) {
            addCriterion("file_second_class >=", value, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassLessThan(String value) {
            addCriterion("file_second_class <", value, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassLessThanOrEqualTo(String value) {
            addCriterion("file_second_class <=", value, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassLike(String value) {
            addCriterion("file_second_class like", value, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassNotLike(String value) {
            addCriterion("file_second_class not like", value, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassIn(List<String> values) {
            addCriterion("file_second_class in", values, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassNotIn(List<String> values) {
            addCriterion("file_second_class not in", values, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassBetween(String value1, String value2) {
            addCriterion("file_second_class between", value1, value2, "fileSecondClass");
            return (Criteria) this;
        }

        public Criteria andFileSecondClassNotBetween(String value1, String value2) {
            addCriterion("file_second_class not between", value1, value2, "fileSecondClass");
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
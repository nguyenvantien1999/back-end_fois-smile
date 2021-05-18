package com.fois.Back_end_fois_smile.entity;

import java.util.ArrayList;
import java.util.List;

public class KindOfQuestionExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public KindOfQuestionExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andMaloaichIsNull() {
            addCriterion("maloaich is null");
            return (Criteria) this;
        }

        public Criteria andMaloaichIsNotNull() {
            addCriterion("maloaich is not null");
            return (Criteria) this;
        }

        public Criteria andMaloaichEqualTo(String value) {
            addCriterion("maloaich =", value, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichNotEqualTo(String value) {
            addCriterion("maloaich <>", value, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichGreaterThan(String value) {
            addCriterion("maloaich >", value, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichGreaterThanOrEqualTo(String value) {
            addCriterion("maloaich >=", value, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichLessThan(String value) {
            addCriterion("maloaich <", value, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichLessThanOrEqualTo(String value) {
            addCriterion("maloaich <=", value, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichLike(String value) {
            addCriterion("maloaich like", value, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichNotLike(String value) {
            addCriterion("maloaich not like", value, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichIn(List<String> values) {
            addCriterion("maloaich in", values, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichNotIn(List<String> values) {
            addCriterion("maloaich not in", values, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichBetween(String value1, String value2) {
            addCriterion("maloaich between", value1, value2, "maloaich");
            return (Criteria) this;
        }

        public Criteria andMaloaichNotBetween(String value1, String value2) {
            addCriterion("maloaich not between", value1, value2, "maloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichIsNull() {
            addCriterion("tenloaich is null");
            return (Criteria) this;
        }

        public Criteria andTenloaichIsNotNull() {
            addCriterion("tenloaich is not null");
            return (Criteria) this;
        }

        public Criteria andTenloaichEqualTo(String value) {
            addCriterion("tenloaich =", value, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichNotEqualTo(String value) {
            addCriterion("tenloaich <>", value, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichGreaterThan(String value) {
            addCriterion("tenloaich >", value, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichGreaterThanOrEqualTo(String value) {
            addCriterion("tenloaich >=", value, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichLessThan(String value) {
            addCriterion("tenloaich <", value, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichLessThanOrEqualTo(String value) {
            addCriterion("tenloaich <=", value, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichLike(String value) {
            addCriterion("tenloaich like", value, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichNotLike(String value) {
            addCriterion("tenloaich not like", value, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichIn(List<String> values) {
            addCriterion("tenloaich in", values, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichNotIn(List<String> values) {
            addCriterion("tenloaich not in", values, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichBetween(String value1, String value2) {
            addCriterion("tenloaich between", value1, value2, "tenloaich");
            return (Criteria) this;
        }

        public Criteria andTenloaichNotBetween(String value1, String value2) {
            addCriterion("tenloaich not between", value1, value2, "tenloaich");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.kind_of_question
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
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

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table schema01.kind_of_question
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 19 10:22:03 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}
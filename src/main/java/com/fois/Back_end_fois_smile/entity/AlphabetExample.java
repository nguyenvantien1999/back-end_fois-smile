package com.fois.Back_end_fois_smile.entity;

import java.util.ArrayList;
import java.util.List;

public class AlphabetExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public AlphabetExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
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

        public Criteria andMabangIsNull() {
            addCriterion("mabang is null");
            return (Criteria) this;
        }

        public Criteria andMabangIsNotNull() {
            addCriterion("mabang is not null");
            return (Criteria) this;
        }

        public Criteria andMabangEqualTo(String value) {
            addCriterion("mabang =", value, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangNotEqualTo(String value) {
            addCriterion("mabang <>", value, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangGreaterThan(String value) {
            addCriterion("mabang >", value, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangGreaterThanOrEqualTo(String value) {
            addCriterion("mabang >=", value, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangLessThan(String value) {
            addCriterion("mabang <", value, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangLessThanOrEqualTo(String value) {
            addCriterion("mabang <=", value, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangLike(String value) {
            addCriterion("mabang like", value, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangNotLike(String value) {
            addCriterion("mabang not like", value, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangIn(List<String> values) {
            addCriterion("mabang in", values, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangNotIn(List<String> values) {
            addCriterion("mabang not in", values, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangBetween(String value1, String value2) {
            addCriterion("mabang between", value1, value2, "mabang");
            return (Criteria) this;
        }

        public Criteria andMabangNotBetween(String value1, String value2) {
            addCriterion("mabang not between", value1, value2, "mabang");
            return (Criteria) this;
        }

        public Criteria andTenbangIsNull() {
            addCriterion("tenbang is null");
            return (Criteria) this;
        }

        public Criteria andTenbangIsNotNull() {
            addCriterion("tenbang is not null");
            return (Criteria) this;
        }

        public Criteria andTenbangEqualTo(String value) {
            addCriterion("tenbang =", value, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangNotEqualTo(String value) {
            addCriterion("tenbang <>", value, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangGreaterThan(String value) {
            addCriterion("tenbang >", value, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangGreaterThanOrEqualTo(String value) {
            addCriterion("tenbang >=", value, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangLessThan(String value) {
            addCriterion("tenbang <", value, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangLessThanOrEqualTo(String value) {
            addCriterion("tenbang <=", value, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangLike(String value) {
            addCriterion("tenbang like", value, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangNotLike(String value) {
            addCriterion("tenbang not like", value, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangIn(List<String> values) {
            addCriterion("tenbang in", values, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangNotIn(List<String> values) {
            addCriterion("tenbang not in", values, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangBetween(String value1, String value2) {
            addCriterion("tenbang between", value1, value2, "tenbang");
            return (Criteria) this;
        }

        public Criteria andTenbangNotBetween(String value1, String value2) {
            addCriterion("tenbang not between", value1, value2, "tenbang");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.alphabet
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
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
     * This class corresponds to the database table schema01.alphabet
     *
     * @mbg.generated do_not_delete_during_merge Wed Mar 31 06:58:33 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}
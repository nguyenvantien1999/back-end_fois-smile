package com.fois.Back_end_fois_smile.entity;

import java.util.ArrayList;
import java.util.List;

public class VocabularyExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public VocabularyExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
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

        public Criteria andMatvIsNull() {
            addCriterion("matv is null");
            return (Criteria) this;
        }

        public Criteria andMatvIsNotNull() {
            addCriterion("matv is not null");
            return (Criteria) this;
        }

        public Criteria andMatvEqualTo(String value) {
            addCriterion("matv =", value, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvNotEqualTo(String value) {
            addCriterion("matv <>", value, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvGreaterThan(String value) {
            addCriterion("matv >", value, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvGreaterThanOrEqualTo(String value) {
            addCriterion("matv >=", value, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvLessThan(String value) {
            addCriterion("matv <", value, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvLessThanOrEqualTo(String value) {
            addCriterion("matv <=", value, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvLike(String value) {
            addCriterion("matv like", value, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvNotLike(String value) {
            addCriterion("matv not like", value, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvIn(List<String> values) {
            addCriterion("matv in", values, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvNotIn(List<String> values) {
            addCriterion("matv not in", values, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvBetween(String value1, String value2) {
            addCriterion("matv between", value1, value2, "matv");
            return (Criteria) this;
        }

        public Criteria andMatvNotBetween(String value1, String value2) {
            addCriterion("matv not between", value1, value2, "matv");
            return (Criteria) this;
        }

        public Criteria andTentvIsNull() {
            addCriterion("tentv is null");
            return (Criteria) this;
        }

        public Criteria andTentvIsNotNull() {
            addCriterion("tentv is not null");
            return (Criteria) this;
        }

        public Criteria andTentvEqualTo(String value) {
            addCriterion("tentv =", value, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvNotEqualTo(String value) {
            addCriterion("tentv <>", value, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvGreaterThan(String value) {
            addCriterion("tentv >", value, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvGreaterThanOrEqualTo(String value) {
            addCriterion("tentv >=", value, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvLessThan(String value) {
            addCriterion("tentv <", value, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvLessThanOrEqualTo(String value) {
            addCriterion("tentv <=", value, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvLike(String value) {
            addCriterion("tentv like", value, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvNotLike(String value) {
            addCriterion("tentv not like", value, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvIn(List<String> values) {
            addCriterion("tentv in", values, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvNotIn(List<String> values) {
            addCriterion("tentv not in", values, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvBetween(String value1, String value2) {
            addCriterion("tentv between", value1, value2, "tentv");
            return (Criteria) this;
        }

        public Criteria andTentvNotBetween(String value1, String value2) {
            addCriterion("tentv not between", value1, value2, "tentv");
            return (Criteria) this;
        }

        public Criteria andNghiaIsNull() {
            addCriterion("nghia is null");
            return (Criteria) this;
        }

        public Criteria andNghiaIsNotNull() {
            addCriterion("nghia is not null");
            return (Criteria) this;
        }

        public Criteria andNghiaEqualTo(String value) {
            addCriterion("nghia =", value, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaNotEqualTo(String value) {
            addCriterion("nghia <>", value, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaGreaterThan(String value) {
            addCriterion("nghia >", value, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaGreaterThanOrEqualTo(String value) {
            addCriterion("nghia >=", value, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaLessThan(String value) {
            addCriterion("nghia <", value, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaLessThanOrEqualTo(String value) {
            addCriterion("nghia <=", value, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaLike(String value) {
            addCriterion("nghia like", value, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaNotLike(String value) {
            addCriterion("nghia not like", value, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaIn(List<String> values) {
            addCriterion("nghia in", values, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaNotIn(List<String> values) {
            addCriterion("nghia not in", values, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaBetween(String value1, String value2) {
            addCriterion("nghia between", value1, value2, "nghia");
            return (Criteria) this;
        }

        public Criteria andNghiaNotBetween(String value1, String value2) {
            addCriterion("nghia not between", value1, value2, "nghia");
            return (Criteria) this;
        }

        public Criteria andMabhIsNull() {
            addCriterion("mabh is null");
            return (Criteria) this;
        }

        public Criteria andMabhIsNotNull() {
            addCriterion("mabh is not null");
            return (Criteria) this;
        }

        public Criteria andMabhEqualTo(String value) {
            addCriterion("mabh =", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhNotEqualTo(String value) {
            addCriterion("mabh <>", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhGreaterThan(String value) {
            addCriterion("mabh >", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhGreaterThanOrEqualTo(String value) {
            addCriterion("mabh >=", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhLessThan(String value) {
            addCriterion("mabh <", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhLessThanOrEqualTo(String value) {
            addCriterion("mabh <=", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhLike(String value) {
            addCriterion("mabh like", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhNotLike(String value) {
            addCriterion("mabh not like", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhIn(List<String> values) {
            addCriterion("mabh in", values, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhNotIn(List<String> values) {
            addCriterion("mabh not in", values, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhBetween(String value1, String value2) {
            addCriterion("mabh between", value1, value2, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhNotBetween(String value1, String value2) {
            addCriterion("mabh not between", value1, value2, "mabh");
            return (Criteria) this;
        }

        public Criteria andTenkanjiIsNull() {
            addCriterion("tenkanji is null");
            return (Criteria) this;
        }

        public Criteria andTenkanjiIsNotNull() {
            addCriterion("tenkanji is not null");
            return (Criteria) this;
        }

        public Criteria andTenkanjiEqualTo(String value) {
            addCriterion("tenkanji =", value, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiNotEqualTo(String value) {
            addCriterion("tenkanji <>", value, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiGreaterThan(String value) {
            addCriterion("tenkanji >", value, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiGreaterThanOrEqualTo(String value) {
            addCriterion("tenkanji >=", value, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiLessThan(String value) {
            addCriterion("tenkanji <", value, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiLessThanOrEqualTo(String value) {
            addCriterion("tenkanji <=", value, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiLike(String value) {
            addCriterion("tenkanji like", value, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiNotLike(String value) {
            addCriterion("tenkanji not like", value, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiIn(List<String> values) {
            addCriterion("tenkanji in", values, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiNotIn(List<String> values) {
            addCriterion("tenkanji not in", values, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiBetween(String value1, String value2) {
            addCriterion("tenkanji between", value1, value2, "tenkanji");
            return (Criteria) this;
        }

        public Criteria andTenkanjiNotBetween(String value1, String value2) {
            addCriterion("tenkanji not between", value1, value2, "tenkanji");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.vocabulary
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
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
     * This class corresponds to the database table schema01.vocabulary
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 07 23:16:41 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}
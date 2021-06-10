package com.fois.Back_end_fois_smile.entity;

import java.util.ArrayList;
import java.util.List;

public class WordExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public WordExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.word
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.word
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

        public Criteria andMachuIsNull() {
            addCriterion("machu is null");
            return (Criteria) this;
        }

        public Criteria andMachuIsNotNull() {
            addCriterion("machu is not null");
            return (Criteria) this;
        }

        public Criteria andMachuEqualTo(String value) {
            addCriterion("machu =", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuNotEqualTo(String value) {
            addCriterion("machu <>", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuGreaterThan(String value) {
            addCriterion("machu >", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuGreaterThanOrEqualTo(String value) {
            addCriterion("machu >=", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuLessThan(String value) {
            addCriterion("machu <", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuLessThanOrEqualTo(String value) {
            addCriterion("machu <=", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuLike(String value) {
            addCriterion("machu like", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuNotLike(String value) {
            addCriterion("machu not like", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuIn(List<String> values) {
            addCriterion("machu in", values, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuNotIn(List<String> values) {
            addCriterion("machu not in", values, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuBetween(String value1, String value2) {
            addCriterion("machu between", value1, value2, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuNotBetween(String value1, String value2) {
            addCriterion("machu not between", value1, value2, "machu");
            return (Criteria) this;
        }

        public Criteria andTenchuIsNull() {
            addCriterion("tenchu is null");
            return (Criteria) this;
        }

        public Criteria andTenchuIsNotNull() {
            addCriterion("tenchu is not null");
            return (Criteria) this;
        }

        public Criteria andTenchuEqualTo(String value) {
            addCriterion("tenchu =", value, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuNotEqualTo(String value) {
            addCriterion("tenchu <>", value, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuGreaterThan(String value) {
            addCriterion("tenchu >", value, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuGreaterThanOrEqualTo(String value) {
            addCriterion("tenchu >=", value, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuLessThan(String value) {
            addCriterion("tenchu <", value, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuLessThanOrEqualTo(String value) {
            addCriterion("tenchu <=", value, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuLike(String value) {
            addCriterion("tenchu like", value, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuNotLike(String value) {
            addCriterion("tenchu not like", value, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuIn(List<String> values) {
            addCriterion("tenchu in", values, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuNotIn(List<String> values) {
            addCriterion("tenchu not in", values, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuBetween(String value1, String value2) {
            addCriterion("tenchu between", value1, value2, "tenchu");
            return (Criteria) this;
        }

        public Criteria andTenchuNotBetween(String value1, String value2) {
            addCriterion("tenchu not between", value1, value2, "tenchu");
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

        public Criteria andAmtietIsNull() {
            addCriterion("amtiet is null");
            return (Criteria) this;
        }

        public Criteria andAmtietIsNotNull() {
            addCriterion("amtiet is not null");
            return (Criteria) this;
        }

        public Criteria andAmtietEqualTo(String value) {
            addCriterion("amtiet =", value, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietNotEqualTo(String value) {
            addCriterion("amtiet <>", value, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietGreaterThan(String value) {
            addCriterion("amtiet >", value, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietGreaterThanOrEqualTo(String value) {
            addCriterion("amtiet >=", value, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietLessThan(String value) {
            addCriterion("amtiet <", value, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietLessThanOrEqualTo(String value) {
            addCriterion("amtiet <=", value, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietLike(String value) {
            addCriterion("amtiet like", value, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietNotLike(String value) {
            addCriterion("amtiet not like", value, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietIn(List<String> values) {
            addCriterion("amtiet in", values, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietNotIn(List<String> values) {
            addCriterion("amtiet not in", values, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietBetween(String value1, String value2) {
            addCriterion("amtiet between", value1, value2, "amtiet");
            return (Criteria) this;
        }

        public Criteria andAmtietNotBetween(String value1, String value2) {
            addCriterion("amtiet not between", value1, value2, "amtiet");
            return (Criteria) this;
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

        public Criteria andMaloaituIsNull() {
            addCriterion("maloaitu is null");
            return (Criteria) this;
        }

        public Criteria andMaloaituIsNotNull() {
            addCriterion("maloaitu is not null");
            return (Criteria) this;
        }

        public Criteria andMaloaituEqualTo(String value) {
            addCriterion("maloaitu =", value, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituNotEqualTo(String value) {
            addCriterion("maloaitu <>", value, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituGreaterThan(String value) {
            addCriterion("maloaitu >", value, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituGreaterThanOrEqualTo(String value) {
            addCriterion("maloaitu >=", value, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituLessThan(String value) {
            addCriterion("maloaitu <", value, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituLessThanOrEqualTo(String value) {
            addCriterion("maloaitu <=", value, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituLike(String value) {
            addCriterion("maloaitu like", value, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituNotLike(String value) {
            addCriterion("maloaitu not like", value, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituIn(List<String> values) {
            addCriterion("maloaitu in", values, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituNotIn(List<String> values) {
            addCriterion("maloaitu not in", values, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituBetween(String value1, String value2) {
            addCriterion("maloaitu between", value1, value2, "maloaitu");
            return (Criteria) this;
        }

        public Criteria andMaloaituNotBetween(String value1, String value2) {
            addCriterion("maloaitu not between", value1, value2, "maloaitu");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.word
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
     * This class corresponds to the database table schema01.word
     *
     * @mbg.generated do_not_delete_during_merge Wed Mar 31 06:58:33 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}
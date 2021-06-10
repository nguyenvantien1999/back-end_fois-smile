package com.fois.Back_end_fois_smile.entity;

import java.util.ArrayList;
import java.util.List;

public class AnswerExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public AnswerExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.answer
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

        public Criteria andMadaIsNull() {
            addCriterion("mada is null");
            return (Criteria) this;
        }

        public Criteria andMadaIsNotNull() {
            addCriterion("mada is not null");
            return (Criteria) this;
        }

        public Criteria andMadaEqualTo(String value) {
            addCriterion("mada =", value, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaNotEqualTo(String value) {
            addCriterion("mada <>", value, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaGreaterThan(String value) {
            addCriterion("mada >", value, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaGreaterThanOrEqualTo(String value) {
            addCriterion("mada >=", value, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaLessThan(String value) {
            addCriterion("mada <", value, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaLessThanOrEqualTo(String value) {
            addCriterion("mada <=", value, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaLike(String value) {
            addCriterion("mada like", value, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaNotLike(String value) {
            addCriterion("mada not like", value, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaIn(List<String> values) {
            addCriterion("mada in", values, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaNotIn(List<String> values) {
            addCriterion("mada not in", values, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaBetween(String value1, String value2) {
            addCriterion("mada between", value1, value2, "mada");
            return (Criteria) this;
        }

        public Criteria andMadaNotBetween(String value1, String value2) {
            addCriterion("mada not between", value1, value2, "mada");
            return (Criteria) this;
        }

        public Criteria andTendaIsNull() {
            addCriterion("tenda is null");
            return (Criteria) this;
        }

        public Criteria andTendaIsNotNull() {
            addCriterion("tenda is not null");
            return (Criteria) this;
        }

        public Criteria andTendaEqualTo(String value) {
            addCriterion("tenda =", value, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaNotEqualTo(String value) {
            addCriterion("tenda <>", value, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaGreaterThan(String value) {
            addCriterion("tenda >", value, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaGreaterThanOrEqualTo(String value) {
            addCriterion("tenda >=", value, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaLessThan(String value) {
            addCriterion("tenda <", value, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaLessThanOrEqualTo(String value) {
            addCriterion("tenda <=", value, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaLike(String value) {
            addCriterion("tenda like", value, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaNotLike(String value) {
            addCriterion("tenda not like", value, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaIn(List<String> values) {
            addCriterion("tenda in", values, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaNotIn(List<String> values) {
            addCriterion("tenda not in", values, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaBetween(String value1, String value2) {
            addCriterion("tenda between", value1, value2, "tenda");
            return (Criteria) this;
        }

        public Criteria andTendaNotBetween(String value1, String value2) {
            addCriterion("tenda not between", value1, value2, "tenda");
            return (Criteria) this;
        }

        public Criteria andMachcIsNull() {
            addCriterion("machc is null");
            return (Criteria) this;
        }

        public Criteria andMachcIsNotNull() {
            addCriterion("machc is not null");
            return (Criteria) this;
        }

        public Criteria andMachcEqualTo(String value) {
            addCriterion("machc =", value, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcNotEqualTo(String value) {
            addCriterion("machc <>", value, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcGreaterThan(String value) {
            addCriterion("machc >", value, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcGreaterThanOrEqualTo(String value) {
            addCriterion("machc >=", value, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcLessThan(String value) {
            addCriterion("machc <", value, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcLessThanOrEqualTo(String value) {
            addCriterion("machc <=", value, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcLike(String value) {
            addCriterion("machc like", value, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcNotLike(String value) {
            addCriterion("machc not like", value, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcIn(List<String> values) {
            addCriterion("machc in", values, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcNotIn(List<String> values) {
            addCriterion("machc not in", values, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcBetween(String value1, String value2) {
            addCriterion("machc between", value1, value2, "machc");
            return (Criteria) this;
        }

        public Criteria andMachcNotBetween(String value1, String value2) {
            addCriterion("machc not between", value1, value2, "machc");
            return (Criteria) this;
        }

        public Criteria andHinhanhIsNull() {
            addCriterion("hinhanh is null");
            return (Criteria) this;
        }

        public Criteria andHinhanhIsNotNull() {
            addCriterion("hinhanh is not null");
            return (Criteria) this;
        }

        public Criteria andHinhanhEqualTo(String value) {
            addCriterion("hinhanh =", value, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhNotEqualTo(String value) {
            addCriterion("hinhanh <>", value, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhGreaterThan(String value) {
            addCriterion("hinhanh >", value, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhGreaterThanOrEqualTo(String value) {
            addCriterion("hinhanh >=", value, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhLessThan(String value) {
            addCriterion("hinhanh <", value, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhLessThanOrEqualTo(String value) {
            addCriterion("hinhanh <=", value, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhLike(String value) {
            addCriterion("hinhanh like", value, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhNotLike(String value) {
            addCriterion("hinhanh not like", value, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhIn(List<String> values) {
            addCriterion("hinhanh in", values, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhNotIn(List<String> values) {
            addCriterion("hinhanh not in", values, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhBetween(String value1, String value2) {
            addCriterion("hinhanh between", value1, value2, "hinhanh");
            return (Criteria) this;
        }

        public Criteria andHinhanhNotBetween(String value1, String value2) {
            addCriterion("hinhanh not between", value1, value2, "hinhanh");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.answer
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
     * This class corresponds to the database table schema01.answer
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 12 14:23:57 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}
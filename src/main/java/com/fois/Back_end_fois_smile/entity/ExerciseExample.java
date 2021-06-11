package com.fois.Back_end_fois_smile.entity;

import java.util.ArrayList;
import java.util.List;

public class ExerciseExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public ExerciseExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.exercise
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.exercise
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

        public Criteria andMabtIsNull() {
            addCriterion("mabt is null");
            return (Criteria) this;
        }

        public Criteria andMabtIsNotNull() {
            addCriterion("mabt is not null");
            return (Criteria) this;
        }

        public Criteria andMabtEqualTo(String value) {
            addCriterion("mabt =", value, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtNotEqualTo(String value) {
            addCriterion("mabt <>", value, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtGreaterThan(String value) {
            addCriterion("mabt >", value, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtGreaterThanOrEqualTo(String value) {
            addCriterion("mabt >=", value, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtLessThan(String value) {
            addCriterion("mabt <", value, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtLessThanOrEqualTo(String value) {
            addCriterion("mabt <=", value, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtLike(String value) {
            addCriterion("mabt like", value, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtNotLike(String value) {
            addCriterion("mabt not like", value, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtIn(List<String> values) {
            addCriterion("mabt in", values, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtNotIn(List<String> values) {
            addCriterion("mabt not in", values, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtBetween(String value1, String value2) {
            addCriterion("mabt between", value1, value2, "mabt");
            return (Criteria) this;
        }

        public Criteria andMabtNotBetween(String value1, String value2) {
            addCriterion("mabt not between", value1, value2, "mabt");
            return (Criteria) this;
        }

        public Criteria andTenbtIsNull() {
            addCriterion("tenbt is null");
            return (Criteria) this;
        }

        public Criteria andTenbtIsNotNull() {
            addCriterion("tenbt is not null");
            return (Criteria) this;
        }

        public Criteria andTenbtEqualTo(String value) {
            addCriterion("tenbt =", value, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtNotEqualTo(String value) {
            addCriterion("tenbt <>", value, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtGreaterThan(String value) {
            addCriterion("tenbt >", value, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtGreaterThanOrEqualTo(String value) {
            addCriterion("tenbt >=", value, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtLessThan(String value) {
            addCriterion("tenbt <", value, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtLessThanOrEqualTo(String value) {
            addCriterion("tenbt <=", value, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtLike(String value) {
            addCriterion("tenbt like", value, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtNotLike(String value) {
            addCriterion("tenbt not like", value, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtIn(List<String> values) {
            addCriterion("tenbt in", values, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtNotIn(List<String> values) {
            addCriterion("tenbt not in", values, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtBetween(String value1, String value2) {
            addCriterion("tenbt between", value1, value2, "tenbt");
            return (Criteria) this;
        }

        public Criteria andTenbtNotBetween(String value1, String value2) {
            addCriterion("tenbt not between", value1, value2, "tenbt");
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
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.exercise
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
     * This class corresponds to the database table schema01.exercise
     *
     * @mbg.generated do_not_delete_during_merge Thu Jun 10 20:33:02 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}
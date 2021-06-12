package com.fois.Back_end_fois_smile.entity;

import java.util.ArrayList;
import java.util.List;

public class StructureExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public StructureExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
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

        public Criteria andMactIsNull() {
            addCriterion("mact is null");
            return (Criteria) this;
        }

        public Criteria andMactIsNotNull() {
            addCriterion("mact is not null");
            return (Criteria) this;
        }

        public Criteria andMactEqualTo(String value) {
            addCriterion("mact =", value, "mact");
            return (Criteria) this;
        }

        public Criteria andMactNotEqualTo(String value) {
            addCriterion("mact <>", value, "mact");
            return (Criteria) this;
        }

        public Criteria andMactGreaterThan(String value) {
            addCriterion("mact >", value, "mact");
            return (Criteria) this;
        }

        public Criteria andMactGreaterThanOrEqualTo(String value) {
            addCriterion("mact >=", value, "mact");
            return (Criteria) this;
        }

        public Criteria andMactLessThan(String value) {
            addCriterion("mact <", value, "mact");
            return (Criteria) this;
        }

        public Criteria andMactLessThanOrEqualTo(String value) {
            addCriterion("mact <=", value, "mact");
            return (Criteria) this;
        }

        public Criteria andMactLike(String value) {
            addCriterion("mact like", value, "mact");
            return (Criteria) this;
        }

        public Criteria andMactNotLike(String value) {
            addCriterion("mact not like", value, "mact");
            return (Criteria) this;
        }

        public Criteria andMactIn(List<String> values) {
            addCriterion("mact in", values, "mact");
            return (Criteria) this;
        }

        public Criteria andMactNotIn(List<String> values) {
            addCriterion("mact not in", values, "mact");
            return (Criteria) this;
        }

        public Criteria andMactBetween(String value1, String value2) {
            addCriterion("mact between", value1, value2, "mact");
            return (Criteria) this;
        }

        public Criteria andMactNotBetween(String value1, String value2) {
            addCriterion("mact not between", value1, value2, "mact");
            return (Criteria) this;
        }

        public Criteria andTenctIsNull() {
            addCriterion("tenct is null");
            return (Criteria) this;
        }

        public Criteria andTenctIsNotNull() {
            addCriterion("tenct is not null");
            return (Criteria) this;
        }

        public Criteria andTenctEqualTo(String value) {
            addCriterion("tenct =", value, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctNotEqualTo(String value) {
            addCriterion("tenct <>", value, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctGreaterThan(String value) {
            addCriterion("tenct >", value, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctGreaterThanOrEqualTo(String value) {
            addCriterion("tenct >=", value, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctLessThan(String value) {
            addCriterion("tenct <", value, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctLessThanOrEqualTo(String value) {
            addCriterion("tenct <=", value, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctLike(String value) {
            addCriterion("tenct like", value, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctNotLike(String value) {
            addCriterion("tenct not like", value, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctIn(List<String> values) {
            addCriterion("tenct in", values, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctNotIn(List<String> values) {
            addCriterion("tenct not in", values, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctBetween(String value1, String value2) {
            addCriterion("tenct between", value1, value2, "tenct");
            return (Criteria) this;
        }

        public Criteria andTenctNotBetween(String value1, String value2) {
            addCriterion("tenct not between", value1, value2, "tenct");
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

        public Criteria andChuyIsNull() {
            addCriterion("chuy is null");
            return (Criteria) this;
        }

        public Criteria andChuyIsNotNull() {
            addCriterion("chuy is not null");
            return (Criteria) this;
        }

        public Criteria andChuyEqualTo(String value) {
            addCriterion("chuy =", value, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyNotEqualTo(String value) {
            addCriterion("chuy <>", value, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyGreaterThan(String value) {
            addCriterion("chuy >", value, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyGreaterThanOrEqualTo(String value) {
            addCriterion("chuy >=", value, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyLessThan(String value) {
            addCriterion("chuy <", value, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyLessThanOrEqualTo(String value) {
            addCriterion("chuy <=", value, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyLike(String value) {
            addCriterion("chuy like", value, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyNotLike(String value) {
            addCriterion("chuy not like", value, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyIn(List<String> values) {
            addCriterion("chuy in", values, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyNotIn(List<String> values) {
            addCriterion("chuy not in", values, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyBetween(String value1, String value2) {
            addCriterion("chuy between", value1, value2, "chuy");
            return (Criteria) this;
        }

        public Criteria andChuyNotBetween(String value1, String value2) {
            addCriterion("chuy not between", value1, value2, "chuy");
            return (Criteria) this;
        }

        public Criteria andManpIsNull() {
            addCriterion("manp is null");
            return (Criteria) this;
        }

        public Criteria andManpIsNotNull() {
            addCriterion("manp is not null");
            return (Criteria) this;
        }

        public Criteria andManpEqualTo(String value) {
            addCriterion("manp =", value, "manp");
            return (Criteria) this;
        }

        public Criteria andManpNotEqualTo(String value) {
            addCriterion("manp <>", value, "manp");
            return (Criteria) this;
        }

        public Criteria andManpGreaterThan(String value) {
            addCriterion("manp >", value, "manp");
            return (Criteria) this;
        }

        public Criteria andManpGreaterThanOrEqualTo(String value) {
            addCriterion("manp >=", value, "manp");
            return (Criteria) this;
        }

        public Criteria andManpLessThan(String value) {
            addCriterion("manp <", value, "manp");
            return (Criteria) this;
        }

        public Criteria andManpLessThanOrEqualTo(String value) {
            addCriterion("manp <=", value, "manp");
            return (Criteria) this;
        }

        public Criteria andManpLike(String value) {
            addCriterion("manp like", value, "manp");
            return (Criteria) this;
        }

        public Criteria andManpNotLike(String value) {
            addCriterion("manp not like", value, "manp");
            return (Criteria) this;
        }

        public Criteria andManpIn(List<String> values) {
            addCriterion("manp in", values, "manp");
            return (Criteria) this;
        }

        public Criteria andManpNotIn(List<String> values) {
            addCriterion("manp not in", values, "manp");
            return (Criteria) this;
        }

        public Criteria andManpBetween(String value1, String value2) {
            addCriterion("manp between", value1, value2, "manp");
            return (Criteria) this;
        }

        public Criteria andManpNotBetween(String value1, String value2) {
            addCriterion("manp not between", value1, value2, "manp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.structure
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
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
     * This class corresponds to the database table schema01.structure
     *
     * @mbg.generated do_not_delete_during_merge Fri Apr 09 11:56:10 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}
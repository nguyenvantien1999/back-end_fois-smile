package com.fois.Back_end_fois_smile.entity;

import java.util.ArrayList;
import java.util.List;

public class KaiwaContentExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public KaiwaContentExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa_content
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.kaiwa_content
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

        public Criteria andMandIsNull() {
            addCriterion("mand is null");
            return (Criteria) this;
        }

        public Criteria andMandIsNotNull() {
            addCriterion("mand is not null");
            return (Criteria) this;
        }

        public Criteria andMandEqualTo(String value) {
            addCriterion("mand =", value, "mand");
            return (Criteria) this;
        }

        public Criteria andMandNotEqualTo(String value) {
            addCriterion("mand <>", value, "mand");
            return (Criteria) this;
        }

        public Criteria andMandGreaterThan(String value) {
            addCriterion("mand >", value, "mand");
            return (Criteria) this;
        }

        public Criteria andMandGreaterThanOrEqualTo(String value) {
            addCriterion("mand >=", value, "mand");
            return (Criteria) this;
        }

        public Criteria andMandLessThan(String value) {
            addCriterion("mand <", value, "mand");
            return (Criteria) this;
        }

        public Criteria andMandLessThanOrEqualTo(String value) {
            addCriterion("mand <=", value, "mand");
            return (Criteria) this;
        }

        public Criteria andMandLike(String value) {
            addCriterion("mand like", value, "mand");
            return (Criteria) this;
        }

        public Criteria andMandNotLike(String value) {
            addCriterion("mand not like", value, "mand");
            return (Criteria) this;
        }

        public Criteria andMandIn(List<String> values) {
            addCriterion("mand in", values, "mand");
            return (Criteria) this;
        }

        public Criteria andMandNotIn(List<String> values) {
            addCriterion("mand not in", values, "mand");
            return (Criteria) this;
        }

        public Criteria andMandBetween(String value1, String value2) {
            addCriterion("mand between", value1, value2, "mand");
            return (Criteria) this;
        }

        public Criteria andMandNotBetween(String value1, String value2) {
            addCriterion("mand not between", value1, value2, "mand");
            return (Criteria) this;
        }

        public Criteria andNoidungIsNull() {
            addCriterion("noidung is null");
            return (Criteria) this;
        }

        public Criteria andNoidungIsNotNull() {
            addCriterion("noidung is not null");
            return (Criteria) this;
        }

        public Criteria andNoidungEqualTo(String value) {
            addCriterion("noidung =", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotEqualTo(String value) {
            addCriterion("noidung <>", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungGreaterThan(String value) {
            addCriterion("noidung >", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungGreaterThanOrEqualTo(String value) {
            addCriterion("noidung >=", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungLessThan(String value) {
            addCriterion("noidung <", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungLessThanOrEqualTo(String value) {
            addCriterion("noidung <=", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungLike(String value) {
            addCriterion("noidung like", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotLike(String value) {
            addCriterion("noidung not like", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungIn(List<String> values) {
            addCriterion("noidung in", values, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotIn(List<String> values) {
            addCriterion("noidung not in", values, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungBetween(String value1, String value2) {
            addCriterion("noidung between", value1, value2, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotBetween(String value1, String value2) {
            addCriterion("noidung not between", value1, value2, "noidung");
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

        public Criteria andLinkaudioIsNull() {
            addCriterion("linkaudio is null");
            return (Criteria) this;
        }

        public Criteria andLinkaudioIsNotNull() {
            addCriterion("linkaudio is not null");
            return (Criteria) this;
        }

        public Criteria andLinkaudioEqualTo(String value) {
            addCriterion("linkaudio =", value, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioNotEqualTo(String value) {
            addCriterion("linkaudio <>", value, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioGreaterThan(String value) {
            addCriterion("linkaudio >", value, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioGreaterThanOrEqualTo(String value) {
            addCriterion("linkaudio >=", value, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioLessThan(String value) {
            addCriterion("linkaudio <", value, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioLessThanOrEqualTo(String value) {
            addCriterion("linkaudio <=", value, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioLike(String value) {
            addCriterion("linkaudio like", value, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioNotLike(String value) {
            addCriterion("linkaudio not like", value, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioIn(List<String> values) {
            addCriterion("linkaudio in", values, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioNotIn(List<String> values) {
            addCriterion("linkaudio not in", values, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioBetween(String value1, String value2) {
            addCriterion("linkaudio between", value1, value2, "linkaudio");
            return (Criteria) this;
        }

        public Criteria andLinkaudioNotBetween(String value1, String value2) {
            addCriterion("linkaudio not between", value1, value2, "linkaudio");
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

        public Criteria andMahtIsNull() {
            addCriterion("maht is null");
            return (Criteria) this;
        }

        public Criteria andMahtIsNotNull() {
            addCriterion("maht is not null");
            return (Criteria) this;
        }

        public Criteria andMahtEqualTo(String value) {
            addCriterion("maht =", value, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtNotEqualTo(String value) {
            addCriterion("maht <>", value, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtGreaterThan(String value) {
            addCriterion("maht >", value, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtGreaterThanOrEqualTo(String value) {
            addCriterion("maht >=", value, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtLessThan(String value) {
            addCriterion("maht <", value, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtLessThanOrEqualTo(String value) {
            addCriterion("maht <=", value, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtLike(String value) {
            addCriterion("maht like", value, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtNotLike(String value) {
            addCriterion("maht not like", value, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtIn(List<String> values) {
            addCriterion("maht in", values, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtNotIn(List<String> values) {
            addCriterion("maht not in", values, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtBetween(String value1, String value2) {
            addCriterion("maht between", value1, value2, "maht");
            return (Criteria) this;
        }

        public Criteria andMahtNotBetween(String value1, String value2) {
            addCriterion("maht not between", value1, value2, "maht");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.kaiwa_content
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
     * This class corresponds to the database table schema01.kaiwa_content
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 14 16:19:03 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}
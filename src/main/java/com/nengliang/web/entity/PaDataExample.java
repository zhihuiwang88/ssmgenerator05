package com.nengliang.web.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PaDataExample  {
    /**
     * pa_data
     */
    protected String orderByClause;

    /**
     * pa_data
     */
    protected boolean distinct;

    /**
     * pa_data
     */
    protected List<Criteria> oredCriteria;

    /**
     * PaDataExample
     */
    public PaDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * setOrderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 内部类
     */
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
                return;
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                return;
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                return;
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("session_id like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("session_id not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdIsNull() {
            addCriterion("data_obj_id is null");
            return (Criteria) this;
        }

        public Criteria andDataObjIdIsNotNull() {
            addCriterion("data_obj_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataObjIdEqualTo(String value) {
            addCriterion("data_obj_id =", value, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdNotEqualTo(String value) {
            addCriterion("data_obj_id <>", value, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdGreaterThan(String value) {
            addCriterion("data_obj_id >", value, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_obj_id >=", value, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdLessThan(String value) {
            addCriterion("data_obj_id <", value, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdLessThanOrEqualTo(String value) {
            addCriterion("data_obj_id <=", value, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdLike(String value) {
            addCriterion("data_obj_id like", value, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdNotLike(String value) {
            addCriterion("data_obj_id not like", value, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdIn(List<String> values) {
            addCriterion("data_obj_id in", values, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdNotIn(List<String> values) {
            addCriterion("data_obj_id not in", values, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdBetween(String value1, String value2) {
            addCriterion("data_obj_id between", value1, value2, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andDataObjIdNotBetween(String value1, String value2) {
            addCriterion("data_obj_id not between", value1, value2, "dataObjId");
            return (Criteria) this;
        }

        public Criteria andConditionesIsNull() {
            addCriterion("conditiones is null");
            return (Criteria) this;
        }

        public Criteria andConditionesIsNotNull() {
            addCriterion("conditiones is not null");
            return (Criteria) this;
        }

        public Criteria andConditionesEqualTo(String value) {
            addCriterion("conditiones =", value, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesNotEqualTo(String value) {
            addCriterion("conditiones <>", value, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesGreaterThan(String value) {
            addCriterion("conditiones >", value, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesGreaterThanOrEqualTo(String value) {
            addCriterion("conditiones >=", value, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesLessThan(String value) {
            addCriterion("conditiones <", value, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesLessThanOrEqualTo(String value) {
            addCriterion("conditiones <=", value, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesLike(String value) {
            addCriterion("conditiones like", value, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesNotLike(String value) {
            addCriterion("conditiones not like", value, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesIn(List<String> values) {
            addCriterion("conditiones in", values, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesNotIn(List<String> values) {
            addCriterion("conditiones not in", values, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesBetween(String value1, String value2) {
            addCriterion("conditiones between", value1, value2, "conditiones");
            return (Criteria) this;
        }

        public Criteria andConditionesNotBetween(String value1, String value2) {
            addCriterion("conditiones not between", value1, value2, "conditiones");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNull() {
            addCriterion("order_by is null");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNotNull() {
            addCriterion("order_by is not null");
            return (Criteria) this;
        }

        public Criteria andOrderByEqualTo(String value) {
            addCriterion("order_by =", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotEqualTo(String value) {
            addCriterion("order_by <>", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThan(String value) {
            addCriterion("order_by >", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThanOrEqualTo(String value) {
            addCriterion("order_by >=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThan(String value) {
            addCriterion("order_by <", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThanOrEqualTo(String value) {
            addCriterion("order_by <=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLike(String value) {
            addCriterion("order_by like", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotLike(String value) {
            addCriterion("order_by not like", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByIn(List<String> values) {
            addCriterion("order_by in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotIn(List<String> values) {
            addCriterion("order_by not in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByBetween(String value1, String value2) {
            addCriterion("order_by between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotBetween(String value1, String value2) {
            addCriterion("order_by not between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andFieldesIsNull() {
            addCriterion("fieldes is null");
            return (Criteria) this;
        }

        public Criteria andFieldesIsNotNull() {
            addCriterion("fieldes is not null");
            return (Criteria) this;
        }

        public Criteria andFieldesEqualTo(String value) {
            addCriterion("fieldes =", value, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesNotEqualTo(String value) {
            addCriterion("fieldes <>", value, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesGreaterThan(String value) {
            addCriterion("fieldes >", value, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesGreaterThanOrEqualTo(String value) {
            addCriterion("fieldes >=", value, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesLessThan(String value) {
            addCriterion("fieldes <", value, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesLessThanOrEqualTo(String value) {
            addCriterion("fieldes <=", value, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesLike(String value) {
            addCriterion("fieldes like", value, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesNotLike(String value) {
            addCriterion("fieldes not like", value, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesIn(List<String> values) {
            addCriterion("fieldes in", values, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesNotIn(List<String> values) {
            addCriterion("fieldes not in", values, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesBetween(String value1, String value2) {
            addCriterion("fieldes between", value1, value2, "fieldes");
            return (Criteria) this;
        }

        public Criteria andFieldesNotBetween(String value1, String value2) {
            addCriterion("fieldes not between", value1, value2, "fieldes");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 内部类
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
}
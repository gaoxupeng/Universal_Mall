package com.mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class SpecParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecParamExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNumericIsNull() {
            addCriterion("numeric is null");
            return (Criteria) this;
        }

        public Criteria andNumericIsNotNull() {
            addCriterion("numeric is not null");
            return (Criteria) this;
        }

        public Criteria andNumericEqualTo(Boolean value) {
            addCriterion("numeric =", value, "numeric");
            return (Criteria) this;
        }

        public Criteria andNumericNotEqualTo(Boolean value) {
            addCriterion("numeric <>", value, "numeric");
            return (Criteria) this;
        }

        public Criteria andNumericGreaterThan(Boolean value) {
            addCriterion("numeric >", value, "numeric");
            return (Criteria) this;
        }

        public Criteria andNumericGreaterThanOrEqualTo(Boolean value) {
            addCriterion("numeric >=", value, "numeric");
            return (Criteria) this;
        }

        public Criteria andNumericLessThan(Boolean value) {
            addCriterion("numeric <", value, "numeric");
            return (Criteria) this;
        }

        public Criteria andNumericLessThanOrEqualTo(Boolean value) {
            addCriterion("numeric <=", value, "numeric");
            return (Criteria) this;
        }

        public Criteria andNumericIn(List<Boolean> values) {
            addCriterion("numeric in", values, "numeric");
            return (Criteria) this;
        }

        public Criteria andNumericNotIn(List<Boolean> values) {
            addCriterion("numeric not in", values, "numeric");
            return (Criteria) this;
        }

        public Criteria andNumericBetween(Boolean value1, Boolean value2) {
            addCriterion("numeric between", value1, value2, "numeric");
            return (Criteria) this;
        }

        public Criteria andNumericNotBetween(Boolean value1, Boolean value2) {
            addCriterion("numeric not between", value1, value2, "numeric");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andGenericIsNull() {
            addCriterion("generic is null");
            return (Criteria) this;
        }

        public Criteria andGenericIsNotNull() {
            addCriterion("generic is not null");
            return (Criteria) this;
        }

        public Criteria andGenericEqualTo(Boolean value) {
            addCriterion("generic =", value, "generic");
            return (Criteria) this;
        }

        public Criteria andGenericNotEqualTo(Boolean value) {
            addCriterion("generic <>", value, "generic");
            return (Criteria) this;
        }

        public Criteria andGenericGreaterThan(Boolean value) {
            addCriterion("generic >", value, "generic");
            return (Criteria) this;
        }

        public Criteria andGenericGreaterThanOrEqualTo(Boolean value) {
            addCriterion("generic >=", value, "generic");
            return (Criteria) this;
        }

        public Criteria andGenericLessThan(Boolean value) {
            addCriterion("generic <", value, "generic");
            return (Criteria) this;
        }

        public Criteria andGenericLessThanOrEqualTo(Boolean value) {
            addCriterion("generic <=", value, "generic");
            return (Criteria) this;
        }

        public Criteria andGenericIn(List<Boolean> values) {
            addCriterion("generic in", values, "generic");
            return (Criteria) this;
        }

        public Criteria andGenericNotIn(List<Boolean> values) {
            addCriterion("generic not in", values, "generic");
            return (Criteria) this;
        }

        public Criteria andGenericBetween(Boolean value1, Boolean value2) {
            addCriterion("generic between", value1, value2, "generic");
            return (Criteria) this;
        }

        public Criteria andGenericNotBetween(Boolean value1, Boolean value2) {
            addCriterion("generic not between", value1, value2, "generic");
            return (Criteria) this;
        }

        public Criteria andSearchingIsNull() {
            addCriterion("searching is null");
            return (Criteria) this;
        }

        public Criteria andSearchingIsNotNull() {
            addCriterion("searching is not null");
            return (Criteria) this;
        }

        public Criteria andSearchingEqualTo(Boolean value) {
            addCriterion("searching =", value, "searching");
            return (Criteria) this;
        }

        public Criteria andSearchingNotEqualTo(Boolean value) {
            addCriterion("searching <>", value, "searching");
            return (Criteria) this;
        }

        public Criteria andSearchingGreaterThan(Boolean value) {
            addCriterion("searching >", value, "searching");
            return (Criteria) this;
        }

        public Criteria andSearchingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("searching >=", value, "searching");
            return (Criteria) this;
        }

        public Criteria andSearchingLessThan(Boolean value) {
            addCriterion("searching <", value, "searching");
            return (Criteria) this;
        }

        public Criteria andSearchingLessThanOrEqualTo(Boolean value) {
            addCriterion("searching <=", value, "searching");
            return (Criteria) this;
        }

        public Criteria andSearchingIn(List<Boolean> values) {
            addCriterion("searching in", values, "searching");
            return (Criteria) this;
        }

        public Criteria andSearchingNotIn(List<Boolean> values) {
            addCriterion("searching not in", values, "searching");
            return (Criteria) this;
        }

        public Criteria andSearchingBetween(Boolean value1, Boolean value2) {
            addCriterion("searching between", value1, value2, "searching");
            return (Criteria) this;
        }

        public Criteria andSearchingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("searching not between", value1, value2, "searching");
            return (Criteria) this;
        }

        public Criteria andSegmentsIsNull() {
            addCriterion("segments is null");
            return (Criteria) this;
        }

        public Criteria andSegmentsIsNotNull() {
            addCriterion("segments is not null");
            return (Criteria) this;
        }

        public Criteria andSegmentsEqualTo(String value) {
            addCriterion("segments =", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsNotEqualTo(String value) {
            addCriterion("segments <>", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsGreaterThan(String value) {
            addCriterion("segments >", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsGreaterThanOrEqualTo(String value) {
            addCriterion("segments >=", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsLessThan(String value) {
            addCriterion("segments <", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsLessThanOrEqualTo(String value) {
            addCriterion("segments <=", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsLike(String value) {
            addCriterion("segments like", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsNotLike(String value) {
            addCriterion("segments not like", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsIn(List<String> values) {
            addCriterion("segments in", values, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsNotIn(List<String> values) {
            addCriterion("segments not in", values, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsBetween(String value1, String value2) {
            addCriterion("segments between", value1, value2, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsNotBetween(String value1, String value2) {
            addCriterion("segments not between", value1, value2, "segments");
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
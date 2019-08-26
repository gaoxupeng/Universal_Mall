package com.mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class SpuDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpuDetailExample() {
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

        public Criteria andSpuIdIsNull() {
            addCriterion("spu_id is null");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNotNull() {
            addCriterion("spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpuIdEqualTo(Long value) {
            addCriterion("spu_id =", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualTo(Long value) {
            addCriterion("spu_id <>", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThan(Long value) {
            addCriterion("spu_id >", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("spu_id >=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThan(Long value) {
            addCriterion("spu_id <", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualTo(Long value) {
            addCriterion("spu_id <=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdIn(List<Long> values) {
            addCriterion("spu_id in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotIn(List<Long> values) {
            addCriterion("spu_id not in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdBetween(Long value1, Long value2) {
            addCriterion("spu_id between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotBetween(Long value1, Long value2) {
            addCriterion("spu_id not between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andGenericSpecIsNull() {
            addCriterion("generic_spec is null");
            return (Criteria) this;
        }

        public Criteria andGenericSpecIsNotNull() {
            addCriterion("generic_spec is not null");
            return (Criteria) this;
        }

        public Criteria andGenericSpecEqualTo(String value) {
            addCriterion("generic_spec =", value, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecNotEqualTo(String value) {
            addCriterion("generic_spec <>", value, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecGreaterThan(String value) {
            addCriterion("generic_spec >", value, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecGreaterThanOrEqualTo(String value) {
            addCriterion("generic_spec >=", value, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecLessThan(String value) {
            addCriterion("generic_spec <", value, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecLessThanOrEqualTo(String value) {
            addCriterion("generic_spec <=", value, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecLike(String value) {
            addCriterion("generic_spec like", value, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecNotLike(String value) {
            addCriterion("generic_spec not like", value, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecIn(List<String> values) {
            addCriterion("generic_spec in", values, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecNotIn(List<String> values) {
            addCriterion("generic_spec not in", values, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecBetween(String value1, String value2) {
            addCriterion("generic_spec between", value1, value2, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andGenericSpecNotBetween(String value1, String value2) {
            addCriterion("generic_spec not between", value1, value2, "genericSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecIsNull() {
            addCriterion("special_spec is null");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecIsNotNull() {
            addCriterion("special_spec is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecEqualTo(String value) {
            addCriterion("special_spec =", value, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecNotEqualTo(String value) {
            addCriterion("special_spec <>", value, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecGreaterThan(String value) {
            addCriterion("special_spec >", value, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecGreaterThanOrEqualTo(String value) {
            addCriterion("special_spec >=", value, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecLessThan(String value) {
            addCriterion("special_spec <", value, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecLessThanOrEqualTo(String value) {
            addCriterion("special_spec <=", value, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecLike(String value) {
            addCriterion("special_spec like", value, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecNotLike(String value) {
            addCriterion("special_spec not like", value, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecIn(List<String> values) {
            addCriterion("special_spec in", values, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecNotIn(List<String> values) {
            addCriterion("special_spec not in", values, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecBetween(String value1, String value2) {
            addCriterion("special_spec between", value1, value2, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecialSpecNotBetween(String value1, String value2) {
            addCriterion("special_spec not between", value1, value2, "specialSpec");
            return (Criteria) this;
        }

        public Criteria andPackingListIsNull() {
            addCriterion("packing_list is null");
            return (Criteria) this;
        }

        public Criteria andPackingListIsNotNull() {
            addCriterion("packing_list is not null");
            return (Criteria) this;
        }

        public Criteria andPackingListEqualTo(String value) {
            addCriterion("packing_list =", value, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListNotEqualTo(String value) {
            addCriterion("packing_list <>", value, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListGreaterThan(String value) {
            addCriterion("packing_list >", value, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListGreaterThanOrEqualTo(String value) {
            addCriterion("packing_list >=", value, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListLessThan(String value) {
            addCriterion("packing_list <", value, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListLessThanOrEqualTo(String value) {
            addCriterion("packing_list <=", value, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListLike(String value) {
            addCriterion("packing_list like", value, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListNotLike(String value) {
            addCriterion("packing_list not like", value, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListIn(List<String> values) {
            addCriterion("packing_list in", values, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListNotIn(List<String> values) {
            addCriterion("packing_list not in", values, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListBetween(String value1, String value2) {
            addCriterion("packing_list between", value1, value2, "packingList");
            return (Criteria) this;
        }

        public Criteria andPackingListNotBetween(String value1, String value2) {
            addCriterion("packing_list not between", value1, value2, "packingList");
            return (Criteria) this;
        }

        public Criteria andAfterServiceIsNull() {
            addCriterion("after_service is null");
            return (Criteria) this;
        }

        public Criteria andAfterServiceIsNotNull() {
            addCriterion("after_service is not null");
            return (Criteria) this;
        }

        public Criteria andAfterServiceEqualTo(String value) {
            addCriterion("after_service =", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceNotEqualTo(String value) {
            addCriterion("after_service <>", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceGreaterThan(String value) {
            addCriterion("after_service >", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceGreaterThanOrEqualTo(String value) {
            addCriterion("after_service >=", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceLessThan(String value) {
            addCriterion("after_service <", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceLessThanOrEqualTo(String value) {
            addCriterion("after_service <=", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceLike(String value) {
            addCriterion("after_service like", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceNotLike(String value) {
            addCriterion("after_service not like", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceIn(List<String> values) {
            addCriterion("after_service in", values, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceNotIn(List<String> values) {
            addCriterion("after_service not in", values, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceBetween(String value1, String value2) {
            addCriterion("after_service between", value1, value2, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceNotBetween(String value1, String value2) {
            addCriterion("after_service not between", value1, value2, "afterService");
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
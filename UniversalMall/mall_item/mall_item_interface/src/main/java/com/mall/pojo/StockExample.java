package com.mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSeckillStockIsNull() {
            addCriterion("seckill_stock is null");
            return (Criteria) this;
        }

        public Criteria andSeckillStockIsNotNull() {
            addCriterion("seckill_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillStockEqualTo(Integer value) {
            addCriterion("seckill_stock =", value, "seckillStock");
            return (Criteria) this;
        }

        public Criteria andSeckillStockNotEqualTo(Integer value) {
            addCriterion("seckill_stock <>", value, "seckillStock");
            return (Criteria) this;
        }

        public Criteria andSeckillStockGreaterThan(Integer value) {
            addCriterion("seckill_stock >", value, "seckillStock");
            return (Criteria) this;
        }

        public Criteria andSeckillStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("seckill_stock >=", value, "seckillStock");
            return (Criteria) this;
        }

        public Criteria andSeckillStockLessThan(Integer value) {
            addCriterion("seckill_stock <", value, "seckillStock");
            return (Criteria) this;
        }

        public Criteria andSeckillStockLessThanOrEqualTo(Integer value) {
            addCriterion("seckill_stock <=", value, "seckillStock");
            return (Criteria) this;
        }

        public Criteria andSeckillStockIn(List<Integer> values) {
            addCriterion("seckill_stock in", values, "seckillStock");
            return (Criteria) this;
        }

        public Criteria andSeckillStockNotIn(List<Integer> values) {
            addCriterion("seckill_stock not in", values, "seckillStock");
            return (Criteria) this;
        }

        public Criteria andSeckillStockBetween(Integer value1, Integer value2) {
            addCriterion("seckill_stock between", value1, value2, "seckillStock");
            return (Criteria) this;
        }

        public Criteria andSeckillStockNotBetween(Integer value1, Integer value2) {
            addCriterion("seckill_stock not between", value1, value2, "seckillStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalIsNull() {
            addCriterion("seckill_total is null");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalIsNotNull() {
            addCriterion("seckill_total is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalEqualTo(Integer value) {
            addCriterion("seckill_total =", value, "seckillTotal");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalNotEqualTo(Integer value) {
            addCriterion("seckill_total <>", value, "seckillTotal");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalGreaterThan(Integer value) {
            addCriterion("seckill_total >", value, "seckillTotal");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("seckill_total >=", value, "seckillTotal");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalLessThan(Integer value) {
            addCriterion("seckill_total <", value, "seckillTotal");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalLessThanOrEqualTo(Integer value) {
            addCriterion("seckill_total <=", value, "seckillTotal");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalIn(List<Integer> values) {
            addCriterion("seckill_total in", values, "seckillTotal");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalNotIn(List<Integer> values) {
            addCriterion("seckill_total not in", values, "seckillTotal");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalBetween(Integer value1, Integer value2) {
            addCriterion("seckill_total between", value1, value2, "seckillTotal");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("seckill_total not between", value1, value2, "seckillTotal");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
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
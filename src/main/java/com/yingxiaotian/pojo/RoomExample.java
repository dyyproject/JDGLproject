package com.yingxiaotian.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRRoomnameIsNull() {
            addCriterion("r_roomname is null");
            return (Criteria) this;
        }

        public Criteria andRRoomnameIsNotNull() {
            addCriterion("r_roomname is not null");
            return (Criteria) this;
        }

        public Criteria andRRoomnameEqualTo(String value) {
            addCriterion("r_roomname =", value, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameNotEqualTo(String value) {
            addCriterion("r_roomname <>", value, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameGreaterThan(String value) {
            addCriterion("r_roomname >", value, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameGreaterThanOrEqualTo(String value) {
            addCriterion("r_roomname >=", value, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameLessThan(String value) {
            addCriterion("r_roomname <", value, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameLessThanOrEqualTo(String value) {
            addCriterion("r_roomname <=", value, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameLike(String value) {
            addCriterion("r_roomname like", value, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameNotLike(String value) {
            addCriterion("r_roomname not like", value, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameIn(List<String> values) {
            addCriterion("r_roomname in", values, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameNotIn(List<String> values) {
            addCriterion("r_roomname not in", values, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameBetween(String value1, String value2) {
            addCriterion("r_roomname between", value1, value2, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRRoomnameNotBetween(String value1, String value2) {
            addCriterion("r_roomname not between", value1, value2, "rRoomname");
            return (Criteria) this;
        }

        public Criteria andRStatusIsNull() {
            addCriterion("r_status is null");
            return (Criteria) this;
        }

        public Criteria andRStatusIsNotNull() {
            addCriterion("r_status is not null");
            return (Criteria) this;
        }

        public Criteria andRStatusEqualTo(String value) {
            addCriterion("r_status =", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusNotEqualTo(String value) {
            addCriterion("r_status <>", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusGreaterThan(String value) {
            addCriterion("r_status >", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusGreaterThanOrEqualTo(String value) {
            addCriterion("r_status >=", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusLessThan(String value) {
            addCriterion("r_status <", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusLessThanOrEqualTo(String value) {
            addCriterion("r_status <=", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusLike(String value) {
            addCriterion("r_status like", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusNotLike(String value) {
            addCriterion("r_status not like", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusIn(List<String> values) {
            addCriterion("r_status in", values, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusNotIn(List<String> values) {
            addCriterion("r_status not in", values, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusBetween(String value1, String value2) {
            addCriterion("r_status between", value1, value2, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusNotBetween(String value1, String value2) {
            addCriterion("r_status not between", value1, value2, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRDateIsNull() {
            addCriterion("r_date is null");
            return (Criteria) this;
        }

        public Criteria andRDateIsNotNull() {
            addCriterion("r_date is not null");
            return (Criteria) this;
        }

        public Criteria andRDateEqualTo(Date value) {
            addCriterion("r_date =", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateNotEqualTo(Date value) {
            addCriterion("r_date <>", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateGreaterThan(Date value) {
            addCriterion("r_date >", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateGreaterThanOrEqualTo(Date value) {
            addCriterion("r_date >=", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateLessThan(Date value) {
            addCriterion("r_date <", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateLessThanOrEqualTo(Date value) {
            addCriterion("r_date <=", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateIn(List<Date> values) {
            addCriterion("r_date in", values, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateNotIn(List<Date> values) {
            addCriterion("r_date not in", values, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateBetween(Date value1, Date value2) {
            addCriterion("r_date between", value1, value2, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateNotBetween(Date value1, Date value2) {
            addCriterion("r_date not between", value1, value2, "rDate");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNull() {
            addCriterion("r_type is null");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNotNull() {
            addCriterion("r_type is not null");
            return (Criteria) this;
        }

        public Criteria andRTypeEqualTo(String value) {
            addCriterion("r_type =", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotEqualTo(String value) {
            addCriterion("r_type <>", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThan(String value) {
            addCriterion("r_type >", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThanOrEqualTo(String value) {
            addCriterion("r_type >=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThan(String value) {
            addCriterion("r_type <", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThanOrEqualTo(String value) {
            addCriterion("r_type <=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLike(String value) {
            addCriterion("r_type like", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotLike(String value) {
            addCriterion("r_type not like", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeIn(List<String> values) {
            addCriterion("r_type in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotIn(List<String> values) {
            addCriterion("r_type not in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeBetween(String value1, String value2) {
            addCriterion("r_type between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotBetween(String value1, String value2) {
            addCriterion("r_type not between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRPriceIsNull() {
            addCriterion("r_price is null");
            return (Criteria) this;
        }

        public Criteria andRPriceIsNotNull() {
            addCriterion("r_price is not null");
            return (Criteria) this;
        }

        public Criteria andRPriceEqualTo(Double value) {
            addCriterion("r_price =", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceNotEqualTo(Double value) {
            addCriterion("r_price <>", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceGreaterThan(Double value) {
            addCriterion("r_price >", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("r_price >=", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceLessThan(Double value) {
            addCriterion("r_price <", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceLessThanOrEqualTo(Double value) {
            addCriterion("r_price <=", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceIn(List<Double> values) {
            addCriterion("r_price in", values, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceNotIn(List<Double> values) {
            addCriterion("r_price not in", values, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceBetween(Double value1, Double value2) {
            addCriterion("r_price between", value1, value2, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceNotBetween(Double value1, Double value2) {
            addCriterion("r_price not between", value1, value2, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNull() {
            addCriterion("r_number is null");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNotNull() {
            addCriterion("r_number is not null");
            return (Criteria) this;
        }

        public Criteria andRNumberEqualTo(String value) {
            addCriterion("r_number =", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotEqualTo(String value) {
            addCriterion("r_number <>", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThan(String value) {
            addCriterion("r_number >", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThanOrEqualTo(String value) {
            addCriterion("r_number >=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThan(String value) {
            addCriterion("r_number <", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThanOrEqualTo(String value) {
            addCriterion("r_number <=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLike(String value) {
            addCriterion("r_number like", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotLike(String value) {
            addCriterion("r_number not like", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberIn(List<String> values) {
            addCriterion("r_number in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotIn(List<String> values) {
            addCriterion("r_number not in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberBetween(String value1, String value2) {
            addCriterion("r_number between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotBetween(String value1, String value2) {
            addCriterion("r_number not between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRPhotoIsNull() {
            addCriterion("r_photo is null");
            return (Criteria) this;
        }

        public Criteria andRPhotoIsNotNull() {
            addCriterion("r_photo is not null");
            return (Criteria) this;
        }

        public Criteria andRPhotoEqualTo(String value) {
            addCriterion("r_photo =", value, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoNotEqualTo(String value) {
            addCriterion("r_photo <>", value, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoGreaterThan(String value) {
            addCriterion("r_photo >", value, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("r_photo >=", value, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoLessThan(String value) {
            addCriterion("r_photo <", value, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoLessThanOrEqualTo(String value) {
            addCriterion("r_photo <=", value, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoLike(String value) {
            addCriterion("r_photo like", value, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoNotLike(String value) {
            addCriterion("r_photo not like", value, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoIn(List<String> values) {
            addCriterion("r_photo in", values, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoNotIn(List<String> values) {
            addCriterion("r_photo not in", values, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoBetween(String value1, String value2) {
            addCriterion("r_photo between", value1, value2, "rPhoto");
            return (Criteria) this;
        }

        public Criteria andRPhotoNotBetween(String value1, String value2) {
            addCriterion("r_photo not between", value1, value2, "rPhoto");
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
package com.example.demo.entity.gen;

import java.util.ArrayList;
import java.util.List;

public class TGrowthRecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    public TGrowthRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_growth_record
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_growth_record
     *
     * @mbggenerated
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andStepIsNull() {
            addCriterion("step is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("step is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(Integer value) {
            addCriterion("step =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(Integer value) {
            addCriterion("step <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(Integer value) {
            addCriterion("step >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("step >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(Integer value) {
            addCriterion("step <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(Integer value) {
            addCriterion("step <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<Integer> values) {
            addCriterion("step in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<Integer> values) {
            addCriterion("step not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(Integer value1, Integer value2) {
            addCriterion("step between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(Integer value1, Integer value2) {
            addCriterion("step not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andListenTimeIsNull() {
            addCriterion("listen_time is null");
            return (Criteria) this;
        }

        public Criteria andListenTimeIsNotNull() {
            addCriterion("listen_time is not null");
            return (Criteria) this;
        }

        public Criteria andListenTimeEqualTo(Integer value) {
            addCriterion("listen_time =", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeNotEqualTo(Integer value) {
            addCriterion("listen_time <>", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeGreaterThan(Integer value) {
            addCriterion("listen_time >", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("listen_time >=", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeLessThan(Integer value) {
            addCriterion("listen_time <", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeLessThanOrEqualTo(Integer value) {
            addCriterion("listen_time <=", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeIn(List<Integer> values) {
            addCriterion("listen_time in", values, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeNotIn(List<Integer> values) {
            addCriterion("listen_time not in", values, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeBetween(Integer value1, Integer value2) {
            addCriterion("listen_time between", value1, value2, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("listen_time not between", value1, value2, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenNumIsNull() {
            addCriterion("listen_num is null");
            return (Criteria) this;
        }

        public Criteria andListenNumIsNotNull() {
            addCriterion("listen_num is not null");
            return (Criteria) this;
        }

        public Criteria andListenNumEqualTo(Integer value) {
            addCriterion("listen_num =", value, "listenNum");
            return (Criteria) this;
        }

        public Criteria andListenNumNotEqualTo(Integer value) {
            addCriterion("listen_num <>", value, "listenNum");
            return (Criteria) this;
        }

        public Criteria andListenNumGreaterThan(Integer value) {
            addCriterion("listen_num >", value, "listenNum");
            return (Criteria) this;
        }

        public Criteria andListenNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("listen_num >=", value, "listenNum");
            return (Criteria) this;
        }

        public Criteria andListenNumLessThan(Integer value) {
            addCriterion("listen_num <", value, "listenNum");
            return (Criteria) this;
        }

        public Criteria andListenNumLessThanOrEqualTo(Integer value) {
            addCriterion("listen_num <=", value, "listenNum");
            return (Criteria) this;
        }

        public Criteria andListenNumIn(List<Integer> values) {
            addCriterion("listen_num in", values, "listenNum");
            return (Criteria) this;
        }

        public Criteria andListenNumNotIn(List<Integer> values) {
            addCriterion("listen_num not in", values, "listenNum");
            return (Criteria) this;
        }

        public Criteria andListenNumBetween(Integer value1, Integer value2) {
            addCriterion("listen_num between", value1, value2, "listenNum");
            return (Criteria) this;
        }

        public Criteria andListenNumNotBetween(Integer value1, Integer value2) {
            addCriterion("listen_num not between", value1, value2, "listenNum");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andEruditionClassIsNull() {
            addCriterion("erudition_class is null");
            return (Criteria) this;
        }

        public Criteria andEruditionClassIsNotNull() {
            addCriterion("erudition_class is not null");
            return (Criteria) this;
        }

        public Criteria andEruditionClassEqualTo(String value) {
            addCriterion("erudition_class =", value, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassNotEqualTo(String value) {
            addCriterion("erudition_class <>", value, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassGreaterThan(String value) {
            addCriterion("erudition_class >", value, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassGreaterThanOrEqualTo(String value) {
            addCriterion("erudition_class >=", value, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassLessThan(String value) {
            addCriterion("erudition_class <", value, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassLessThanOrEqualTo(String value) {
            addCriterion("erudition_class <=", value, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassLike(String value) {
            addCriterion("erudition_class like", value, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassNotLike(String value) {
            addCriterion("erudition_class not like", value, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassIn(List<String> values) {
            addCriterion("erudition_class in", values, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassNotIn(List<String> values) {
            addCriterion("erudition_class not in", values, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassBetween(String value1, String value2) {
            addCriterion("erudition_class between", value1, value2, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andEruditionClassNotBetween(String value1, String value2) {
            addCriterion("erudition_class not between", value1, value2, "eruditionClass");
            return (Criteria) this;
        }

        public Criteria andInterestMapIsNull() {
            addCriterion("interest_map is null");
            return (Criteria) this;
        }

        public Criteria andInterestMapIsNotNull() {
            addCriterion("interest_map is not null");
            return (Criteria) this;
        }

        public Criteria andInterestMapEqualTo(String value) {
            addCriterion("interest_map =", value, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapNotEqualTo(String value) {
            addCriterion("interest_map <>", value, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapGreaterThan(String value) {
            addCriterion("interest_map >", value, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapGreaterThanOrEqualTo(String value) {
            addCriterion("interest_map >=", value, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapLessThan(String value) {
            addCriterion("interest_map <", value, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapLessThanOrEqualTo(String value) {
            addCriterion("interest_map <=", value, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapLike(String value) {
            addCriterion("interest_map like", value, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapNotLike(String value) {
            addCriterion("interest_map not like", value, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapIn(List<String> values) {
            addCriterion("interest_map in", values, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapNotIn(List<String> values) {
            addCriterion("interest_map not in", values, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapBetween(String value1, String value2) {
            addCriterion("interest_map between", value1, value2, "interestMap");
            return (Criteria) this;
        }

        public Criteria andInterestMapNotBetween(String value1, String value2) {
            addCriterion("interest_map not between", value1, value2, "interestMap");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_growth_record
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_growth_record
     *
     * @mbggenerated
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
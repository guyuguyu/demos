package com.example.demo.entity.gen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDevice20170503Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    public TDevice20170503Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_20170503
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
     * This method corresponds to the database table t_device_20170503
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
     * This method corresponds to the database table t_device_20170503
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_20170503
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
     * This class corresponds to the database table t_device_20170503
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andRestCapIsNull() {
            addCriterion("rest_cap is null");
            return (Criteria) this;
        }

        public Criteria andRestCapIsNotNull() {
            addCriterion("rest_cap is not null");
            return (Criteria) this;
        }

        public Criteria andRestCapEqualTo(String value) {
            addCriterion("rest_cap =", value, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapNotEqualTo(String value) {
            addCriterion("rest_cap <>", value, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapGreaterThan(String value) {
            addCriterion("rest_cap >", value, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapGreaterThanOrEqualTo(String value) {
            addCriterion("rest_cap >=", value, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapLessThan(String value) {
            addCriterion("rest_cap <", value, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapLessThanOrEqualTo(String value) {
            addCriterion("rest_cap <=", value, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapLike(String value) {
            addCriterion("rest_cap like", value, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapNotLike(String value) {
            addCriterion("rest_cap not like", value, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapIn(List<String> values) {
            addCriterion("rest_cap in", values, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapNotIn(List<String> values) {
            addCriterion("rest_cap not in", values, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapBetween(String value1, String value2) {
            addCriterion("rest_cap between", value1, value2, "restCap");
            return (Criteria) this;
        }

        public Criteria andRestCapNotBetween(String value1, String value2) {
            addCriterion("rest_cap not between", value1, value2, "restCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapIsNull() {
            addCriterion("toatl_cap is null");
            return (Criteria) this;
        }

        public Criteria andToatlCapIsNotNull() {
            addCriterion("toatl_cap is not null");
            return (Criteria) this;
        }

        public Criteria andToatlCapEqualTo(String value) {
            addCriterion("toatl_cap =", value, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapNotEqualTo(String value) {
            addCriterion("toatl_cap <>", value, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapGreaterThan(String value) {
            addCriterion("toatl_cap >", value, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapGreaterThanOrEqualTo(String value) {
            addCriterion("toatl_cap >=", value, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapLessThan(String value) {
            addCriterion("toatl_cap <", value, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapLessThanOrEqualTo(String value) {
            addCriterion("toatl_cap <=", value, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapLike(String value) {
            addCriterion("toatl_cap like", value, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapNotLike(String value) {
            addCriterion("toatl_cap not like", value, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapIn(List<String> values) {
            addCriterion("toatl_cap in", values, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapNotIn(List<String> values) {
            addCriterion("toatl_cap not in", values, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapBetween(String value1, String value2) {
            addCriterion("toatl_cap between", value1, value2, "toatlCap");
            return (Criteria) this;
        }

        public Criteria andToatlCapNotBetween(String value1, String value2) {
            addCriterion("toatl_cap not between", value1, value2, "toatlCap");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNull() {
            addCriterion("online_status is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNotNull() {
            addCriterion("online_status is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusEqualTo(String value) {
            addCriterion("online_status =", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotEqualTo(String value) {
            addCriterion("online_status <>", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThan(String value) {
            addCriterion("online_status >", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThanOrEqualTo(String value) {
            addCriterion("online_status >=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThan(String value) {
            addCriterion("online_status <", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThanOrEqualTo(String value) {
            addCriterion("online_status <=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLike(String value) {
            addCriterion("online_status like", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotLike(String value) {
            addCriterion("online_status not like", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIn(List<String> values) {
            addCriterion("online_status in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotIn(List<String> values) {
            addCriterion("online_status not in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusBetween(String value1, String value2) {
            addCriterion("online_status between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotBetween(String value1, String value2) {
            addCriterion("online_status not between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusIsNull() {
            addCriterion("wifi_status is null");
            return (Criteria) this;
        }

        public Criteria andWifiStatusIsNotNull() {
            addCriterion("wifi_status is not null");
            return (Criteria) this;
        }

        public Criteria andWifiStatusEqualTo(String value) {
            addCriterion("wifi_status =", value, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusNotEqualTo(String value) {
            addCriterion("wifi_status <>", value, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusGreaterThan(String value) {
            addCriterion("wifi_status >", value, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusGreaterThanOrEqualTo(String value) {
            addCriterion("wifi_status >=", value, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusLessThan(String value) {
            addCriterion("wifi_status <", value, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusLessThanOrEqualTo(String value) {
            addCriterion("wifi_status <=", value, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusLike(String value) {
            addCriterion("wifi_status like", value, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusNotLike(String value) {
            addCriterion("wifi_status not like", value, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusIn(List<String> values) {
            addCriterion("wifi_status in", values, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusNotIn(List<String> values) {
            addCriterion("wifi_status not in", values, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusBetween(String value1, String value2) {
            addCriterion("wifi_status between", value1, value2, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andWifiStatusNotBetween(String value1, String value2) {
            addCriterion("wifi_status not between", value1, value2, "wifiStatus");
            return (Criteria) this;
        }

        public Criteria andPowerCapIsNull() {
            addCriterion("power_cap is null");
            return (Criteria) this;
        }

        public Criteria andPowerCapIsNotNull() {
            addCriterion("power_cap is not null");
            return (Criteria) this;
        }

        public Criteria andPowerCapEqualTo(String value) {
            addCriterion("power_cap =", value, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapNotEqualTo(String value) {
            addCriterion("power_cap <>", value, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapGreaterThan(String value) {
            addCriterion("power_cap >", value, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapGreaterThanOrEqualTo(String value) {
            addCriterion("power_cap >=", value, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapLessThan(String value) {
            addCriterion("power_cap <", value, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapLessThanOrEqualTo(String value) {
            addCriterion("power_cap <=", value, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapLike(String value) {
            addCriterion("power_cap like", value, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapNotLike(String value) {
            addCriterion("power_cap not like", value, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapIn(List<String> values) {
            addCriterion("power_cap in", values, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapNotIn(List<String> values) {
            addCriterion("power_cap not in", values, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapBetween(String value1, String value2) {
            addCriterion("power_cap between", value1, value2, "powerCap");
            return (Criteria) this;
        }

        public Criteria andPowerCapNotBetween(String value1, String value2) {
            addCriterion("power_cap not between", value1, value2, "powerCap");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusIsNull() {
            addCriterion("wifi_open_status is null");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusIsNotNull() {
            addCriterion("wifi_open_status is not null");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusEqualTo(String value) {
            addCriterion("wifi_open_status =", value, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusNotEqualTo(String value) {
            addCriterion("wifi_open_status <>", value, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusGreaterThan(String value) {
            addCriterion("wifi_open_status >", value, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusGreaterThanOrEqualTo(String value) {
            addCriterion("wifi_open_status >=", value, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusLessThan(String value) {
            addCriterion("wifi_open_status <", value, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusLessThanOrEqualTo(String value) {
            addCriterion("wifi_open_status <=", value, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusLike(String value) {
            addCriterion("wifi_open_status like", value, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusNotLike(String value) {
            addCriterion("wifi_open_status not like", value, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusIn(List<String> values) {
            addCriterion("wifi_open_status in", values, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusNotIn(List<String> values) {
            addCriterion("wifi_open_status not in", values, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusBetween(String value1, String value2) {
            addCriterion("wifi_open_status between", value1, value2, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andWifiOpenStatusNotBetween(String value1, String value2) {
            addCriterion("wifi_open_status not between", value1, value2, "wifiOpenStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeCapIsNull() {
            addCriterion("notice_cap is null");
            return (Criteria) this;
        }

        public Criteria andNoticeCapIsNotNull() {
            addCriterion("notice_cap is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeCapEqualTo(String value) {
            addCriterion("notice_cap =", value, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapNotEqualTo(String value) {
            addCriterion("notice_cap <>", value, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapGreaterThan(String value) {
            addCriterion("notice_cap >", value, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapGreaterThanOrEqualTo(String value) {
            addCriterion("notice_cap >=", value, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapLessThan(String value) {
            addCriterion("notice_cap <", value, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapLessThanOrEqualTo(String value) {
            addCriterion("notice_cap <=", value, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapLike(String value) {
            addCriterion("notice_cap like", value, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapNotLike(String value) {
            addCriterion("notice_cap not like", value, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapIn(List<String> values) {
            addCriterion("notice_cap in", values, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapNotIn(List<String> values) {
            addCriterion("notice_cap not in", values, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapBetween(String value1, String value2) {
            addCriterion("notice_cap between", value1, value2, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andNoticeCapNotBetween(String value1, String value2) {
            addCriterion("notice_cap not between", value1, value2, "noticeCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapIsNull() {
            addCriterion("radio_cap is null");
            return (Criteria) this;
        }

        public Criteria andRadioCapIsNotNull() {
            addCriterion("radio_cap is not null");
            return (Criteria) this;
        }

        public Criteria andRadioCapEqualTo(String value) {
            addCriterion("radio_cap =", value, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapNotEqualTo(String value) {
            addCriterion("radio_cap <>", value, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapGreaterThan(String value) {
            addCriterion("radio_cap >", value, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapGreaterThanOrEqualTo(String value) {
            addCriterion("radio_cap >=", value, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapLessThan(String value) {
            addCriterion("radio_cap <", value, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapLessThanOrEqualTo(String value) {
            addCriterion("radio_cap <=", value, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapLike(String value) {
            addCriterion("radio_cap like", value, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapNotLike(String value) {
            addCriterion("radio_cap not like", value, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapIn(List<String> values) {
            addCriterion("radio_cap in", values, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapNotIn(List<String> values) {
            addCriterion("radio_cap not in", values, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapBetween(String value1, String value2) {
            addCriterion("radio_cap between", value1, value2, "radioCap");
            return (Criteria) this;
        }

        public Criteria andRadioCapNotBetween(String value1, String value2) {
            addCriterion("radio_cap not between", value1, value2, "radioCap");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_device_20170503
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
     * This class corresponds to the database table t_device_20170503
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
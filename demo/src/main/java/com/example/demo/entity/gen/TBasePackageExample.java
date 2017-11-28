package com.example.demo.entity.gen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBasePackageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    public TBasePackageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_package
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
     * This method corresponds to the database table t_base_package
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
     * This method corresponds to the database table t_base_package
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_package
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
     * This class corresponds to the database table t_base_package
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

        public Criteria andSyncframeIsNull() {
            addCriterion("syncFrame is null");
            return (Criteria) this;
        }

        public Criteria andSyncframeIsNotNull() {
            addCriterion("syncFrame is not null");
            return (Criteria) this;
        }

        public Criteria andSyncframeEqualTo(String value) {
            addCriterion("syncFrame =", value, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeNotEqualTo(String value) {
            addCriterion("syncFrame <>", value, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeGreaterThan(String value) {
            addCriterion("syncFrame >", value, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeGreaterThanOrEqualTo(String value) {
            addCriterion("syncFrame >=", value, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeLessThan(String value) {
            addCriterion("syncFrame <", value, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeLessThanOrEqualTo(String value) {
            addCriterion("syncFrame <=", value, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeLike(String value) {
            addCriterion("syncFrame like", value, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeNotLike(String value) {
            addCriterion("syncFrame not like", value, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeIn(List<String> values) {
            addCriterion("syncFrame in", values, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeNotIn(List<String> values) {
            addCriterion("syncFrame not in", values, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeBetween(String value1, String value2) {
            addCriterion("syncFrame between", value1, value2, "syncframe");
            return (Criteria) this;
        }

        public Criteria andSyncframeNotBetween(String value1, String value2) {
            addCriterion("syncFrame not between", value1, value2, "syncframe");
            return (Criteria) this;
        }

        public Criteria andToidIsNull() {
            addCriterion("toID is null");
            return (Criteria) this;
        }

        public Criteria andToidIsNotNull() {
            addCriterion("toID is not null");
            return (Criteria) this;
        }

        public Criteria andToidEqualTo(String value) {
            addCriterion("toID =", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotEqualTo(String value) {
            addCriterion("toID <>", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThan(String value) {
            addCriterion("toID >", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThanOrEqualTo(String value) {
            addCriterion("toID >=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThan(String value) {
            addCriterion("toID <", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThanOrEqualTo(String value) {
            addCriterion("toID <=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLike(String value) {
            addCriterion("toID like", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotLike(String value) {
            addCriterion("toID not like", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidIn(List<String> values) {
            addCriterion("toID in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotIn(List<String> values) {
            addCriterion("toID not in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidBetween(String value1, String value2) {
            addCriterion("toID between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotBetween(String value1, String value2) {
            addCriterion("toID not between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andFromidIsNull() {
            addCriterion("fromID is null");
            return (Criteria) this;
        }

        public Criteria andFromidIsNotNull() {
            addCriterion("fromID is not null");
            return (Criteria) this;
        }

        public Criteria andFromidEqualTo(String value) {
            addCriterion("fromID =", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotEqualTo(String value) {
            addCriterion("fromID <>", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThan(String value) {
            addCriterion("fromID >", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThanOrEqualTo(String value) {
            addCriterion("fromID >=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThan(String value) {
            addCriterion("fromID <", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThanOrEqualTo(String value) {
            addCriterion("fromID <=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLike(String value) {
            addCriterion("fromID like", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotLike(String value) {
            addCriterion("fromID not like", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidIn(List<String> values) {
            addCriterion("fromID in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotIn(List<String> values) {
            addCriterion("fromID not in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidBetween(String value1, String value2) {
            addCriterion("fromID between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotBetween(String value1, String value2) {
            addCriterion("fromID not between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidIsNull() {
            addCriterion("fromPackageID is null");
            return (Criteria) this;
        }

        public Criteria andFrompackageidIsNotNull() {
            addCriterion("fromPackageID is not null");
            return (Criteria) this;
        }

        public Criteria andFrompackageidEqualTo(String value) {
            addCriterion("fromPackageID =", value, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidNotEqualTo(String value) {
            addCriterion("fromPackageID <>", value, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidGreaterThan(String value) {
            addCriterion("fromPackageID >", value, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidGreaterThanOrEqualTo(String value) {
            addCriterion("fromPackageID >=", value, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidLessThan(String value) {
            addCriterion("fromPackageID <", value, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidLessThanOrEqualTo(String value) {
            addCriterion("fromPackageID <=", value, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidLike(String value) {
            addCriterion("fromPackageID like", value, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidNotLike(String value) {
            addCriterion("fromPackageID not like", value, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidIn(List<String> values) {
            addCriterion("fromPackageID in", values, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidNotIn(List<String> values) {
            addCriterion("fromPackageID not in", values, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidBetween(String value1, String value2) {
            addCriterion("fromPackageID between", value1, value2, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFrompackageidNotBetween(String value1, String value2) {
            addCriterion("fromPackageID not between", value1, value2, "frompackageid");
            return (Criteria) this;
        }

        public Criteria andFunccodeIsNull() {
            addCriterion("funcCode is null");
            return (Criteria) this;
        }

        public Criteria andFunccodeIsNotNull() {
            addCriterion("funcCode is not null");
            return (Criteria) this;
        }

        public Criteria andFunccodeEqualTo(String value) {
            addCriterion("funcCode =", value, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeNotEqualTo(String value) {
            addCriterion("funcCode <>", value, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeGreaterThan(String value) {
            addCriterion("funcCode >", value, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeGreaterThanOrEqualTo(String value) {
            addCriterion("funcCode >=", value, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeLessThan(String value) {
            addCriterion("funcCode <", value, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeLessThanOrEqualTo(String value) {
            addCriterion("funcCode <=", value, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeLike(String value) {
            addCriterion("funcCode like", value, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeNotLike(String value) {
            addCriterion("funcCode not like", value, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeIn(List<String> values) {
            addCriterion("funcCode in", values, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeNotIn(List<String> values) {
            addCriterion("funcCode not in", values, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeBetween(String value1, String value2) {
            addCriterion("funcCode between", value1, value2, "funccode");
            return (Criteria) this;
        }

        public Criteria andFunccodeNotBetween(String value1, String value2) {
            addCriterion("funcCode not between", value1, value2, "funccode");
            return (Criteria) this;
        }

        public Criteria andPackagelengthIsNull() {
            addCriterion("packageLength is null");
            return (Criteria) this;
        }

        public Criteria andPackagelengthIsNotNull() {
            addCriterion("packageLength is not null");
            return (Criteria) this;
        }

        public Criteria andPackagelengthEqualTo(String value) {
            addCriterion("packageLength =", value, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthNotEqualTo(String value) {
            addCriterion("packageLength <>", value, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthGreaterThan(String value) {
            addCriterion("packageLength >", value, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthGreaterThanOrEqualTo(String value) {
            addCriterion("packageLength >=", value, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthLessThan(String value) {
            addCriterion("packageLength <", value, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthLessThanOrEqualTo(String value) {
            addCriterion("packageLength <=", value, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthLike(String value) {
            addCriterion("packageLength like", value, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthNotLike(String value) {
            addCriterion("packageLength not like", value, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthIn(List<String> values) {
            addCriterion("packageLength in", values, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthNotIn(List<String> values) {
            addCriterion("packageLength not in", values, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthBetween(String value1, String value2) {
            addCriterion("packageLength between", value1, value2, "packagelength");
            return (Criteria) this;
        }

        public Criteria andPackagelengthNotBetween(String value1, String value2) {
            addCriterion("packageLength not between", value1, value2, "packagelength");
            return (Criteria) this;
        }

        public Criteria andReceiveflagIsNull() {
            addCriterion("receiveFlag is null");
            return (Criteria) this;
        }

        public Criteria andReceiveflagIsNotNull() {
            addCriterion("receiveFlag is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveflagEqualTo(String value) {
            addCriterion("receiveFlag =", value, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagNotEqualTo(String value) {
            addCriterion("receiveFlag <>", value, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagGreaterThan(String value) {
            addCriterion("receiveFlag >", value, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagGreaterThanOrEqualTo(String value) {
            addCriterion("receiveFlag >=", value, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagLessThan(String value) {
            addCriterion("receiveFlag <", value, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagLessThanOrEqualTo(String value) {
            addCriterion("receiveFlag <=", value, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagLike(String value) {
            addCriterion("receiveFlag like", value, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagNotLike(String value) {
            addCriterion("receiveFlag not like", value, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagIn(List<String> values) {
            addCriterion("receiveFlag in", values, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagNotIn(List<String> values) {
            addCriterion("receiveFlag not in", values, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagBetween(String value1, String value2) {
            addCriterion("receiveFlag between", value1, value2, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andReceiveflagNotBetween(String value1, String value2) {
            addCriterion("receiveFlag not between", value1, value2, "receiveflag");
            return (Criteria) this;
        }

        public Criteria andTopackageidIsNull() {
            addCriterion("toPackageID is null");
            return (Criteria) this;
        }

        public Criteria andTopackageidIsNotNull() {
            addCriterion("toPackageID is not null");
            return (Criteria) this;
        }

        public Criteria andTopackageidEqualTo(String value) {
            addCriterion("toPackageID =", value, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidNotEqualTo(String value) {
            addCriterion("toPackageID <>", value, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidGreaterThan(String value) {
            addCriterion("toPackageID >", value, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidGreaterThanOrEqualTo(String value) {
            addCriterion("toPackageID >=", value, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidLessThan(String value) {
            addCriterion("toPackageID <", value, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidLessThanOrEqualTo(String value) {
            addCriterion("toPackageID <=", value, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidLike(String value) {
            addCriterion("toPackageID like", value, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidNotLike(String value) {
            addCriterion("toPackageID not like", value, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidIn(List<String> values) {
            addCriterion("toPackageID in", values, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidNotIn(List<String> values) {
            addCriterion("toPackageID not in", values, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidBetween(String value1, String value2) {
            addCriterion("toPackageID between", value1, value2, "topackageid");
            return (Criteria) this;
        }

        public Criteria andTopackageidNotBetween(String value1, String value2) {
            addCriterion("toPackageID not between", value1, value2, "topackageid");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNull() {
            addCriterion("checkCode is null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNotNull() {
            addCriterion("checkCode is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeEqualTo(String value) {
            addCriterion("checkCode =", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotEqualTo(String value) {
            addCriterion("checkCode <>", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThan(String value) {
            addCriterion("checkCode >", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThanOrEqualTo(String value) {
            addCriterion("checkCode >=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThan(String value) {
            addCriterion("checkCode <", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThanOrEqualTo(String value) {
            addCriterion("checkCode <=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLike(String value) {
            addCriterion("checkCode like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotLike(String value) {
            addCriterion("checkCode not like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIn(List<String> values) {
            addCriterion("checkCode in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotIn(List<String> values) {
            addCriterion("checkCode not in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeBetween(String value1, String value2) {
            addCriterion("checkCode between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotBetween(String value1, String value2) {
            addCriterion("checkCode not between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("datetime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("datetime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Date value) {
            addCriterion("datetime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Date value) {
            addCriterion("datetime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Date value) {
            addCriterion("datetime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datetime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Date value) {
            addCriterion("datetime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("datetime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Date> values) {
            addCriterion("datetime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Date> values) {
            addCriterion("datetime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Date value1, Date value2) {
            addCriterion("datetime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("datetime not between", value1, value2, "datetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_base_package
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
     * This class corresponds to the database table t_base_package
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
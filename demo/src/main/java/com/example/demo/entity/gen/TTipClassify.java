package com.example.demo.entity.gen;

import java.util.Date;

public class TTipClassify {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tip_classify.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tip_classify.classify_name
     *
     * @mbggenerated
     */
    private String classifyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tip_classify.type_id
     *
     * @mbggenerated
     */
    private Long typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tip_classify.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tip_classify.flag
     *
     * @mbggenerated
     */
    private Integer flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tip_classify.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tip_classify.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tip_classify.id
     *
     * @return the value of t_tip_classify.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tip_classify.id
     *
     * @param id the value for t_tip_classify.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tip_classify.classify_name
     *
     * @return the value of t_tip_classify.classify_name
     *
     * @mbggenerated
     */
    public String getClassifyName() {
        return classifyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tip_classify.classify_name
     *
     * @param classifyName the value for t_tip_classify.classify_name
     *
     * @mbggenerated
     */
    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName == null ? null : classifyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tip_classify.type_id
     *
     * @return the value of t_tip_classify.type_id
     *
     * @mbggenerated
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tip_classify.type_id
     *
     * @param typeId the value for t_tip_classify.type_id
     *
     * @mbggenerated
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tip_classify.status
     *
     * @return the value of t_tip_classify.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tip_classify.status
     *
     * @param status the value for t_tip_classify.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tip_classify.flag
     *
     * @return the value of t_tip_classify.flag
     *
     * @mbggenerated
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tip_classify.flag
     *
     * @param flag the value for t_tip_classify.flag
     *
     * @mbggenerated
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tip_classify.create_time
     *
     * @return the value of t_tip_classify.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tip_classify.create_time
     *
     * @param createTime the value for t_tip_classify.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tip_classify.update_time
     *
     * @return the value of t_tip_classify.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tip_classify.update_time
     *
     * @param updateTime the value for t_tip_classify.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
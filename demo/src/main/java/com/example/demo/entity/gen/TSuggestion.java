package com.example.demo.entity.gen;

import java.util.Date;

public class TSuggestion {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_suggestion.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_suggestion.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_suggestion.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_suggestion.qq
     *
     * @mbggenerated
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_suggestion.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_suggestion.id
     *
     * @return the value of t_suggestion.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_suggestion.id
     *
     * @param id the value for t_suggestion.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_suggestion.content
     *
     * @return the value of t_suggestion.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_suggestion.content
     *
     * @param content the value for t_suggestion.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_suggestion.phone
     *
     * @return the value of t_suggestion.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_suggestion.phone
     *
     * @param phone the value for t_suggestion.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_suggestion.qq
     *
     * @return the value of t_suggestion.qq
     *
     * @mbggenerated
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_suggestion.qq
     *
     * @param qq the value for t_suggestion.qq
     *
     * @mbggenerated
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_suggestion.create_time
     *
     * @return the value of t_suggestion.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_suggestion.create_time
     *
     * @param createTime the value for t_suggestion.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
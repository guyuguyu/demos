package com.example.demo.entity.gen;

import java.util.Date;

public class TpCommentCollection {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_comment_collection.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_comment_collection.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_comment_collection.comment_id
     *
     * @mbggenerated
     */
    private String commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_comment_collection.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_comment_collection.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_comment_collection.status
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_comment_collection.id
     *
     * @return the value of tp_comment_collection.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_comment_collection.id
     *
     * @param id the value for tp_comment_collection.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_comment_collection.user_id
     *
     * @return the value of tp_comment_collection.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_comment_collection.user_id
     *
     * @param userId the value for tp_comment_collection.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_comment_collection.comment_id
     *
     * @return the value of tp_comment_collection.comment_id
     *
     * @mbggenerated
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_comment_collection.comment_id
     *
     * @param commentId the value for tp_comment_collection.comment_id
     *
     * @mbggenerated
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_comment_collection.create_time
     *
     * @return the value of tp_comment_collection.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_comment_collection.create_time
     *
     * @param createTime the value for tp_comment_collection.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_comment_collection.update_time
     *
     * @return the value of tp_comment_collection.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_comment_collection.update_time
     *
     * @param updateTime the value for tp_comment_collection.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_comment_collection.status
     *
     * @return the value of tp_comment_collection.status
     *
     * @mbggenerated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_comment_collection.status
     *
     * @param status the value for tp_comment_collection.status
     *
     * @mbggenerated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
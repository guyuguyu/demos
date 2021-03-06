package com.example.demo.entity.gen;

import java.util.Date;

public class TProgramOperation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_operation.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_operation.program_id
     *
     * @mbggenerated
     */
    private Long programId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_operation.operater_id
     *
     * @mbggenerated
     */
    private String operaterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_operation.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_operation.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_operation.operater_ip
     *
     * @mbggenerated
     */
    private String operaterIp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_operation.id
     *
     * @return the value of t_program_operation.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_operation.id
     *
     * @param id the value for t_program_operation.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_operation.program_id
     *
     * @return the value of t_program_operation.program_id
     *
     * @mbggenerated
     */
    public Long getProgramId() {
        return programId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_operation.program_id
     *
     * @param programId the value for t_program_operation.program_id
     *
     * @mbggenerated
     */
    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_operation.operater_id
     *
     * @return the value of t_program_operation.operater_id
     *
     * @mbggenerated
     */
    public String getOperaterId() {
        return operaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_operation.operater_id
     *
     * @param operaterId the value for t_program_operation.operater_id
     *
     * @mbggenerated
     */
    public void setOperaterId(String operaterId) {
        this.operaterId = operaterId == null ? null : operaterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_operation.create_time
     *
     * @return the value of t_program_operation.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_operation.create_time
     *
     * @param createTime the value for t_program_operation.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_operation.type
     *
     * @return the value of t_program_operation.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_operation.type
     *
     * @param type the value for t_program_operation.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_operation.operater_ip
     *
     * @return the value of t_program_operation.operater_ip
     *
     * @mbggenerated
     */
    public String getOperaterIp() {
        return operaterIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_operation.operater_ip
     *
     * @param operaterIp the value for t_program_operation.operater_ip
     *
     * @mbggenerated
     */
    public void setOperaterIp(String operaterIp) {
        this.operaterIp = operaterIp == null ? null : operaterIp.trim();
    }
}
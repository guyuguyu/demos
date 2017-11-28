package com.example.demo.entity.gen;

public class VAbumOperation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_operation.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_operation.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_operation.program_id
     *
     * @mbggenerated
     */
    private Long programId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_operation.operater_id
     *
     * @mbggenerated
     */
    private String operaterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_operation.operater_ip
     *
     * @mbggenerated
     */
    private String operaterIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_operation.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_operation.abum_id
     *
     * @mbggenerated
     */
    private Long abumId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_operation.id
     *
     * @return the value of v_abum_operation.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_operation.id
     *
     * @param id the value for v_abum_operation.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_operation.type
     *
     * @return the value of v_abum_operation.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_operation.type
     *
     * @param type the value for v_abum_operation.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_operation.program_id
     *
     * @return the value of v_abum_operation.program_id
     *
     * @mbggenerated
     */
    public Long getProgramId() {
        return programId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_operation.program_id
     *
     * @param programId the value for v_abum_operation.program_id
     *
     * @mbggenerated
     */
    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_operation.operater_id
     *
     * @return the value of v_abum_operation.operater_id
     *
     * @mbggenerated
     */
    public String getOperaterId() {
        return operaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_operation.operater_id
     *
     * @param operaterId the value for v_abum_operation.operater_id
     *
     * @mbggenerated
     */
    public void setOperaterId(String operaterId) {
        this.operaterId = operaterId == null ? null : operaterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_operation.operater_ip
     *
     * @return the value of v_abum_operation.operater_ip
     *
     * @mbggenerated
     */
    public String getOperaterIp() {
        return operaterIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_operation.operater_ip
     *
     * @param operaterIp the value for v_abum_operation.operater_ip
     *
     * @mbggenerated
     */
    public void setOperaterIp(String operaterIp) {
        this.operaterIp = operaterIp == null ? null : operaterIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_operation.name
     *
     * @return the value of v_abum_operation.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_operation.name
     *
     * @param name the value for v_abum_operation.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_operation.abum_id
     *
     * @return the value of v_abum_operation.abum_id
     *
     * @mbggenerated
     */
    public Long getAbumId() {
        return abumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_operation.abum_id
     *
     * @param abumId the value for v_abum_operation.abum_id
     *
     * @mbggenerated
     */
    public void setAbumId(Long abumId) {
        this.abumId = abumId;
    }
}
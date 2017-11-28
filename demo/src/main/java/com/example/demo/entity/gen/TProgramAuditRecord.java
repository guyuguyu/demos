package com.example.demo.entity.gen;

import java.util.Date;

public class TProgramAuditRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_audit_record.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_audit_record.audit_step
     *
     * @mbggenerated
     */
    private String auditStep;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_audit_record.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_audit_record.audit_type
     *
     * @mbggenerated
     */
    private Boolean auditType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_audit_record.audit_note
     *
     * @mbggenerated
     */
    private String auditNote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_audit_record.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_audit_record.process_id
     *
     * @mbggenerated
     */
    private String processId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_program_audit_record.program_id
     *
     * @mbggenerated
     */
    private String programId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_audit_record.id
     *
     * @return the value of t_program_audit_record.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_audit_record.id
     *
     * @param id the value for t_program_audit_record.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_audit_record.audit_step
     *
     * @return the value of t_program_audit_record.audit_step
     *
     * @mbggenerated
     */
    public String getAuditStep() {
        return auditStep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_audit_record.audit_step
     *
     * @param auditStep the value for t_program_audit_record.audit_step
     *
     * @mbggenerated
     */
    public void setAuditStep(String auditStep) {
        this.auditStep = auditStep == null ? null : auditStep.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_audit_record.user_id
     *
     * @return the value of t_program_audit_record.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_audit_record.user_id
     *
     * @param userId the value for t_program_audit_record.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_audit_record.audit_type
     *
     * @return the value of t_program_audit_record.audit_type
     *
     * @mbggenerated
     */
    public Boolean getAuditType() {
        return auditType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_audit_record.audit_type
     *
     * @param auditType the value for t_program_audit_record.audit_type
     *
     * @mbggenerated
     */
    public void setAuditType(Boolean auditType) {
        this.auditType = auditType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_audit_record.audit_note
     *
     * @return the value of t_program_audit_record.audit_note
     *
     * @mbggenerated
     */
    public String getAuditNote() {
        return auditNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_audit_record.audit_note
     *
     * @param auditNote the value for t_program_audit_record.audit_note
     *
     * @mbggenerated
     */
    public void setAuditNote(String auditNote) {
        this.auditNote = auditNote == null ? null : auditNote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_audit_record.create_time
     *
     * @return the value of t_program_audit_record.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_audit_record.create_time
     *
     * @param createTime the value for t_program_audit_record.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_audit_record.process_id
     *
     * @return the value of t_program_audit_record.process_id
     *
     * @mbggenerated
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_audit_record.process_id
     *
     * @param processId the value for t_program_audit_record.process_id
     *
     * @mbggenerated
     */
    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_program_audit_record.program_id
     *
     * @return the value of t_program_audit_record.program_id
     *
     * @mbggenerated
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_program_audit_record.program_id
     *
     * @param programId the value for t_program_audit_record.program_id
     *
     * @mbggenerated
     */
    public void setProgramId(String programId) {
        this.programId = programId == null ? null : programId.trim();
    }
}
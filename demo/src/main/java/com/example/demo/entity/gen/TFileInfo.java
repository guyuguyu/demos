package com.example.demo.entity.gen;

import java.util.Date;

public class TFileInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file_info.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file_info.form_id
     *
     * @mbggenerated
     */
    private String formId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file_info.file_url
     *
     * @mbggenerated
     */
    private String fileUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file_info.file_name
     *
     * @mbggenerated
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file_info.file_size
     *
     * @mbggenerated
     */
    private Long fileSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file_info.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file_info.create_at
     *
     * @mbggenerated
     */
    private Date createAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file_info.id
     *
     * @return the value of t_file_info.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file_info.id
     *
     * @param id the value for t_file_info.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file_info.form_id
     *
     * @return the value of t_file_info.form_id
     *
     * @mbggenerated
     */
    public String getFormId() {
        return formId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file_info.form_id
     *
     * @param formId the value for t_file_info.form_id
     *
     * @mbggenerated
     */
    public void setFormId(String formId) {
        this.formId = formId == null ? null : formId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file_info.file_url
     *
     * @return the value of t_file_info.file_url
     *
     * @mbggenerated
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file_info.file_url
     *
     * @param fileUrl the value for t_file_info.file_url
     *
     * @mbggenerated
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file_info.file_name
     *
     * @return the value of t_file_info.file_name
     *
     * @mbggenerated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file_info.file_name
     *
     * @param fileName the value for t_file_info.file_name
     *
     * @mbggenerated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file_info.file_size
     *
     * @return the value of t_file_info.file_size
     *
     * @mbggenerated
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file_info.file_size
     *
     * @param fileSize the value for t_file_info.file_size
     *
     * @mbggenerated
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file_info.status
     *
     * @return the value of t_file_info.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file_info.status
     *
     * @param status the value for t_file_info.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file_info.create_at
     *
     * @return the value of t_file_info.create_at
     *
     * @mbggenerated
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file_info.create_at
     *
     * @param createAt the value for t_file_info.create_at
     *
     * @mbggenerated
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
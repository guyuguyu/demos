package com.example.demo.entity.gen;

public class TNoticeFile {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_file.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_file.notice_id
     *
     * @mbggenerated
     */
    private String noticeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_file.file_id
     *
     * @mbggenerated
     */
    private String fileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_file.file_ext
     *
     * @mbggenerated
     */
    private String fileExt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_file.file_name
     *
     * @mbggenerated
     */
    private String fileName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_file.id
     *
     * @return the value of t_notice_file.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_file.id
     *
     * @param id the value for t_notice_file.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_file.notice_id
     *
     * @return the value of t_notice_file.notice_id
     *
     * @mbggenerated
     */
    public String getNoticeId() {
        return noticeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_file.notice_id
     *
     * @param noticeId the value for t_notice_file.notice_id
     *
     * @mbggenerated
     */
    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId == null ? null : noticeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_file.file_id
     *
     * @return the value of t_notice_file.file_id
     *
     * @mbggenerated
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_file.file_id
     *
     * @param fileId the value for t_notice_file.file_id
     *
     * @mbggenerated
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_file.file_ext
     *
     * @return the value of t_notice_file.file_ext
     *
     * @mbggenerated
     */
    public String getFileExt() {
        return fileExt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_file.file_ext
     *
     * @param fileExt the value for t_notice_file.file_ext
     *
     * @mbggenerated
     */
    public void setFileExt(String fileExt) {
        this.fileExt = fileExt == null ? null : fileExt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_file.file_name
     *
     * @return the value of t_notice_file.file_name
     *
     * @mbggenerated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_file.file_name
     *
     * @param fileName the value for t_notice_file.file_name
     *
     * @mbggenerated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }
}
package com.example.demo.entity.gen;

public class TNoticeType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_type.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_type.type_id
     *
     * @mbggenerated
     */
    private String typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_type.type_name
     *
     * @mbggenerated
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_type.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_type.type_icon
     *
     * @mbggenerated
     */
    private String typeIcon;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_type.id
     *
     * @return the value of t_notice_type.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_type.id
     *
     * @param id the value for t_notice_type.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_type.type_id
     *
     * @return the value of t_notice_type.type_id
     *
     * @mbggenerated
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_type.type_id
     *
     * @param typeId the value for t_notice_type.type_id
     *
     * @mbggenerated
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_type.type_name
     *
     * @return the value of t_notice_type.type_name
     *
     * @mbggenerated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_type.type_name
     *
     * @param typeName the value for t_notice_type.type_name
     *
     * @mbggenerated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_type.status
     *
     * @return the value of t_notice_type.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_type.status
     *
     * @param status the value for t_notice_type.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_type.type_icon
     *
     * @return the value of t_notice_type.type_icon
     *
     * @mbggenerated
     */
    public String getTypeIcon() {
        return typeIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_type.type_icon
     *
     * @param typeIcon the value for t_notice_type.type_icon
     *
     * @mbggenerated
     */
    public void setTypeIcon(String typeIcon) {
        this.typeIcon = typeIcon == null ? null : typeIcon.trim();
    }
}
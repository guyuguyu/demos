package com.example.demo.entity.gen;

public class VAbumTip {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_tip.tip_name
     *
     * @mbggenerated
     */
    private String tipName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_tip.tip_flag
     *
     * @mbggenerated
     */
    private Integer tipFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_tip.abum_id
     *
     * @mbggenerated
     */
    private Long abumId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_abum_tip.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_tip.tip_name
     *
     * @return the value of v_abum_tip.tip_name
     *
     * @mbggenerated
     */
    public String getTipName() {
        return tipName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_tip.tip_name
     *
     * @param tipName the value for v_abum_tip.tip_name
     *
     * @mbggenerated
     */
    public void setTipName(String tipName) {
        this.tipName = tipName == null ? null : tipName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_tip.tip_flag
     *
     * @return the value of v_abum_tip.tip_flag
     *
     * @mbggenerated
     */
    public Integer getTipFlag() {
        return tipFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_tip.tip_flag
     *
     * @param tipFlag the value for v_abum_tip.tip_flag
     *
     * @mbggenerated
     */
    public void setTipFlag(Integer tipFlag) {
        this.tipFlag = tipFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_tip.abum_id
     *
     * @return the value of v_abum_tip.abum_id
     *
     * @mbggenerated
     */
    public Long getAbumId() {
        return abumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_tip.abum_id
     *
     * @param abumId the value for v_abum_tip.abum_id
     *
     * @mbggenerated
     */
    public void setAbumId(Long abumId) {
        this.abumId = abumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_abum_tip.id
     *
     * @return the value of v_abum_tip.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_abum_tip.id
     *
     * @param id the value for v_abum_tip.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }
}
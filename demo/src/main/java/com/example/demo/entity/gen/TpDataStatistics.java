package com.example.demo.entity.gen;

public class TpDataStatistics {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_data_statistics.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_data_statistics.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_data_statistics.count_key
     *
     * @mbggenerated
     */
    private String countKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_data_statistics.count_value
     *
     * @mbggenerated
     */
    private String countValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_data_statistics.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_data_statistics.id
     *
     * @return the value of tp_data_statistics.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_data_statistics.id
     *
     * @param id the value for tp_data_statistics.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_data_statistics.user_id
     *
     * @return the value of tp_data_statistics.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_data_statistics.user_id
     *
     * @param userId the value for tp_data_statistics.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_data_statistics.count_key
     *
     * @return the value of tp_data_statistics.count_key
     *
     * @mbggenerated
     */
    public String getCountKey() {
        return countKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_data_statistics.count_key
     *
     * @param countKey the value for tp_data_statistics.count_key
     *
     * @mbggenerated
     */
    public void setCountKey(String countKey) {
        this.countKey = countKey == null ? null : countKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_data_statistics.count_value
     *
     * @return the value of tp_data_statistics.count_value
     *
     * @mbggenerated
     */
    public String getCountValue() {
        return countValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_data_statistics.count_value
     *
     * @param countValue the value for tp_data_statistics.count_value
     *
     * @mbggenerated
     */
    public void setCountValue(String countValue) {
        this.countValue = countValue == null ? null : countValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_data_statistics.type
     *
     * @return the value of tp_data_statistics.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_data_statistics.type
     *
     * @param type the value for tp_data_statistics.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }
}
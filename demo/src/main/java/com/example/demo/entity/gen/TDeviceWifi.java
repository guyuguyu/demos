package com.example.demo.entity.gen;

import java.util.Date;

public class TDeviceWifi {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_device_wifi.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_device_wifi.serial_number
     *
     * @mbggenerated
     */
    private String serialNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_device_wifi.ssid
     *
     * @mbggenerated
     */
    private String ssid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_device_wifi.psd
     *
     * @mbggenerated
     */
    private String psd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_device_wifi.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_device_wifi.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_device_wifi.strength
     *
     * @mbggenerated
     */
    private Integer strength;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_device_wifi.connection_speed
     *
     * @mbggenerated
     */
    private String connectionSpeed;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_device_wifi.id
     *
     * @return the value of t_device_wifi.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_device_wifi.id
     *
     * @param id the value for t_device_wifi.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_device_wifi.serial_number
     *
     * @return the value of t_device_wifi.serial_number
     *
     * @mbggenerated
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_device_wifi.serial_number
     *
     * @param serialNumber the value for t_device_wifi.serial_number
     *
     * @mbggenerated
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_device_wifi.ssid
     *
     * @return the value of t_device_wifi.ssid
     *
     * @mbggenerated
     */
    public String getSsid() {
        return ssid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_device_wifi.ssid
     *
     * @param ssid the value for t_device_wifi.ssid
     *
     * @mbggenerated
     */
    public void setSsid(String ssid) {
        this.ssid = ssid == null ? null : ssid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_device_wifi.psd
     *
     * @return the value of t_device_wifi.psd
     *
     * @mbggenerated
     */
    public String getPsd() {
        return psd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_device_wifi.psd
     *
     * @param psd the value for t_device_wifi.psd
     *
     * @mbggenerated
     */
    public void setPsd(String psd) {
        this.psd = psd == null ? null : psd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_device_wifi.create_time
     *
     * @return the value of t_device_wifi.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_device_wifi.create_time
     *
     * @param createTime the value for t_device_wifi.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_device_wifi.status
     *
     * @return the value of t_device_wifi.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_device_wifi.status
     *
     * @param status the value for t_device_wifi.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_device_wifi.strength
     *
     * @return the value of t_device_wifi.strength
     *
     * @mbggenerated
     */
    public Integer getStrength() {
        return strength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_device_wifi.strength
     *
     * @param strength the value for t_device_wifi.strength
     *
     * @mbggenerated
     */
    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_device_wifi.connection_speed
     *
     * @return the value of t_device_wifi.connection_speed
     *
     * @mbggenerated
     */
    public String getConnectionSpeed() {
        return connectionSpeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_device_wifi.connection_speed
     *
     * @param connectionSpeed the value for t_device_wifi.connection_speed
     *
     * @mbggenerated
     */
    public void setConnectionSpeed(String connectionSpeed) {
        this.connectionSpeed = connectionSpeed == null ? null : connectionSpeed.trim();
    }
}
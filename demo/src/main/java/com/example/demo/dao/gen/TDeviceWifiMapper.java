package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TDeviceWifi;
import com.example.demo.entity.gen.TDeviceWifiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeviceWifiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    int countByExample(TDeviceWifiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    int deleteByExample(TDeviceWifiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    int insert(TDeviceWifi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    int insertSelective(TDeviceWifi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    List<TDeviceWifi> selectByExample(TDeviceWifiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    TDeviceWifi selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TDeviceWifi record, @Param("example") TDeviceWifiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TDeviceWifi record, @Param("example") TDeviceWifiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TDeviceWifi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_wifi
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TDeviceWifi record);
}
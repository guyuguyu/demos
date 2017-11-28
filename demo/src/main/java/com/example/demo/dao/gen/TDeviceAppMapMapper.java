package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TDeviceAppMap;
import com.example.demo.entity.gen.TDeviceAppMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeviceAppMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    int countByExample(TDeviceAppMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    int deleteByExample(TDeviceAppMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    int insert(TDeviceAppMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    int insertSelective(TDeviceAppMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    List<TDeviceAppMap> selectByExample(TDeviceAppMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    TDeviceAppMap selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TDeviceAppMap record, @Param("example") TDeviceAppMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TDeviceAppMap record, @Param("example") TDeviceAppMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TDeviceAppMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_app_map
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TDeviceAppMap record);
}
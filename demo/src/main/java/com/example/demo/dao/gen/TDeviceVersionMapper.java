package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TDeviceVersion;
import com.example.demo.entity.gen.TDeviceVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeviceVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    int countByExample(TDeviceVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    int deleteByExample(TDeviceVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    int insert(TDeviceVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    int insertSelective(TDeviceVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    List<TDeviceVersion> selectByExample(TDeviceVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    TDeviceVersion selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TDeviceVersion record, @Param("example") TDeviceVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TDeviceVersion record, @Param("example") TDeviceVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TDeviceVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device_version
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TDeviceVersion record);
}
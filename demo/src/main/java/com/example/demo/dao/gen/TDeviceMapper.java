package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TDevice;
import com.example.demo.entity.gen.TDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    int countByExample(TDeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    int deleteByExample(TDeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    int insert(TDevice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    int insertSelective(TDevice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    List<TDevice> selectByExample(TDeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    TDevice selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TDevice record, @Param("example") TDeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TDevice record, @Param("example") TDeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TDevice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_device
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TDevice record);
}
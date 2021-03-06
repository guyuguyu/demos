package com.example.demo.dao.gen;

import com.example.demo.entity.gen.THTask;
import com.example.demo.entity.gen.THTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    int countByExample(THTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    int deleteByExample(THTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    int insert(THTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    int insertSelective(THTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    List<THTask> selectByExample(THTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    THTask selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") THTask record, @Param("example") THTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") THTask record, @Param("example") THTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(THTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_h_task
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(THTask record);
}
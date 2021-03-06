package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TMsgOperation;
import com.example.demo.entity.gen.TMsgOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMsgOperationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_msg_operation
     *
     * @mbggenerated
     */
    int countByExample(TMsgOperationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_msg_operation
     *
     * @mbggenerated
     */
    int deleteByExample(TMsgOperationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_msg_operation
     *
     * @mbggenerated
     */
    int insert(TMsgOperation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_msg_operation
     *
     * @mbggenerated
     */
    int insertSelective(TMsgOperation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_msg_operation
     *
     * @mbggenerated
     */
    List<TMsgOperation> selectByExample(TMsgOperationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_msg_operation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TMsgOperation record, @Param("example") TMsgOperationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_msg_operation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TMsgOperation record, @Param("example") TMsgOperationExample example);
}
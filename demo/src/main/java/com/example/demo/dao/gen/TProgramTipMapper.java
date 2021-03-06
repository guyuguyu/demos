package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TProgramTip;
import com.example.demo.entity.gen.TProgramTipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProgramTipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    int countByExample(TProgramTipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    int deleteByExample(TProgramTipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    int insert(TProgramTip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    int insertSelective(TProgramTip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    List<TProgramTip> selectByExample(TProgramTipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    TProgramTip selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TProgramTip record, @Param("example") TProgramTipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TProgramTip record, @Param("example") TProgramTipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TProgramTip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_program_tip
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TProgramTip record);
}
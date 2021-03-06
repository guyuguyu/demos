package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TpAbumProgram;
import com.example.demo.entity.gen.TpAbumProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpAbumProgramMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    int countByExample(TpAbumProgramExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    int deleteByExample(TpAbumProgramExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    int insert(TpAbumProgram record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    int insertSelective(TpAbumProgram record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    List<TpAbumProgram> selectByExample(TpAbumProgramExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    TpAbumProgram selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TpAbumProgram record, @Param("example") TpAbumProgramExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TpAbumProgram record, @Param("example") TpAbumProgramExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TpAbumProgram record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_program
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TpAbumProgram record);
}
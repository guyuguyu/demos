package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TCommonProblem;
import com.example.demo.entity.gen.TCommonProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCommonProblemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    int countByExample(TCommonProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    int deleteByExample(TCommonProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    int insert(TCommonProblem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    int insertSelective(TCommonProblem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    List<TCommonProblem> selectByExample(TCommonProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    TCommonProblem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TCommonProblem record, @Param("example") TCommonProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TCommonProblem record, @Param("example") TCommonProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TCommonProblem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_common_problem
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TCommonProblem record);
}
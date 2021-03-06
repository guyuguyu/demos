package com.example.demo.dao.gen;

import com.example.demo.entity.gen.VTProgramSum;
import com.example.demo.entity.gen.VTProgramSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VTProgramSumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_t_program_sum
     *
     * @mbggenerated
     */
    int countByExample(VTProgramSumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_t_program_sum
     *
     * @mbggenerated
     */
    int deleteByExample(VTProgramSumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_t_program_sum
     *
     * @mbggenerated
     */
    int insert(VTProgramSum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_t_program_sum
     *
     * @mbggenerated
     */
    int insertSelective(VTProgramSum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_t_program_sum
     *
     * @mbggenerated
     */
    List<VTProgramSum> selectByExample(VTProgramSumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_t_program_sum
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") VTProgramSum record, @Param("example") VTProgramSumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_t_program_sum
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") VTProgramSum record, @Param("example") VTProgramSumExample example);
}
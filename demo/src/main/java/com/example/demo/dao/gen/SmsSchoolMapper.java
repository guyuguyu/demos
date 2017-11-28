package com.example.demo.dao.gen;

import com.example.demo.entity.gen.SmsSchool;
import com.example.demo.entity.gen.SmsSchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsSchoolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    int countByExample(SmsSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    int deleteByExample(SmsSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    int insert(SmsSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    int insertSelective(SmsSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    List<SmsSchool> selectByExample(SmsSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    SmsSchool selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SmsSchool record, @Param("example") SmsSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SmsSchool record, @Param("example") SmsSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SmsSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_school
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SmsSchool record);
}
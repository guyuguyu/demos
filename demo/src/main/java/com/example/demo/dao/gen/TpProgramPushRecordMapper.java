package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TpProgramPushRecord;
import com.example.demo.entity.gen.TpProgramPushRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpProgramPushRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    int countByExample(TpProgramPushRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    int deleteByExample(TpProgramPushRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    int insert(TpProgramPushRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    int insertSelective(TpProgramPushRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    List<TpProgramPushRecord> selectByExample(TpProgramPushRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    TpProgramPushRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TpProgramPushRecord record, @Param("example") TpProgramPushRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TpProgramPushRecord record, @Param("example") TpProgramPushRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TpProgramPushRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_program_push_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TpProgramPushRecord record);
}
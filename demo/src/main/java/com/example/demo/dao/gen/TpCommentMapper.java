package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TpComment;
import com.example.demo.entity.gen.TpCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    int countByExample(TpCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    int deleteByExample(TpCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    int insert(TpComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    int insertSelective(TpComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    List<TpComment> selectByExample(TpCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    TpComment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TpComment record, @Param("example") TpCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TpComment record, @Param("example") TpCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TpComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TpComment record);
}
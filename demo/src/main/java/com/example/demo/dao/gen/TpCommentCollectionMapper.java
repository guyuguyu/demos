package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TpCommentCollection;
import com.example.demo.entity.gen.TpCommentCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpCommentCollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    int countByExample(TpCommentCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    int deleteByExample(TpCommentCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    int insert(TpCommentCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    int insertSelective(TpCommentCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    List<TpCommentCollection> selectByExample(TpCommentCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    TpCommentCollection selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TpCommentCollection record, @Param("example") TpCommentCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TpCommentCollection record, @Param("example") TpCommentCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TpCommentCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_comment_collection
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TpCommentCollection record);
}
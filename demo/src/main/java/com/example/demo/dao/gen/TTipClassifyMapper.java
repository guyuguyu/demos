package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TTipClassify;
import com.example.demo.entity.gen.TTipClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTipClassifyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    int countByExample(TTipClassifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    int deleteByExample(TTipClassifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    int insert(TTipClassify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    int insertSelective(TTipClassify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    List<TTipClassify> selectByExample(TTipClassifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    TTipClassify selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TTipClassify record, @Param("example") TTipClassifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TTipClassify record, @Param("example") TTipClassifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TTipClassify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_classify
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TTipClassify record);
}
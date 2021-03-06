package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TMedalGrowthNotice;
import com.example.demo.entity.gen.TMedalGrowthNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMedalGrowthNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    int countByExample(TMedalGrowthNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    int deleteByExample(TMedalGrowthNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    int insert(TMedalGrowthNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    int insertSelective(TMedalGrowthNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    List<TMedalGrowthNotice> selectByExample(TMedalGrowthNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    TMedalGrowthNotice selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TMedalGrowthNotice record, @Param("example") TMedalGrowthNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TMedalGrowthNotice record, @Param("example") TMedalGrowthNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TMedalGrowthNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_medal_growth_notice
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TMedalGrowthNotice record);
}
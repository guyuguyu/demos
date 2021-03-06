package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TBanner;
import com.example.demo.entity.gen.TBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    int countByExample(TBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    int deleteByExample(TBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    int insert(TBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    int insertSelective(TBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    List<TBanner> selectByExample(TBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    TBanner selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TBanner record, @Param("example") TBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TBanner record, @Param("example") TBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banner
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TBanner record);
}
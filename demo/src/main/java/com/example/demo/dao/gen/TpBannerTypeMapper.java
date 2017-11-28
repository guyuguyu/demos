package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TpBannerType;
import com.example.demo.entity.gen.TpBannerTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpBannerTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    int countByExample(TpBannerTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    int deleteByExample(TpBannerTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    int insert(TpBannerType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    int insertSelective(TpBannerType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    List<TpBannerType> selectByExample(TpBannerTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    TpBannerType selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TpBannerType record, @Param("example") TpBannerTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TpBannerType record, @Param("example") TpBannerTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TpBannerType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_banner_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TpBannerType record);
}
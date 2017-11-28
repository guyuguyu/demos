package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TWhitelist;
import com.example.demo.entity.gen.TWhitelistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWhitelistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    int countByExample(TWhitelistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    int deleteByExample(TWhitelistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    int insert(TWhitelist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    int insertSelective(TWhitelist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    List<TWhitelist> selectByExample(TWhitelistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    TWhitelist selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TWhitelist record, @Param("example") TWhitelistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TWhitelist record, @Param("example") TWhitelistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TWhitelist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_whitelist
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TWhitelist record);
}
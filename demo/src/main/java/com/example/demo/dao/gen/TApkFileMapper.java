package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TApkFile;
import com.example.demo.entity.gen.TApkFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApkFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int countByExample(TApkFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int deleteByExample(TApkFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int insert(TApkFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int insertSelective(TApkFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    List<TApkFile> selectByExampleWithBLOBs(TApkFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    List<TApkFile> selectByExample(TApkFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    TApkFile selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TApkFile record, @Param("example") TApkFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") TApkFile record, @Param("example") TApkFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TApkFile record, @Param("example") TApkFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TApkFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(TApkFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apk_file
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TApkFile record);
}
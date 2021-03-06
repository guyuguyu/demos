package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TAbumCollection;
import com.example.demo.entity.gen.TAbumCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAbumCollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    int countByExample(TAbumCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    int deleteByExample(TAbumCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    int insert(TAbumCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    int insertSelective(TAbumCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    List<TAbumCollection> selectByExample(TAbumCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    TAbumCollection selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TAbumCollection record, @Param("example") TAbumCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TAbumCollection record, @Param("example") TAbumCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TAbumCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_abum_collection
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TAbumCollection record);
}
package com.example.demo.dao.gen;

import com.example.demo.entity.gen.VAbumCollection;
import com.example.demo.entity.gen.VAbumCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VAbumCollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_collection
     *
     * @mbggenerated
     */
    int countByExample(VAbumCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_collection
     *
     * @mbggenerated
     */
    int deleteByExample(VAbumCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_collection
     *
     * @mbggenerated
     */
    int insert(VAbumCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_collection
     *
     * @mbggenerated
     */
    int insertSelective(VAbumCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_collection
     *
     * @mbggenerated
     */
    List<VAbumCollection> selectByExample(VAbumCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_collection
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") VAbumCollection record, @Param("example") VAbumCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_collection
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") VAbumCollection record, @Param("example") VAbumCollectionExample example);
}
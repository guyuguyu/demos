package com.example.demo.dao.gen;

import com.example.demo.entity.gen.TpAbumPay;
import com.example.demo.entity.gen.TpAbumPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpAbumPayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    int countByExample(TpAbumPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    int deleteByExample(TpAbumPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    int insert(TpAbumPay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    int insertSelective(TpAbumPay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    List<TpAbumPay> selectByExample(TpAbumPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    TpAbumPay selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TpAbumPay record, @Param("example") TpAbumPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TpAbumPay record, @Param("example") TpAbumPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TpAbumPay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_abum_pay
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TpAbumPay record);
}
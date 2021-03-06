package com.example.demo.dao.gen;

import com.example.demo.entity.gen.VAbumTip;
import com.example.demo.entity.gen.VAbumTipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VAbumTipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_tip
     *
     * @mbggenerated
     */
    int countByExample(VAbumTipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_tip
     *
     * @mbggenerated
     */
    int deleteByExample(VAbumTipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_tip
     *
     * @mbggenerated
     */
    int insert(VAbumTip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_tip
     *
     * @mbggenerated
     */
    int insertSelective(VAbumTip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_tip
     *
     * @mbggenerated
     */
    List<VAbumTip> selectByExample(VAbumTipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_tip
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") VAbumTip record, @Param("example") VAbumTipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_abum_tip
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") VAbumTip record, @Param("example") VAbumTipExample example);
}
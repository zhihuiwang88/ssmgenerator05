package com.nengliang.web.dao;

import com.nengliang.web.entity.FieldValues;
import com.nengliang.web.entity.FieldValuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldValuesMapper {
    /**
     * countByExample
     */
    int countByExample(FieldValuesExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(FieldValuesExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(FieldValues record);

    /**
     * insertSelective
     */
    int insertSelective(FieldValues record);

    /**
     * selectByExample
     */
    List<FieldValues> selectByExample(FieldValuesExample example);

    /**
     * selectByPrimaryKey
     */
    FieldValues selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") FieldValues record, @Param("example") FieldValuesExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") FieldValues record, @Param("example") FieldValuesExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(FieldValues record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(FieldValues record);
}
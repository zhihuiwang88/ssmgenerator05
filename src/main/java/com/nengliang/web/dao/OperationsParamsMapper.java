package com.nengliang.web.dao;

import com.nengliang.web.entity.OperationsParams;
import com.nengliang.web.entity.OperationsParamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationsParamsMapper {
    /**
     * countByExample
     */
    int countByExample(OperationsParamsExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(OperationsParamsExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(OperationsParams record);

    /**
     * insertSelective
     */
    int insertSelective(OperationsParams record);

    /**
     * selectByExample
     */
    List<OperationsParams> selectByExample(OperationsParamsExample example);

    /**
     * selectByPrimaryKey
     */
    OperationsParams selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") OperationsParams record, @Param("example") OperationsParamsExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") OperationsParams record, @Param("example") OperationsParamsExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(OperationsParams record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(OperationsParams record);
}
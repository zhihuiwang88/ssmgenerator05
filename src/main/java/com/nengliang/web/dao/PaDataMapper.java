package com.nengliang.web.dao;

import com.nengliang.web.entity.PaData;
import com.nengliang.web.entity.PaDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaDataMapper {
    /**
     * countByExample
     */
    int countByExample(PaDataExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(PaDataExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(PaData record);

    /**
     * insertSelective
     */
    int insertSelective(PaData record);

    /**
     * selectByExample
     */
    List<PaData> selectByExample(PaDataExample example);

    /**
     * selectByPrimaryKey
     */
    PaData selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") PaData record, @Param("example") PaDataExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") PaData record, @Param("example") PaDataExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(PaData record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(PaData record);
}
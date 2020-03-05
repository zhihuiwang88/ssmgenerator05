package com.nengliang.web.dao;

import com.nengliang.web.entity.PaSource;
import com.nengliang.web.entity.PaSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaSourceMapper {
    /**
     * countByExample
     */
    int countByExample(PaSourceExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(PaSourceExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(PaSource record);

    /**
     * insertSelective
     */
    int insertSelective(PaSource record);

    /**
     * selectByExample
     */
    List<PaSource> selectByExample(PaSourceExample example);

    /**
     * selectByPrimaryKey
     */
    PaSource selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") PaSource record, @Param("example") PaSourceExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") PaSource record, @Param("example") PaSourceExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(PaSource record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(PaSource record);
}
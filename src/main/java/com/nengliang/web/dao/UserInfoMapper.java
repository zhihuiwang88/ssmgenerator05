package com.nengliang.web.dao;

import com.nengliang.web.entity.UserInfo;
import com.nengliang.web.entity.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    /**
     * countByExample
     */
    int countByExample(UserInfoExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(UserInfoExample example);

    /**
     * insert
     */
    int insert(UserInfo record);

    /**
     * insertSelective
     */
    int insertSelective(UserInfo record);

    /**
     * selectByExample
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);
}
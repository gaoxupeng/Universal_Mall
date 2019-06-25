package com.malllogin.mapper;


import com.api.entity.H_Admin;
import com.api.entity.H_AdminExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface H_AdminMapper {
    int countByExample(H_AdminExample example);

    int deleteByExample(H_AdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(H_Admin record);

    int insertSelective(H_Admin record);

    List<H_Admin> selectByExample(H_AdminExample example);

    H_Admin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") H_Admin record, @Param("example") H_AdminExample example);

    int updateByExample(@Param("record") H_Admin record, @Param("example") H_AdminExample example);

    int updateByPrimaryKeySelective(H_Admin record);

    int updateByPrimaryKey(H_Admin record);
}
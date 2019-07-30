package com.mall.mapper;


import com.mall.pojo.SpecGroup;
import com.mall.pojo.SpecGroupExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SpecGroupMapper{
    int countByExample(SpecGroupExample example);

    int deleteByExample(SpecGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpecGroup record);

    int insertSelective(SpecGroup record);

    List<SpecGroup> selectByExample(SpecGroupExample example);

    SpecGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpecGroup record, @Param("example") SpecGroupExample example);

    int updateByExample(@Param("record") SpecGroup record, @Param("example") SpecGroupExample example);

    int updateByPrimaryKeySelective(SpecGroup record);

    int updateByPrimaryKey(SpecGroup record);
}

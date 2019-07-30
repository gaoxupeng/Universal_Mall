package com.mall.mapper;

import com.mall.pojo.SpecParam;
import com.mall.pojo.SpecParamExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SpecParamMapper {
    int countByExample(SpecParamExample example);

    int deleteByExample(SpecParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpecParam record);

    int insertSelective(SpecParam record);

    List<SpecParam> selectByExample(SpecParamExample example);

    SpecParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpecParam record, @Param("example") SpecParamExample example);

    int updateByExample(@Param("record") SpecParam record, @Param("example") SpecParamExample example);

    int updateByPrimaryKeySelective(SpecParam record);

    int updateByPrimaryKey(SpecParam record);
}

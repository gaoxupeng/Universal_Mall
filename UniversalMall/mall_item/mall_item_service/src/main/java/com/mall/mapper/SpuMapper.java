package com.mall.mapper;

import com.mall.pojo.Spu;
import com.mall.pojo.SpuExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SpuMapper {
    int countByExample(SpuExample example);

    int deleteByExample(SpuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Spu record);

    int insertSelective(Spu record);

    List<Spu> selectByExample(SpuExample example);

    Spu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Spu record, @Param("example") SpuExample example);

    int updateByExample(@Param("record") Spu record, @Param("example") SpuExample example);

    int updateByPrimaryKeySelective(Spu record);

    int updateByPrimaryKey(Spu record);
}
package com.mall.mapper;

import com.mall.pojo.SpuDetail;
import com.mall.pojo.SpuDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpuDetailMapper {
    int countByExample(SpuDetailExample example);

    int deleteByExample(SpuDetailExample example);

    int deleteByPrimaryKey(Long spuId);

    int insert(SpuDetail record);

    int insertSelective(SpuDetail record);

    List<SpuDetail> selectByExampleWithBLOBs(SpuDetailExample example);

    List<SpuDetail> selectByExample(SpuDetailExample example);

    SpuDetail selectByPrimaryKey(Long spuId);

    int updateByExampleSelective(@Param("record") SpuDetail record, @Param("example") SpuDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") SpuDetail record, @Param("example") SpuDetailExample example);

    int updateByExample(@Param("record") SpuDetail record, @Param("example") SpuDetailExample example);

    int updateByPrimaryKeySelective(SpuDetail record);

    int updateByPrimaryKeyWithBLOBs(SpuDetail record);

    int updateByPrimaryKey(SpuDetail record);
}
package com.mall.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import com.mall.pojo.Brand;

@org.apache.ibatis.annotations.Mapper
public interface BrandMapper extends Mapper<Brand>{

    /**
     * 新增品牌和分类中间表
     * @param cid
     * @param bid
     * @return
     */
    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES (#{cid},#{bid})")
    int insertCategoryBrand(@Param("cid") Long cid,@Param("bid") Long bid);

}

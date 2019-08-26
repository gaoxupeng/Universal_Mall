package com.mall.service;

import com.mall.pojo.BrandQueryByPageParameter;
import com.mall.pojo.PageResult;
import com.mall.pojo.Brand;

import java.util.List;

public interface BrandService {

    /**
     *  分页查询
     * @param brandQueryByPageParameter
     * @return
     */
    PageResult<Brand> queryBrandByPage(BrandQueryByPageParameter brandQueryByPageParameter);


    /**
     * 新增品牌
     * @param brand
     * @param cids
     */
    void saveBrand(Brand brand, List<Long> cids);

    Brand queryById(Long id);
}

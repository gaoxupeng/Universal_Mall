package com.mall.service;

import com.mall.pojo.BrandQueryByPageParameter;
import com.mall.pojo.PageResult;
import com.mall.pojo.Brand;

public interface BrandService {

    /**
     *  分页查询
     * @param brandQueryByPageParameter
     * @return
     */
    PageResult<Brand> queryBrandByPage(BrandQueryByPageParameter brandQueryByPageParameter);

}

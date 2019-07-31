package com.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.mapper.BrandMapper;
import com.mall.pojo.BrandQueryByPageParameter;
import com.mall.pojo.PageResult;
import com.mall.service.BrandService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mall.pojo.Brand;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * 分页查询
     * @param brandQueryByPageParameter
     * @return
     */
    @Override
    public PageResult<Brand> queryBrandByPage(BrandQueryByPageParameter brandQueryByPageParameter) {

        /**
         * 1.分页
         */
        PageHelper.startPage(brandQueryByPageParameter.getPage(),brandQueryByPageParameter.getRows());

        /**
         * 2.排序
         */
        Example example = new Example(Brand.class);
        if (StringUtils.isNotBlank(brandQueryByPageParameter.getSortBy())){
            example.setOrderByClause(brandQueryByPageParameter.getSortBy()+(brandQueryByPageParameter.getDesc()?" DESC":" ASC"));
        }

        /**
         * 3.查询
         */
        if (StringUtils.isNotBlank(brandQueryByPageParameter.getKey())){
            example.createCriteria().orLike("name",brandQueryByPageParameter.getKey()+"%").orEqualTo("letter",brandQueryByPageParameter.getKey().toUpperCase());
        }
        List<Brand> brandList = this.brandMapper.selectByExample(example);

        /**
         * 4.创建PageInfo
         */
        PageInfo<Brand> pageInfo = new PageInfo<>(brandList);

        /**
         * 5.返回分页结果
         */
        return new PageResult<>(pageInfo.getTotal(),pageInfo.getList());
    }

    /**
     * 新增品牌及分类中间表
     * @param brand
     * @param cids
     */
    @Transactional
    public void saveBrand(Brand brand,List<Long> cids){
        //新增品牌信息
        this.brandMapper.insertSelective(brand);
        //新增品牌和分类中间表
        for (Long cid : cids){
            this.brandMapper.insertCategoryBrand(cid,brand.getId());
        }
    }

}

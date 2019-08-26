package com.mall.service.impl;

import com.mall.mapper.SpuMapper;
import com.mall.pojo.Category;
import com.mall.pojo.Spu;
import com.mall.pojo.SpuExample;
import com.mall.service.BrandService;
import com.mall.service.CategoryService;
import com.mall.service.GoodsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private SpuMapper spuMapper;


    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BrandService brandService;


    @Override
    public List<Spu> querySpuBypage(Integer page,Integer rows,Boolean saleable,String key) {
        SpuExample spuExample = new SpuExample();
        if (StringUtils.isNotBlank(key)){
            spuExample.createCriteria().andTitleEqualTo("%"+key+"%");
        }
        if (saleable != null){
            spuExample.createCriteria().andSaleableEqualTo(saleable);
        }
        spuExample.setOrderByClause("last_update_time DESC");
        List<Spu> spuList = spuMapper.selectByExample(spuExample,page,rows);
        return spuList;
    }

    private void loadCategoryAndBrandName(List<Spu> spuList){
        for (Spu spu:spuList){
            //处理分类名称
           List<Category> categoryList =  categoryService.queryByIds(Arrays.asList(spu.getCid1(),spu.getCid2(),spu.getCid3()));

           spu.setCname(StringUtils.join(categoryList,"/"));

           //处理品牌名称
            spu.getBname(brandService.queryById(spu.getBrandId()).getName());
        }

    }
}

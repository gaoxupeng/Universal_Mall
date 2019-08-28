package com.mall.service.impl;

import com.mall.mapper.SkuMapper;
import com.mall.mapper.SpuDetailMapper;
import com.mall.mapper.SpuMapper;
import com.mall.mapper.StockMapper;
import com.mall.pojo.*;
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
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private SpuMapper spuMapper;

    @Autowired
    private SpuDetailMapper spuDetailMapper;

    @Autowired
    private SkuMapper skuMapper;

    @Autowired
    private StockMapper stockMapper;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BrandService brandService;



    /**
     * 查询商品列表
     * @param page
     * @param rows
     * @param saleable
     * @param key
     * @return
     */
    @Override
    public List<Spu> querySpuBypage(Integer page,Integer rows,Boolean saleable,String key) {
        SpuExample spuExample = new SpuExample();
        if (StringUtils.isNotBlank(key)){
            spuExample.createCriteria().andTitleEqualTo("%"+key+"%");
        }
        if (saleable != null){
            spuExample.createCriteria().andSaleableEqualTo(saleable);
        }
        //按照最后修改时间排序
        spuExample.setOrderByClause("last_update_time DESC");
        spuExample.setPage(1);
        spuExample.setRows(5);
        List<Spu> spuList = spuMapper.selectByExample(spuExample);
        return spuList;
    }

    /**
     * 商品新增
     * @param spu
     */
    @Override
    public void saveGoods(Spu spu) {
        //新增spu
        spu.setId(null);
        spu.setCreateTime(new Date());
        spu.setLastUpdateTime(spu.getCreateTime());
        spu.setSaleable(true);
        spu.setValid(false);
        int count = spuMapper.insertSelective(spu);
        if (count != 1){
            //新增失败
        }

        //新增detail
         SpuDetail detail = spu.getSpuDetail();
         detail.setSpuId(spu.getId());
         spuDetailMapper.insert(detail);

         List<Stock> stockList = new ArrayList<>();
         //新增sku
        List<Sku> skus = spu.getSkus();
        for (int i = 0; i <skus.size() ; i++) {
            skus.get(i).setCreateTime(new Date());
            skus.get(i).setLastUpdateTime(skus.get(i).getCreateTime());
            skus.get(i).setSpuId(skus.get(i).getId());
            skuMapper.insert(skus.get(i));

            //新增库存
            Stock stock = new Stock();
            stock.setSkuId(skus.get(i).getId());
            stock.setStock(skus.get(i).getStock());
            stockList.add(stock);
        }
        stockMapper.insertStockList(stockList);
    }


    private void loadCategoryAndBrandName(List<Spu> spuList){
        for (Spu spu:spuList){
            //处理分类名称
           List<Category> categoryList =  categoryService.queryByIds(Arrays.asList(spu.getCid1(),spu.getCid2(),spu.getCid3()));

           spu.setCname(StringUtils.join(categoryList,"/"));

           //处理品牌名称
           String name =  brandService.queryById(spu.getBrandId()).getName();
            spu.setBname(name);
        }

    }
}

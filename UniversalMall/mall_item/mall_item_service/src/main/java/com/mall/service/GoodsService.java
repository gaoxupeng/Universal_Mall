package com.mall.service;

import com.mall.pojo.Spu;

import java.util.List;

public interface GoodsService {

    /**
     * 分页查询
     * @param page
     * @param rows
     * @param saleable
     * @param key
     * @return
     */
    List<Spu> querySpuBypage(Integer page,Integer rows,Boolean saleable,String key);

    /**
     * 商品新增
     * @param spu
     */
    void saveGoods(Spu spu);
}

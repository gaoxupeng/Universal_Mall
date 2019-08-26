package com.mall.service;

import com.mall.pojo.Spu;

import java.util.List;

public interface GoodsService {

    List<Spu> querySpuBypage(Integer page,Integer rows,Boolean saleable,String key);
}

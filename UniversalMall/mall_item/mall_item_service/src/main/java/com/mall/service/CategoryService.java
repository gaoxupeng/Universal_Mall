package com.mall.service;

import com.mall.pojo.Category;

import java.util.List;

public interface CategoryService {

    /**
     * 根据id查询分类
     * @param pid
     * @return
     */
     List<Category> queryCategoryByPid(Long pid);
}

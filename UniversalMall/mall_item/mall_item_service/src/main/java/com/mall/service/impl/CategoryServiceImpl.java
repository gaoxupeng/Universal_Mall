package com.mall.service.impl;

import com.mall.mapper.CategoryMapper;
import com.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import pojo.Category;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapperl;

    /**
     * 根据父节点id查询分类
     * @param pid
     * @return
     */
    @Override
    public List<Category> queryCategoryByPid(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        List<Category> list = categoryMapperl.select(category);
        if (CollectionUtils.isEmpty(list)){

        }
        return list;
    }
}

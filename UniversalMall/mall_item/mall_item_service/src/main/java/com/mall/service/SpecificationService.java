package com.mall.service;

import com.mall.pojo.SpecGroup;
import com.mall.pojo.SpecParam;

import java.util.List;


public interface SpecificationService {

    /**
     * 规格参数查询
     * @param cid
     * @return
     */
    List<SpecGroup> queryGroupByCid(long cid);

    /**
     * 查询规格参数组对应的参数设置详情
     * @param groupId
     * @return
     */
    List<SpecParam> queryParamByCid(long groupId);
}

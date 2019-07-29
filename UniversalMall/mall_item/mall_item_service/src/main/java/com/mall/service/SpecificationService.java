package com.mall.service;

import pojo.SpecGroup;
import pojo.SpecParam;

import java.util.List;


public interface SpecificationService {

    /**
     * 规格参数查询
     * @param cid
     * @return
     */
    public List<SpecGroup> queryGroupByCid(long cid);

    public List<SpecParam> queryParamByCid(long gid);
}

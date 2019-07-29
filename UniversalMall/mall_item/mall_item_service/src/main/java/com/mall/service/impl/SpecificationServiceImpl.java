package com.mall.service.impl;

import com.mall.mapper.SpecGroupMapper;
import com.mall.mapper.SpecParamMapper;
import com.mall.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import pojo.SpecGroup;
import pojo.SpecParam;

import java.util.List;

@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private SpecGroupMapper specGroupMapper;

    @Autowired
    private SpecParamMapper specParamMapper;
    /**
     * 规格参数查询
     * @param cid
     * @return
     */
    @Override
    public List<SpecGroup> queryGroupByCid(long cid) {
        SpecGroup specGroup = new SpecGroup();
        specGroup.setCid(cid);
        List<SpecGroup> specGroupList = specGroupMapper.select(specGroup);
        if (CollectionUtils.isEmpty(specGroupList)){

        }
        return specGroupList;
    }

    @Override
    public List<SpecParam> queryParamByCid(long gid){
        SpecParam specParam = new SpecParam();
        List<SpecParam> specParamList = specParamMapper.select(specParam);
        return specParamList;
    }
}

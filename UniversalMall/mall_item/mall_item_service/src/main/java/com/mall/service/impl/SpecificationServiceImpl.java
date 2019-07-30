package com.mall.service.impl;

import com.mall.mapper.SpecGroupMapper;
import com.mall.mapper.SpecParamMapper;
import com.mall.pojo.SpecGroup;
import com.mall.pojo.SpecGroupExample;
import com.mall.pojo.SpecParam;
import com.mall.pojo.SpecParamExample;
import com.mall.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
        SpecGroupExample specGroup = new SpecGroupExample();
        specGroup.createCriteria().andCidEqualTo(cid);
        List<SpecGroup> specGroupList = specGroupMapper.selectByExample(specGroup);
        if (CollectionUtils.isEmpty(specGroupList)){

        }
        return specGroupList;
    }

    /**
     * 查询规格参数组对应的参数设置详情
     * @param groupId
     * @return
     */
    @Override
    public List<SpecParam> queryParamByCid(long groupId){
        SpecParamExample specParam = new SpecParamExample();
        specParam.createCriteria().andGroupIdEqualTo(groupId);
        List<SpecParam> specParamList = specParamMapper.selectByExample(specParam);
        return specParamList;
    }
}

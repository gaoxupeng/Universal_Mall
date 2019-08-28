package com.mall.controller;

import com.mall.pojo.SpecGroup;
import com.mall.pojo.SpecParam;
import com.mall.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("spec")
@RestController
public class SpecificationController {

    @Autowired
    private SpecificationService specificationService;

    /**
     * 规格参数查询
     * @param cid
     * @return
     */
    @GetMapping("groups/{cid}")
    public ResponseEntity<List<SpecGroup>> queryGroupByCid(@PathVariable("cid")Long cid){
        return ResponseEntity.ok(specificationService.queryGroupByCid(cid));
    }


    /**
     * 查询规格参数组对应的参数设置详情
     * @param groupId
     * @return
     */
    @GetMapping("params")
    public ResponseEntity<List<SpecParam>> queryParamList(
            @RequestParam(value = "gid",required = false) Long groupId,
            @RequestParam(value = "cid",required = false) Long cid){
        return ResponseEntity.ok(specificationService.queryParamList(groupId,cid));
    }
}

package com.mall.controller;

import com.mall.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pojo.SpecGroup;
import pojo.SpecParam;

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


    @GetMapping("params")
    public ResponseEntity<List<SpecParam>> queryParamByCid(@RequestParam("gid") long gid){
        return ResponseEntity.ok(specificationService.queryParamByCid(gid));
    }

}

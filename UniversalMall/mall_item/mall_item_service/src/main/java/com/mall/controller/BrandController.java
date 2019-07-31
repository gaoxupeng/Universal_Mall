package com.mall.controller;

import com.mall.pojo.BrandQueryByPageParameter;
import com.mall.pojo.PageResult;
import com.mall.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mall.pojo.Brand;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    /**
     *  分页查询
     * @param page 当前页
     * @param rows 每页大小
     * @param sortBy 排序字段
     * @param desc 是否降序
     * @param key 搜索条件
     * @return
     */
    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> page(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                      @RequestParam(value = "rows", defaultValue = "5") Integer rows,
                                      @RequestParam(value = "sortBy", required = false) String sortBy,
                                      @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
                                      @RequestParam(value = "key", required = false) String key){
        BrandQueryByPageParameter brandQueryByPageParameter = new BrandQueryByPageParameter(page,rows,sortBy,desc,key);
        PageResult<Brand> result = this.brandService.queryBrandByPage(brandQueryByPageParameter);
        if(result == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 新增品牌
     * @param brand
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> saveBrand(Brand brand, @RequestParam("cids")List<Long> cids){
        this.brandService.saveBrand(brand, cids);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

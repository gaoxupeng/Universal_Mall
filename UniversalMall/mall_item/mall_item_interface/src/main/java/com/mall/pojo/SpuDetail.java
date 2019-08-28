package com.mall.pojo;

import lombok.Data;

@Data
public class SpuDetail {
    private Long spuId;

    private String genericSpec;

    private String specialSpec;

    private String packingList;

    private String afterService;

    private String description;

}
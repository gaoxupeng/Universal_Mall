package com.mall.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Sku {
    private Long id;

    private Long spuId;

    private String title;

    private String images;

    private Long price;

    private String indexes;

    private String ownSpec;

    private Boolean enable;

    private Date createTime;

    private Date lastUpdateTime;


    //库存
    private Integer stock;
}
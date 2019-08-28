package com.mall.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

@Data
public class Spu {
    private Long id;

    private String title;

    private String subTitle;

    private Long cid1;

    private Long cid2;

    private Long cid3;

    private Long brandId;

    private Boolean saleable;

    private Boolean valid;

    private Date createTime;

    //@JsonIgnore
    private Date lastUpdateTime;

    //@Transient
    private String cname;
    private String bname;


    private List<Sku> skus;

    private SpuDetail spuDetail;
}
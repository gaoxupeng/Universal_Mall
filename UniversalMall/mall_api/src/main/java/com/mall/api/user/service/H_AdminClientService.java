package com.mall.api.user.service;


import com.mall.api.user.entity.H_Admin;
import com.mall.api.user.entity.H_AdminExample;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "LOGIN",fallbackFactory= H_AdminClientFallbackFactory.class)
public interface H_AdminClientService {

    @RequestMapping("/hello")
    public String hello();

    @RequestMapping("/getAllUser")
    public List<H_Admin> getAllUser(H_AdminExample example);
}
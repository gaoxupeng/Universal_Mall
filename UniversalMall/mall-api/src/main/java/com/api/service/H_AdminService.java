package com.api.service;

import com.api.entity.H_Admin;
import com.api.entity.H_AdminExample;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "login-provide",fallbackFactory=H_AdminFallbackFactory.class)
public interface H_AdminService {
    @RequestMapping("/hello")
    public String hello();

    public List<H_Admin> getAllUser(H_AdminExample example);
}
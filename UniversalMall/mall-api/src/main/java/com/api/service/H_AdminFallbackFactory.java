package com.api.service;

import com.api.entity.H_Admin;
import com.api.entity.H_AdminExample;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // 不要忘记添加，不要忘记添加
public class H_AdminFallbackFactory implements FallbackFactory<H_AdminService> {
    @Override
    public H_AdminService create(Throwable throwable) {
        return  new H_AdminService() {
            @Override
            public String hello() {
                return "测试FallbackFactory";
            }

            @Override
            public List<H_Admin> getAllUser(H_AdminExample example) {
                return null;
            }
        };
    }
}

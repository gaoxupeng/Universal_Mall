package com.login.controller;

import com.api.entity.H_Admin;
import com.api.entity.H_AdminExample;
import com.malllogin.service.H_AdminService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class H_AdminFallbackFactory implements FallbackFactory<H_AdminService> {

    @Override
    public H_AdminService create(Throwable throwable) {
        return new H_AdminService() {
            @Override
            public List<H_Admin> getAllUser(H_AdminExample example) {
                return null;
            }

            @Override
            public H_Admin getHadmin(long id) {
                return null;
            }

            @Override
            public String hello() {
                return "hellO";
            }

            @Override
            public int doLogin(String userName, String passWord) {
                return 0;
            }
        };
    }
}

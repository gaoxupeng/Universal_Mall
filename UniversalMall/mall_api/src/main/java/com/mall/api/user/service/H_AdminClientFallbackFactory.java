package com.mall.api.user.service;

import com.mall.api.user.entity.H_Admin;
import com.mall.api.user.entity.H_AdminExample;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;


@Component // 不要忘记添加，不要忘记添加
public class H_AdminClientFallbackFactory implements FallbackFactory<H_AdminClientService> {
    @Override
    public H_AdminClientService create(Throwable throwable) {
        return  new H_AdminClientService() {
            @Override
            public String hello() {
                return "该服务暂时无法使用";
            }

            @Override
            public List<H_Admin> getAllUser(H_AdminExample example) {
                List<H_Admin>  h_adminExample = null ;
                return h_adminExample;
            }
        };
    }
}

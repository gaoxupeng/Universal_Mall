package com.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.mall.mapper")
public class MallItemAppLication {
        public static void main(String[] args) {
            SpringApplication.run(MallItemAppLication.class, args);
    }
}

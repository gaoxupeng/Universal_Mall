package com.malllogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.malllogin.mapper.*")
public class MallLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallLoginApplication.class, args);
    }

}

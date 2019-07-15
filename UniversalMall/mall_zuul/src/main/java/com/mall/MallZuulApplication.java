package com.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class MallZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallZuulApplication.class, args);
    }

}

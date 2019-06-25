package com.login.controller;

import com.api.entity.H_Admin;
import com.api.entity.H_AdminExample;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class H_AdminController {

    private static final String REST_URL_PREFIX = "http://login-provide";

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate; // HTTP 访问操作类

    @RequestMapping("/getAllUser")
    public List<H_Admin> getUserList(H_AdminExample example){
        return restTemplate.getForObject( REST_URL_PREFIX+"/getAllUser",List.class );
    }

    @RequestMapping("/getHadmin/id={id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public H_Admin getHadmin(@PathVariable("id")long id){
        return restTemplate.getForObject( REST_URL_PREFIX+"/getHadmin?id={id}",H_Admin.class,id );
    }

    @RequestMapping("/hello")
    public String hello(){
        return restTemplate.getForObject( REST_URL_PREFIX+"/hello",String.class);
    }

    public H_Admin processHystrix_Get(@PathVariable("id")long id){
        H_Admin h_admin = new H_Admin();
        h_admin.setUsername("123");
        return h_admin;
    }
}

package com.mall.login.controller;


import com.mall.api.user.entity.H_Admin;
import com.mall.api.user.entity.H_AdminExample;
import com.mall.api.user.service.H_AdminClientService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class H_AdminController {

    private static final String REST_URL_PREFIX = "http://login";


    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate; // HTTP 访问操作类

    @Autowired
    private H_AdminClientService h_adminClientService = null;

    /**
     * 登录
     * @param userName
     * @param passWord
     * @return
     */
    @RequestMapping("/doLogin")
    @ResponseBody
    public String doLogin(@Param("userName") String userName, @Param("passWord") String passWord){
        String url = REST_URL_PREFIX+"/doLogin?userName="+userName+"&passWord="+passWord+"";
        int a = restTemplate.getForObject(url,int.class);
        if (a > 0) {
            return "登陆成功";
        }else{
            return "账号密码错误";
        }

    }

    /**
     * 查询所有用户
     * @param example
     * @return
     */
    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<H_Admin> getUserList(H_AdminExample example){
        return h_adminClientService.getAllUser(example);
    }


    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    @RequestMapping("/getHadmin/id={id}")
    @ResponseBody
    public H_Admin getHadmin(@PathVariable("id")long id){
        return restTemplate.getForObject( REST_URL_PREFIX+"/getHadmin?id={id}",H_Admin.class,id );
    }

    /**
     * 失败调用方法
     * @param id
     * @return
     */
    public H_Admin processHystrix_Get(@PathVariable("id")long id){
        H_Admin h_admin = new H_Admin();
        h_admin.setUsername("123");
        return h_admin;
    }

//    /**
//     * 打开登录页
//     * @return
//     */
//    @RequestMapping("/login")
//    public String HTML(){
//        return "/login";
//    }



    @RequestMapping("/hello")
    public String demo() {
        return h_adminClientService.hello();
    }
}

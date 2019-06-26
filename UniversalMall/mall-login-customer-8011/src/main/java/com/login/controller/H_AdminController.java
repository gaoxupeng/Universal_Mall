package com.login.controller;

import com.api.entity.H_Admin;
import com.api.entity.H_AdminExample;
import com.api.service.H_AdminService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class H_AdminController {

    private static final String REST_URL_PREFIX = "http://login-provide";


    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate; // HTTP 访问操作类

    private H_AdminService h_adminService;

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
    public List<H_Admin> getUserList(H_AdminExample example){
        return restTemplate.getForObject( REST_URL_PREFIX+"/getAllUser",List.class );
    }


    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    @RequestMapping("/getHadmin/id={id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
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

    /**
     * 打开登录页
     * @return
     */
    @RequestMapping("/login")
    public String HTML(){
        return "/login";
    }

}

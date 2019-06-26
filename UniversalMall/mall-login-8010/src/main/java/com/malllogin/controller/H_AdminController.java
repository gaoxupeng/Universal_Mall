package com.malllogin.controller;


import com.api.entity.H_Admin;
import com.api.entity.H_AdminExample;
import com.malllogin.service.H_AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("ALL")
@RestController
public class H_AdminController {

    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    @Autowired
    private H_AdminService h_AdminService;

    /**
     * 查询所有用户
     * @param example
     * @return
     */
    @RequestMapping("/getAllUser")
    public List<H_Admin> getAllUser(H_AdminExample example) {
        List<H_Admin> adminList= h_AdminService.getAllUser(example);
        return adminList;
    }

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    @RequestMapping("/getHadmin")
    public H_Admin getHadmin(long id){
        H_Admin h_Admin = h_AdminService.getHadmin(id);
        return h_Admin;
    }

    /**
     * 登录验证
     * @param userName
     * @param passWord
     * @return
     */
    @RequestMapping("/doLogin")
    public int doLogin(String userName,String passWord){
        int a = h_AdminService.doLogin(userName,passWord);
        return a;
    }
}

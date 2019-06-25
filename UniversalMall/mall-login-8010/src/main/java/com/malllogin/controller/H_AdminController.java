package com.malllogin.controller;


import com.api.entity.H_Admin;
import com.api.entity.H_AdminExample;
import com.malllogin.service.H_AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class H_AdminController {

    @Autowired
    private H_AdminService h_adminService;

    @RequestMapping("/getAllUser")
    public List<H_Admin> getAllUser(H_AdminExample example) {
        List<H_Admin> adminList= h_adminService.getAllUser(example);
        return adminList;
    }

    @RequestMapping("/getHadmin")
    public H_Admin getHadmin(long id){
        H_Admin h_admin = h_adminService.getHadmin(id);
        return h_admin;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello word";
    }

    @RequestMapping("/ceshi")
    public int ceshi(){
        int num = 0;
        int min = 50;
        int max = 100;
        for(int i=0;i<1;i++){
           num = new Random().nextInt(max-min)+min;
        }
        return num;
    }
}

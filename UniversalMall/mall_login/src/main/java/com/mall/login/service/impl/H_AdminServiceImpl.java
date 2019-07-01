package com.mall.login.service.impl;


import com.mall.api.user.entity.H_Admin;
import com.mall.api.user.entity.H_AdminExample;
import com.mall.api.user.mapper.H_AdminMapper;
import com.mall.login.service.H_AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class H_AdminServiceImpl implements H_AdminService {

    @Autowired
    private H_AdminMapper h_adminMapper;


    public List<H_Admin> getAllUser(H_AdminExample example) {
        List<H_Admin> adminList= h_adminMapper.selectByExample(example);
        return adminList;
    }

    public H_Admin getHadmin(long id){
        H_Admin h_admin = h_adminMapper.selectByPrimaryKey(id);
        return h_admin;
    }

    public String hello(){
        return "hello word";
    }

    public int doLogin(String userName, String passWord) {
        return 0;
    }

//    @Override
//    public int doLogin(String userName, String passWord) {
//        int a = h_adminMapper.selectIsUser(userName,passWord);
//        return a;
//    }
}

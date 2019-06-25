package com.malllogin.service.impl;


import com.api.entity.H_Admin;
import com.api.entity.H_AdminExample;
import com.malllogin.mapper.H_AdminMapper;
import com.malllogin.service.H_AdminService;
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
}

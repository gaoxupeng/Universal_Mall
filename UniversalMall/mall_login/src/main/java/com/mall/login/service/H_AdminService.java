package com.mall.login.service;


import com.mall.api.user.entity.H_Admin;
import com.mall.api.user.entity.H_AdminExample;

import java.util.List;

public interface H_AdminService {

    public  List<H_Admin> getAllUser(H_AdminExample example);


    public H_Admin getHadmin(long id);


    public String hello();

    public int doLogin(String userName, String passWord);
}

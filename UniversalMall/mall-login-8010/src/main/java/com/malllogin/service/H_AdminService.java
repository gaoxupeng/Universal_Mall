package com.malllogin.service;




import com.api.entity.H_Admin;
import com.api.entity.H_AdminExample;

import java.util.List;

public interface H_AdminService {

    public  List<H_Admin> getAllUser(H_AdminExample example);


    public H_Admin getHadmin(long id);


    public String hello();
}

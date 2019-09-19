package com.yingxiaotian.service.impl;

import com.yingxiaotian.dao.TbUsersMapper;
import com.yingxiaotian.pojo.TbUsers;
import com.yingxiaotian.service.TbUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUsersServiceImpl implements TbUsersService {

    @Autowired
    private TbUsersMapper usersMapper;

    public List<TbUsers> findAll() {
        return usersMapper.findAll();
    }

    public boolean login(TbUsers users) {
        TbUsers tbUsers=  usersMapper.findByUsernameTopassword(users);
        if (tbUsers==null){
            return false;
        }
        return true;
    }


    public boolean selectRole(String username) {
        String userRole= usersMapper.selectRole(username);
        if (userRole==null){
            return false;
        }
        if (userRole=="1"){
            return true;
        }
        return false;
    }
}

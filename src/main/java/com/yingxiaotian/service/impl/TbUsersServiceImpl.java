package com.yingxiaotian.service.impl;

import com.yingxiaotian.dao.UsersMapper;
import com.yingxiaotian.pojo.Users;
import com.yingxiaotian.pojo.UsersExample;
import com.yingxiaotian.service.TbUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUsersServiceImpl implements TbUsersService {

    @Autowired
    private UsersMapper usersMapper;

    public List<Users> findAll() {
        return usersMapper.selectByExample(null);
    }

    public boolean login(Users users) {
        UsersExample example=new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(users.getUsername());
        criteria.andPasswordEqualTo(users.getPassword());
        Users users1=  usersMapper.selectByExample(example).get(0);
        if (users1==null){
            return false;
        }
        return true;
    }
    public boolean selectRole(String username) {
        UsersExample example=new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        Users users= usersMapper.selectByExample(example).get(0);
        if (users==null){
            return false;
        }
        if (users.getUserRole()=="1"){
            return true;
        }
        return false;
    }
}
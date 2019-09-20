package com.yingxiaotian.service.impl;

import com.yingxiaotian.dao.UsersMapper;
import com.yingxiaotian.pojo.Users;
import com.yingxiaotian.pojo.UsersExample;
import com.yingxiaotian.service.TbUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
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
        if (users.getUserRole()=="2"){
            return true;
        }
        return false;
    }

    public Users findOne(String username) {
        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        Users users = usersMapper.selectByExample(example).get(0);

        return users;
    }

    public List<String> findByUsername(String username) {
        Date today = new Date();
        List<String> userToroomList = new ArrayList<String>();
        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameLike(username);
        criteria.andXdDateGreaterThan(today);
        criteria.andRzDateLessThan(today);
        List<Users> users = usersMapper.selectByExample(example);
        for (Users user : users) {
            String userToroom = user.getUserToroom();
            userToroomList.add(userToroom);
        }
        return userToroomList;
    }

    public void deleteUsers(String username) {
        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        usersMapper.deleteByExample(example);
    }


    /**
     * 新建用户
     * @param users
     */
    public void addUsers(Users users) {
        UUID uuid = UUID.randomUUID();
        String s= uuid.toString();
        users.setId(s);
        usersMapper.insert(users);
    }
}

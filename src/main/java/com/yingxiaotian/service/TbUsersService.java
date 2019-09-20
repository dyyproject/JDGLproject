package com.yingxiaotian.service;

import com.yingxiaotian.pojo.Users;

import java.util.List;

public interface TbUsersService {

    List<Users> findAll();

    boolean login(Users users);

    boolean selectRole(String username);

    Users findOne(String username);

    /**
     * 根据用户名，返回房间号，模糊查询
     * @param username
     * @return
     */
    List<String> findByUsername(String username);




    void deleteUsers(String username);

    void addUsers(Users users);

    void updateUser(Users users);
}

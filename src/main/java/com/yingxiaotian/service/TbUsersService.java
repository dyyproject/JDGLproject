package com.yingxiaotian.service;

import com.yingxiaotian.pojo.Users;

import java.util.List;

public interface TbUsersService {

    List<Users> findAll();

    boolean login(Users users);

    boolean selectRole(String username);
}

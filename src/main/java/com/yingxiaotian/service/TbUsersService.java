package com.yingxiaotian.service;

import com.yingxiaotian.pojo.TbUsers;

import java.util.List;

public interface TbUsersService {

    List<TbUsers> findAll();

    boolean login(TbUsers users);

    boolean selectRole(String username);
}

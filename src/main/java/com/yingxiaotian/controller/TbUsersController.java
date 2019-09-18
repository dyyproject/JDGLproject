package com.yingxiaotian.controller;

import com.yingxiaotian.pojo.TbUsers;
import com.yingxiaotian.service.TbUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class TbUsersController {

    @Autowired
    private TbUsersService usersService;

    @RequestMapping("/findAll")
    private List<TbUsers> findAll(){
        return usersService.findAll();
    }
}

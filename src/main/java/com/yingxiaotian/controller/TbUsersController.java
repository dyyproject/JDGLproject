package com.yingxiaotian.controller;

import com.yingxiaotian.pojo.Result;
import com.yingxiaotian.pojo.Users;
import com.yingxiaotian.service.TbUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class TbUsersController {

    @Autowired
    private TbUsersService usersService;

    @RequestMapping("/findAll")
    private List<Users> findAll(){
        return usersService.findAll();
    }

    @RequestMapping("/loginUsers")
    private Result loginUsers(@RequestBody Users users ){
        boolean b=  usersService.login(users);
        if (b){
            return new Result(b,"登录成功");
        }
        return new Result(b,"登录失败！账号密码错误");
    }

    @RequestMapping("/selectUsername")
    private Map selectUsername(){
        HashMap<String, String> map = new HashMap<String, String>();
         String username=SecurityContextHolder.getContext().getAuthentication().getName();
        map.put("username",username);
         return map;
    }

    @RequestMapping("/findOne")
    private Users findOne(){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return usersService.findOne(username);
    }
}

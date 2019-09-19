package com.yingxiaotian.controller;

import com.yingxiaotian.pojo.Result;
import com.yingxiaotian.pojo.TbUsers;
import com.yingxiaotian.service.TbUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping("/loginUsers")
    private Result loginUsers(@RequestBody TbUsers users ){
        boolean b=  usersService.login(users);
        if (b){
            return new Result(b,"登录成功");
        }
        return new Result(b,"登录失败！账号密码错误");
    }

    @RequestMapping("/selectRole")
    private Result selectRole(String username){
        boolean b=  usersService.selectRole(username);
        if (b){
            return new Result(b,"权限为1");
        }
        return new Result(b,"权限为2");
    }
}

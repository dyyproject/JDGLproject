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
        List<Users> all = usersService.findAll();

        for (Users users : all) {

            System.out.println(users.getUserRole());
        }
        return all;
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

    @RequestMapping("/findName")
    private Users findName(){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return usersService.findOne(username);
    }

    @RequestMapping("/findOne")
    private Users findOne(String username){

        return usersService.findOne(username);
    }
    /**
     * 删除用户
     */
    @RequestMapping("/deleteUsers")
    private Result delete(String username){
        try {
            usersService.deleteUsers(username);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    /**
     * 新建用户
     */
    @RequestMapping("/addUsers")
    private Result addUsers(@RequestBody Users users){
        try {
            usersService.addUsers(users);
            return new Result(true,"添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }

    @RequestMapping("/updateUser")
    private Result updateUser(@RequestBody Users users){
        try {
            usersService.updateUser(users);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }
}

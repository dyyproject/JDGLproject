package com.yingxiaotian.dao;

import com.yingxiaotian.pojo.TbUsers;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbUsersMapper {

    @Select("select * from users")
    List<TbUsers> findAll();

    @Select("select * from users where username=#{username} and password =#{password}")
    @Results({

            @Result(id=true, column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "password",property = "password"),
            @Result(column = "user_role",property = "userRole"),
            @Result(column = "user_toroom",property = "userToroom"),
            @Result(column = "idcard",property = "idcard")
    })
    TbUsers findByUsernameTopassword(TbUsers users);

    @Select("select user_role from users where username = #{username}")
    String selectRole(String username);
}

package com.yingxiaotian.dao;

import com.yingxiaotian.pojo.TbUsers;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbUsersMapper {

    @Select("select * from users")
    List<TbUsers> findAll();

}

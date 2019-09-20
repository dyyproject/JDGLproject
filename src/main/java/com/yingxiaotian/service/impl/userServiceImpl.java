package com.yingxiaotian.service.impl;

import com.yingxiaotian.dao.UsersMapper;
import com.yingxiaotian.pojo.Users;
import com.yingxiaotian.pojo.UsersExample;
import javafx.beans.property.SimpleListProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class userServiceImpl implements UserDetailsService {

    @Autowired
    private UsersMapper usersMapper;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = null;
        try {
            UsersExample example = new UsersExample();
            UsersExample.Criteria criteria = example.createCriteria();
            UsersExample.Criteria criteria1 = criteria.andUsernameEqualTo(username);
            Users users = usersMapper.selectByExample(example).get(0);

            List<GrantedAuthority> granted = new ArrayList<GrantedAuthority>();
            granted.add(new SimpleGrantedAuthority("ROLE_"+users.getUserRole()));
            user = new User(users.getUsername(),users.getPassword(),true,true,true,true,granted);
        } catch (Exception e) {
            System.out.println("无此用户");
            return null;
        }

        return user;
    }
}

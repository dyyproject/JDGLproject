package com.yingxiaotian.pojo;

import java.io.Serializable;

public class TbUsers implements Serializable {
    private  String id;
    private  String username;
    private  String password;
    private  String userRole;
    private  String userToroom;
    private  String idcard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserToroom() {
        return userToroom;
    }

    public void setUserToroom(String userToroom) {
        this.userToroom = userToroom;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}

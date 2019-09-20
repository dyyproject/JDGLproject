package com.yingxiaotian.pojo;

import java.util.Date;

public class Users {
    private String id;

    private String username;

    private String password;

    private String userRole;

    private String roleStr;

    private String userToroom;

    private String idcard;

    private Date rzDate;

    private Date xdDate;


    public String getRoleStr() {
        return roleStr;
    }

    public void setRoleStr(String roleStr) {
        this.roleStr = roleStr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserRole() {

        if (userRole!=null){
            if (userRole.equals("1")){
                roleStr="普通用户";
            }else {
                roleStr="超级管理员";
            }
        }
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    public String getUserToroom() {
        return userToroom;
    }

    public void setUserToroom(String userToroom) {
        this.userToroom = userToroom == null ? null : userToroom.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Date getRzDate() {
        return rzDate;
    }

    public void setRzDate(Date rzDate) {
        this.rzDate = rzDate;
    }

    public Date getXdDate() {
        return xdDate;
    }

    public void setXdDate(Date xdDate) {
        this.xdDate = xdDate;
    }
}
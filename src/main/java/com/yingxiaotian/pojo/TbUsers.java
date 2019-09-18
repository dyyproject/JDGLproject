package com.yingxiaotian.pojo;

public class TbUsers {
    private  String id;
    private  String username;
    private  String password;
    private  String userRole;
    private  String userToroom;
    private  String idcard;


    public TbUsers() {
    }

    public TbUsers(String id, String username, String password, String userRole, String userToroom, String idcard) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userRole = userRole;
        this.userToroom = userToroom;
        this.idcard = idcard;
    }

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

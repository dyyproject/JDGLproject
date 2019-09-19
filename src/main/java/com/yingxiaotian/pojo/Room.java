package com.yingxiaotian.pojo;

import java.util.Date;

public class Room {
    private Integer rId;

    private String rRoomname;

    private String rStatus;

    private Date rDate;

    private String rType;

    private Double rPrice;

    private String rNumber;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrRoomname() {
        return rRoomname;
    }

    public void setrRoomname(String rRoomname) {
        this.rRoomname = rRoomname == null ? null : rRoomname.trim();
    }

    public String getrStatus() {
        return rStatus;
    }

    public void setrStatus(String rStatus) {
        this.rStatus = rStatus == null ? null : rStatus.trim();
    }

    public Date getrDate() {
        return rDate;
    }

    public void setrDate(Date rDate) {
        this.rDate = rDate;
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType == null ? null : rType.trim();
    }

    public Double getrPrice() {
        return rPrice;
    }

    public void setrPrice(Double rPrice) {
        this.rPrice = rPrice;
    }

    public String getrNumber() {
        return rNumber;
    }

    public void setrNumber(String rNumber) {
        this.rNumber = rNumber == null ? null : rNumber.trim();
    }
}
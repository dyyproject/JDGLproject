package com.yingxiaotian.pojo;

public class Room {
    private Integer rId;

    private String rRoomname;

    private String rStatus;

    private String rType;

    private Double rPrice;

    private String rNumber;

    private String rPhoto;

    private String rDesc;

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

    public String getrPhoto() {
        return rPhoto;
    }

    public void setrPhoto(String rPhoto) {
        this.rPhoto = rPhoto == null ? null : rPhoto.trim();
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc == null ? null : rDesc.trim();
    }
}
package com.yingxiaotian.service;

import com.yingxiaotian.pojo.Room;

import java.util.List;

public interface TbRoomService {

    public List<Room> findByRNumber(String rNumber);

}

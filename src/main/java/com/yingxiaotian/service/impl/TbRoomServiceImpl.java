package com.yingxiaotian.service.impl;

import com.yingxiaotian.dao.RoomMapper;
import com.yingxiaotian.pojo.Room;
import com.yingxiaotian.pojo.RoomExample;
import com.yingxiaotian.service.TbRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TbRoomServiceImpl implements TbRoomService {

    @Autowired
    private RoomMapper roomMapper;

    public List<Room> findByRNumber(String rNumber) {

        RoomExample example = new RoomExample();
        RoomExample.Criteria criteria = example.createCriteria();
        criteria.andRNumberLike(rNumber);
        List<Room> rooms = roomMapper.selectByExample(example);
        return rooms;
    }
}

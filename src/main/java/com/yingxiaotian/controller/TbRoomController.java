package com.yingxiaotian.controller;

import com.yingxiaotian.pojo.Result;
import com.yingxiaotian.pojo.Room;
import com.yingxiaotian.service.impl.TbRoomServiceImpl;
import com.yingxiaotian.service.impl.TbUsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/room")
public class TbRoomController {
    @Autowired
    private TbRoomServiceImpl roomService;

    @Autowired
    private TbUsersServiceImpl usersService;

    @RequestMapping("/search")
    public List<Room> search(String condition) {
        //定义结果集
        List<Room> resultList = new ArrayList<Room>();
        //根据前台数据查询房间集合
        List<Room> roomList = roomService.findByRNumber(condition);
        //往结果集中添加集合
        resultList.addAll(roomList);
        //根据前台数据查询房间号集合
        List<String> rNumberList = usersService.findByUsername(condition);
        //如果查询结果为空就不添加数据
        if (rNumberList.size()>0){
            for (String rNumber : rNumberList) {
                List<Room> byRNumber = roomService.findByRNumber(rNumber);
                resultList.addAll(byRNumber);
            }
        }
        return resultList;
    }

}

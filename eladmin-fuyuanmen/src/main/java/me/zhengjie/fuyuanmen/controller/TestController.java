package me.zhengjie.fuyuanmen.controller;

import me.zhengjie.annotation.AnonymousAccess;
import me.zhengjie.fuyuanmen.entity.FuYuanMenUser;
import me.zhengjie.fuyuanmen.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;

    // http://127.0.0.1:8000/test/getUser
    @AnonymousAccess
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public List<FuYuanMenUser> getUser(){
        return userMapper.selectList(null);
    }


    // http://127.0.0.1:8000/test/getTes
    @AnonymousAccess
    @RequestMapping(value = "/getTes",method = RequestMethod.GET)
    public String test(){
        return "111111wwwwwww！！！！！！";
    }

}

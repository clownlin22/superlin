package com.example.jichudemo.controller;

import com.example.jichudemo.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lxy
 * @Date: 2019/1/30 10:54
 */
@RestController
public class HelloController {

    @GetMapping(value = "/test1")
    public List<Long> test1() {
        ArrayList<Long> longs = new ArrayList<>();
        longs.add(1L);
        longs.add(2L);
        longs.add(3L);
        return longs;
    }

    @GetMapping(value = "/test2")
    public String test2() {
        return "win";
    }

    @GetMapping(value = "/test3")
    public User test3() {
        User user = new User();
        user.setAge(1);
        user.setName("lin");
        return user;
    }

    @GetMapping(value = "/test4")
    public List<User> test4() {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        user.setAge(1);
        user.setName("lin");
        User user2 = new User();
        user2.setAge(2);
        user2.setName("xin");
        users.add(user);
        users.add(user2);
        return users;
    }

}

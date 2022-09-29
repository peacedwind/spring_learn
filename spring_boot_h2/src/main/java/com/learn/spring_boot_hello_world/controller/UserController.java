package com.learn.spring_boot_hello_world.controller;

import com.learn.spring_boot_hello_world.entity.User;
import com.learn.spring_boot_hello_world.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: cyx
 * @date: 2022-09-29
 **/
@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @GetMapping("/list")
    public List<User> list(){
        return userService.list();
    }

    @GetMapping("/save")
    public User save(){
        return userService.save();
    }

}

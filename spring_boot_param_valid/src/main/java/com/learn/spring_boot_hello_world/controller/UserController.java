package com.learn.spring_boot_hello_world.controller;

import com.learn.spring_boot_hello_world.DTO.UserDTO;
import com.learn.spring_boot_hello_world.common.ResResult;
import com.learn.spring_boot_hello_world.entity.User;
import com.learn.spring_boot_hello_world.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
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
    public ResResult<List<User>> list(){
       return ResResult.success(userService.list());
    }

    @PostMapping ("/save")
    public ResResult<User> save(@Valid @RequestBody UserDTO userDTO){
        return ResResult.success(userService.save());
    }

}

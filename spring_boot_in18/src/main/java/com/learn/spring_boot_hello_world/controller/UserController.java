package com.learn.spring_boot_hello_world.controller;

import com.learn.spring_boot_hello_world.DTO.UserDTO;
import com.learn.spring_boot_hello_world.common.ResResult;
import com.learn.spring_boot_hello_world.entity.User;
import com.learn.spring_boot_hello_world.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
@Api
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @GetMapping("/list")
    @ApiOperation("list user")
    public ResResult<List<User>> list(){
       return ResResult.success(userService.list());
    }

    @PostMapping ("/save")
    @ApiOperation("save user")
    @ApiImplicitParam(name = "userDTO",type = "body",dataTypeClass = UserDTO.class)
    public ResResult<Object> save(@Valid @RequestBody  UserDTO userDTO){
        return ResResult.success(userService.save());
    }

}

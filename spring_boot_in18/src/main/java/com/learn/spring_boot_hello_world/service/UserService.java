package com.learn.spring_boot_hello_world.service;

import com.learn.spring_boot_hello_world.entity.User;

import java.util.List;

/**
 * @description:
 * @author: cyx
 * @date: 2022-09-29
 **/
public interface UserService {

    public List<User> list();

    User save();

}

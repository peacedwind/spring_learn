package com.learn.spring_boot_hello_world.dao;

import com.learn.spring_boot_hello_world.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @description:
 * @author: cyx
 * @date: 2022-09-29
 **/
@Repository
public class UserDao {

    private static final List<User> users = new ArrayList<>();

    public List<User> list(){
        User item = new User();
        item.setId(UUID.randomUUID().toString());
        item.setName("欢");
        users.add(item);
        return users;
    }
}

package com.learn.spring_boot_hello_world.dao;

import com.learn.spring_boot_hello_world.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
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
public interface UserDao extends JpaRepository<User,Integer> {

}

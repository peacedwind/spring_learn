package com.learn.spring_boot_hello_world;

import com.learn.spring_boot_hello_world.entity.User;
import com.learn.spring_boot_hello_world.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringBootHelloWorldApplicationTests {


    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        List<User> list = userService.list();
        System.out.println(list);
    }

}

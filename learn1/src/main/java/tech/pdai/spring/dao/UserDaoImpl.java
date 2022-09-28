package tech.pdai.spring.dao;

import tech.pdai.spring.entity.User;

import java.util.Collections;
import java.util.List;

public class UserDaoImpl {


    public List<User> list(){
        User user = new User();
        user.setId("1");
        user.setName("欢欢");
        return Collections.singletonList(user);
    }
}

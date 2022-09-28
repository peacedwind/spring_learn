package tech.pdai.spring.service;

import tech.pdai.spring.dao.UserDaoImpl;
import tech.pdai.spring.entity.User;

import java.util.List;

public class UserServiceImpl {

    private UserDaoImpl userDao;

    public UserDaoImpl getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public List<User> list(){
        return userDao.list();
    }
}

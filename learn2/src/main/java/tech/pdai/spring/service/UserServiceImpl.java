package tech.pdai.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.pdai.spring.dao.UserDaoImpl;
import tech.pdai.spring.entity.User;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
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

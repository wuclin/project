package com.cc.service.serviceImpl;

import com.cc.dao.UserDao;
import com.cc.domain.User;
import com.cc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> SelectUser() {
        return userDao.SelectUser();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}

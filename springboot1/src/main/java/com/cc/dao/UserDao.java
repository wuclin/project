package com.cc.dao;

import com.cc.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> SelectUser();

    void addUser(User user);
}

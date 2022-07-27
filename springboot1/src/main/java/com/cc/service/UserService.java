package com.cc.service;

import com.cc.domain.User;

import java.util.List;

public interface UserService {
    List<User> SelectUser();

    void addUser(User user);
}

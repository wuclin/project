package com.jlu.j2ee.service;

import com.jlu.j2ee.domain.Student;

public interface StudentService {
    Student getUserByUsernameAndPwd(String username, String password);

    Student checkoutUsername(String username);
}

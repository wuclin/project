package com.jlu.j2ee.service.ServiceImpl;

import com.jlu.j2ee.mapper.StudentMapper;
import com.jlu.j2ee.service.StudentService;
import com.jlu.j2ee.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student getUserByUsernameAndPwd(String username, String password) {
        return studentMapper.getUserByUsernameAndPwd(username,password);
    }

    @Override
    public Student checkoutUsername(String username) {
        return studentMapper.checkoutUsername(username);
    }
}

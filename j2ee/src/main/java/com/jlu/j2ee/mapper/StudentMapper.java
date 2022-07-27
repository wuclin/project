package com.jlu.j2ee.mapper;

import com.jlu.j2ee.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {
    Student getUserByUsernameAndPwd(@Param("username") String username,@Param("password") String password);

    @Select("select * from where username = #{username}")
    Student checkoutUsername(String username);
}

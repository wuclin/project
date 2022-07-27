package com.Dao;

import com.Bean.Customer;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("customerDao")
public interface CustomerDao {
    List<Customer> SelectUser();

    @Insert("insert into customer(username,pwd) values(#{username},#{pwd})")
    void AddCustomer();
}

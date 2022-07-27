package com.Service;

import com.Bean.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> SelectUser();

    void AddCustomer(Customer customer);
}

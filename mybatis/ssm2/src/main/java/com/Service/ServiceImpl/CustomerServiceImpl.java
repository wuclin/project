package com.Service.ServiceImpl;

import com.Bean.Customer;
import com.Dao.CustomerDao;
import com.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> SelectUser() {
        return customerDao.SelectUser();
    }

    @Override
    public void AddCustomer(Customer customer) {
        customerDao.AddCustomer();
    }
}

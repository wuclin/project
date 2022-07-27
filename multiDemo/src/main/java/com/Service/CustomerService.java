package com.Service;

import com.enty.Customer;

public interface CustomerService {
    Customer selectCustomer(Integer id);

    Customer insertCustomer(Customer c);

    void txtest();

    boolean test1();

    boolean test2();

    void t1();

    void t11();

    void t12();

    void t2();

    void t3();

    void t22();

    void t4();

    void t5();

    void t6();

    Customer checkDBRecord(int i);

    void t8();
}

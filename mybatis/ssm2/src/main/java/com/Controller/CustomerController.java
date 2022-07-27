package com.Controller;

import com.Bean.Customer;
import com.Service.CustomerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("customerController")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @ResponseBody
    @RequestMapping("/test")
    public List<Customer> SelectUser(){
        return customerService.SelectUser();
    }


    /**
     * @RequestParm因为可以接收单个参数，所以可以用来查找或者插入一条数据，如果要插入多条数据可以使用json
     * 使用json的话需要用到@RequestBody
     *
     */

    @PostMapping("/add")
    public String addCustomer(@Param("customer") Customer customer){
       // Customer customer1 = new Customer();
    //    customer1.setUsername("123");customer1.setPwd("123");
        System.out.println(customer.getUsername());
        System.out.println(customer.getPwd());
        System.out.println(customer.toString());
        customerService.AddCustomer(customer);
       // int id = customer.getId();
    //    System.out.println(customer.getId());
        return "index";
    }

    @GetMapping("/get")
    public String getTest(@RequestParam String username, @RequestParam String pwd){
        System.out.println(username);
        System.out.println(pwd);
        return "index";
    }

}

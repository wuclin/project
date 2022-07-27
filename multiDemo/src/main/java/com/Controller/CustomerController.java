package com.Controller;

import com.Dao.CustomerDao;
import com.Service.CustomerService;
import com.enty.Customer;
import com.util.BeanUtil;
import org.apache.ibatis.session.ResultContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

import java.util.LinkedList;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/h")
    @ResponseBody
    public String hi(){
        return "123";
    }

    @RequestMapping("/select")
    @ResponseBody
    public Customer selectCustomer(@RequestParam("id") Integer id){
        return customerService.selectCustomer(id);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Customer insertCustomer()
    {
        Customer c = new Customer();
        c.setPwd("123123");c.setUsername("test1");
        customerService.insertCustomer(c);
        return c;
    }

    @RequestMapping("/txtest")
    public void txtest(){
        customerService.txtest();
    }


    //转化表
    @RequestMapping("/test")
    @ResponseBody
    public String test1(){
        if (customerService.test1() == true)
        return "true";

        return "false";
    }


    @RequestMapping("/batchinsert")
    @ResponseBody
    public String test2(){
        if (customerService.test2() == true)
            return "true";
        return "false";
    }

    /**
     * 1.分页查找
     *   分页查找优化1
     *   分页查找优化2
     * 2.游标查找
     * 3.流式查找
     */

    @RequestMapping("/t1")
    @ResponseBody
    public void t1(){
        customerService.t1();
    }

    @RequestMapping("/t11")
    @ResponseBody
    public void t11(){
        customerService.t11();
    }

    @RequestMapping("/t12")
    @ResponseBody
    public void t12(){
        customerService.t12();
    }

    @RequestMapping("/t2")
    @ResponseBody
    public void t2(){
        customerService.t2();
    }

    @RequestMapping("/t22")
    @ResponseBody
    public void t22(){
        customerService.t22();
    }
    @RequestMapping("/t3")
    @ResponseBody
    public void t3(){
        customerService.t3();
    }


    /**
     * 异步demo
     */
    @RequestMapping("/t4")
    @ResponseBody
    public void t4(){
        customerService.t4();
    }

    @RequestMapping("/t6")
    @ResponseBody
    public void t6(){
        customerService.t6();
    }


    //数据库连接池
    @RequestMapping("/t7")
    @ResponseBody
    public void t7(){
        for (int i = 1; i < 100; i++)
       customerService.selectCustomer(i);
    }


    //datacopy 从customer插到user
    @RequestMapping("/t8")
    @ResponseBody
    public void t8(){

        customerService.t8();
    }


    @RequestMapping("/t9")
    @ResponseBody
    public void t9(){
        List<Customer> c = new LinkedList<>();
        BeanUtil.getBean(CustomerDao.class).test6(ResultContext->{
            if (ResultContext == null)
                System.out.println("null");
            else
            System.out.println(ResultContext.getResultObject().toString());
        });
    }
}

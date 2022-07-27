package com.util;

import com.Dao.CustomerDao;
import com.enty.Customer;
import org.springframework.context.annotation.Bean;

import java.util.LinkedList;
import java.util.List;

public class UpdateHandler {
    private int commmitNumber = 10;

    private boolean checkBDRecord = true;

    protected Customer dbRecord = null;

    private List<Customer> insertList = null;

    private List<Customer> updateList = null;

    private int insertNumber;

    private int updateNumber;

    public final void start(){
        System.out.println("初始化");
        this.insertNumber = 0;
        this.updateNumber = 0;
        this.insertList = new LinkedList<>();
        this.updateList = new LinkedList<>();
    }

    protected void insertRecord(Customer user){
        this.insertList.add(user);
        this.insertNumber += 1;
        if (this.insertNumber >= this.commmitNumber){
            BeanUtil.getBean(CustomerDao.class).insertCustomer2(insertList);
            this.insertNumber = 0;
            this.insertList.clear();
        }
    }

    protected void updateRecord(Customer user){
        //
    }

    public final void handleRecord(Customer user){
        int dbe = checkBDRecord(user);
        if (dbe == 1)
            insertRecord(user);
        else if (dbe == -1)
            updateRecord(user);

    }
    protected int checkBDRecord(Customer user){
        if (readDBRecord(user))
            return 1;
        return -1;
    }

    private boolean readDBRecord(Customer user){
        if (BeanUtil.getBean(CustomerDao.class).checkDBRecord(user.getId()) != null)
            return true;
        return false;
    }



}
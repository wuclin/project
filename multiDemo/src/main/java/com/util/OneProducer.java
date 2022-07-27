package com.util;

import com.Dao.CustomerDao;
import com.enty.Customer;

import org.springframework.stereotype.Component;


import java.util.concurrent.BlockingQueue;
@Component
public class OneProducer implements Runnable {
    //坑：这里注解注入dao层会报空指针，可以用工具类

    protected BlockingQueue<Customer> blockingQueue;

    private volatile boolean isRunning = true;//是否在运行标志

    //不用空的构造函数会报错
    public OneProducer(){

    }
    public OneProducer(BlockingQueue<Customer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        // List<User> users = new ArrayList<>();

        BeanUtil.getBean(CustomerDao.class).t3(resultContext -> {
            blockingQueue.add(resultContext.getResultObject());
        });

        System.out.println(blockingQueue.size());
        System.out.println("查询时间：" + (System.currentTimeMillis() - start));

    }

    public void stop() {
        isRunning = false;
    }
}

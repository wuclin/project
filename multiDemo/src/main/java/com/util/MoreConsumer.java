package com.util;

import com.enty.Customer;


import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MoreConsumer implements Runnable {

    private static final int DEFAULT_RANGE_FOR_SLEEP = 1000;

    protected BlockingQueue<Customer> blockingQueue;

    private UpdateHandler updateDBHandles= null;


    public MoreConsumer(BlockingQueue<Customer> blockingQueue, UpdateHandler up){
        this.blockingQueue = blockingQueue;
        this.updateDBHandles = up;
    }
    @Override
    public void run() {
        System.out.println("启动消费者线程！");
        updateDBHandles.start();
        while(blockingQueue.isEmpty()){
            SmallTool.SleepMillis(100);
        }
        boolean isRunning = true;
        Random r = new Random();
        while (isRunning){
            try{
                Customer user = blockingQueue.poll(10,TimeUnit.SECONDS);
                //加一步，根据主键查db是否存在，这里用的users，通用封装成recordset，重写equals方法然后
                if (user != null){
                    updateDBHandles.handleRecord(user);
                    Thread.sleep(r.nextInt(DEFAULT_RANGE_FOR_SLEEP));
                }
                else {
                    // 超过10s还没数据，认为所有生产线程都已经退出，自动退出消费线程。
                    isRunning = false;
                }}catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}

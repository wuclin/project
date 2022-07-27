package com.Service.ServiceImpl;

import com.Dao.CustomerDao;
import com.Service.CustomerService;
import com.enty.Customer;
import com.util.*;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;

    @Autowired
    SqlSession sqlSession;

    @Override
   // @Cacheable(value = "redisCacheManager", key = "#id.toString()")
    @Cacheable(value = "testCache", key = "#id.toString()")
    public Customer selectCustomer(Integer id) {
        return customerDao.selectCustomer(id);
    }

    @Override
    @CachePut(value = "redisCacheManager", key = "#result.id.toString()")
    public Customer insertCustomer(Customer c) {
        customerDao.insertCustomer(c);
        return c;
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, timeout = 10, readOnly = false)
    public void txtest() {
        for (int i = 1; i < 100; i++)
        {
            if (i == 50)
                throw new RuntimeException("50");
            customerDao.txtest();
        }

    }

    @Override
    public boolean test1() {
        long s = System.currentTimeMillis();
        System.out.println("成功插入:"+customerDao.test1());
        long e = System.currentTimeMillis();

        System.out.println("time:"+ (e-s));
        if (customerDao.test1() >0)
        {
            return true;

        }
        return false;
    }

    @Override
    public boolean test2() {
        customerDao = sqlSession.getMapper(CustomerDao.class);
        return true;

    }

    @Override
    public void t1() {
        long start = System.currentTimeMillis();
        int count = customerDao.size();
        int size = 2000;
        long offset = 0;
        while(true){
            if (offset > count)
                break;
            customerDao.t1(size, offset);
            offset += size;
        }
        System.out.println(System.currentTimeMillis() - start);

    }

    @Override
    public void t11() {
        long start = System.currentTimeMillis();
        int count = customerDao.size();
        int size = 2000;
        long offset = 0;
        while(true){
            if (offset > count)
                break;
            customerDao.t11(size, offset);
            offset += size;
        }
        System.out.println(System.currentTimeMillis() - start);

    }

    @Override
    public void t12() {
        long start = System.currentTimeMillis();
        int count = customerDao.size();
        int size = 2000;
        long offset = 0;
        while(true){
            if (offset > count)
                break;
            customerDao.t12(size, offset);
            offset += size;
        }
        System.out.println(System.currentTimeMillis() - start);

    }

    @Override
    @Transactional
    public void t2() {
        long start = System.currentTimeMillis();
        Cursor<Customer> customers = customerDao.t2();
        Iterator<Customer> iterator = customers.iterator();
        List<Customer> list = new ArrayList<>();
        while(iterator.hasNext())
            list.add(iterator.next());
        System.out.println(list.size());
        System.out.println(System.currentTimeMillis() - start);
    }

    @Override
    @Transactional
    public void t22() {
        long start = System.currentTimeMillis();
        Cursor<Customer> customers = customerDao.t2();
        Iterator<Customer> iterator = customers.iterator();
        List<Customer> list = new ArrayList<>();
        while(iterator.hasNext()){
            list.add(iterator.next());
            if (list.size()%2000 == 0)
            {
                customerDao.insertCustomer2(list);
                list.clear();
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Override
    public void t3() {
        long start = System.currentTimeMillis();
        customerDao.t3(new ResultHandler<Customer>(){
            @Override
            public void handleResult(ResultContext<? extends Customer> resultContext) {
                //
                System.out.println(resultContext.getResultObject().toString());

            }
        });
        System.out.println(System.currentTimeMillis() - start);
    }

    @Override
    public void t4() {
        int sum = 0;
        BeanUtil.getBean(CustomerServiceImpl.class).t5();
        SmallTool.printTimeAndThread("主线程");
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    @Async
    public void t5(){
        int sum = 0;
        SmallTool.printTimeAndThread("异步线程");
        for (int i = 0; i < 50; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    @Override
    public void t6(){

        /*BlockingQueue<List<Customer>> blockingQueue = new LinkedBlockingQueue<List<Customer>>();
        OneProducer oneProducer = new OneProducer(blockingQueue);  //把队列引用传进去
        MoreConsumer m1 = new MoreConsumer(blockingQueue);
        MoreConsumer m2 = new MoreConsumer(blockingQueue);
        MoreConsumer m3 = new MoreConsumer(blockingQueue);
        MoreConsumer m4 = new MoreConsumer(blockingQueue);
        MoreConsumer m5 = new MoreConsumer(blockingQueue);

        // 借助Executors
        ExecutorService service = Executors.newCachedThreadPool();
        // 启动线程
        service.execute(oneProducer);
        service.execute(m1);
        service.execute(m2);
        service.execute(m3);
        service.execute(m4);
        service.execute(m5);*/
        //new Thread(oneProducer).start();

        //  oneProducer.stop();
/*
        service.shutdown();
*/
    }


    @Override
    public Customer checkDBRecord(int id) {
           return customerDao.checkDBRecord(id);
    }


    @Transactional
    @Override
    public void t8() {

        BlockingQueue<Customer> blockingQueue = new LinkedBlockingQueue<Customer>();
        OneProducer oneProducer = new OneProducer(blockingQueue);  //把队列引用传进去

        // 借助Executors
        ExecutorService service = Executors.newCachedThreadPool();

        ExecutorService cust = Executors.newFixedThreadPool(10);
        //up数组
        UpdateHandler[] up = new UpdateHandler[10];
        // 启动线程
        service.execute(oneProducer);
        service.shutdown();
        try{
            Thread.sleep(2000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++){
            up[i] = new UpdateHandler();
            CompletableFuture.runAsync(new MoreConsumer(blockingQueue, up[i]),cust);
        }

        cust.shutdown();
        while(!cust.isTerminated())
        {        }
        System.out.println("insert time" + (System.currentTimeMillis() - start));
    }


}

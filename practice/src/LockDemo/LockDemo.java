package LockDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    private Lock lock = new ReentrantLock();

    public static void main(String[] args){
        ExecutorService e = Executors.newCachedThreadPool();
        e.submit(()->{new LockDemo().fun();});
        e.submit(()->{new LockDemo().fun();});
    }

    public void fun(){
        lock.lock();
        try{
            for (int i = 0; i < 5; i++)
                System.out.println(i);
        }finally {
            lock.unlock();
        }

    }

}

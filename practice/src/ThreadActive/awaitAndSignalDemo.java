package ThreadActive;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class awaitAndSignalDemo {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new awaitThread());
        Thread b = new Thread(new signalThread());
        a.start();
        Thread.sleep(1000);
        b.start();

    }

    private static class awaitThread implements Runnable{
        @Override
        public void run() {
            while(true){
                lock.lock();
                System.out.println(Thread.currentThread().getName());
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }

        }
    }

    private static class signalThread implements Runnable{
        @Override
        public void run() {
            try{
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "get lock");
                condition.signal();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }

        }
    }
}

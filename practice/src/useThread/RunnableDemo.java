package useThread;

import java.util.TreeMap;

/**
 * 直接实现runnable接口
 */
public class RunnableDemo {

    public static void main(String[] args){
        Thread t = new Thread(new MyRunnable());
    }

    static class MyRunnable implements Runnable{
        public void run(){
            System.out.println("Runnable Thread");
        }
    }
}

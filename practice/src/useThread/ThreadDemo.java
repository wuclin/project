package useThread;

/**
 * 使用继承Thread的方式，其实Thread也是实现了Runnable接口
 */
public class ThreadDemo {

    public static void main(String[] args){
        Thread a = new Thread(new MyThread());
        a.start();
    }


    static class MyThread extends Thread{
        public void run(){
            System.out.println("extend Thread");
        }
    }
}

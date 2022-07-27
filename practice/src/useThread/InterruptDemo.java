package useThread;

public class InterruptDemo {

    public static void main(String[] args){
        Thread a = new Thread(new MyThread());
        a.start();
        try{
            Thread.sleep(1000);

        }catch (Exception e){
            e.printStackTrace();
        }
        a.interrupt();
    }


    static class MyThread implements Runnable{
        public void run(){
           while(!Thread.currentThread().isInterrupted()){
               System.out.println("do");
           }
            System.out.println("end");
        }
    }
}

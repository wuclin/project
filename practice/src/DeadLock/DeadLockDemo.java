package DeadLock;

public class DeadLockDemo {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();


    public static void main(String[] args){
        new Thread(()->{
            synchronized (resource1){
                System.out.println(Thread.currentThread().getName() + "hold resource1 ");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "wait resource2");
                synchronized (resource2){
                    System.out.println(Thread.currentThread().getName() + "hold resource2");
                }

            }
        },"ThreadA").start();

        new Thread(()->{
            synchronized (resource2){
                System.out.println(Thread.currentThread().getName() + "hold resource2 ");
                try{
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "wait resource1");
                    Thread.currentThread().wait();;
                  //  resource2.wait(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                synchronized (resource1){
                    System.out.println(Thread.currentThread().getName() + "holde resource1");
                }
            }
        },"Thread B").start();
    }
}

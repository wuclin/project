package SynchronizedDemo;

public class ClassSynchronized {

    public static void main(String[] args){
        ClassSynchronized c1 = new ClassSynchronized();
        ClassSynchronized c2 = new ClassSynchronized();

        Thread a = new Thread(()->{
            synchronized (c1){
                for (int i = 0; i < 5; i++)
                    System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        },"threadA");

        Thread b = new Thread(()->{
            synchronized (c2){
                for (int i = 0; i < 5; i++)
                    System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        },"threadB");


        b.start();
        a.start();
    }
}

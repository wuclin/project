package ThreadActive;

public class JoinDemo {

    public static void main(String[] args){


       // System.out.println("main start");

       /* for (int i = 0; i < 5; i++)
            System.out.println(i);
        */

        Thread b = new Thread(()->{
            System.out.println("B start");
        });

        Thread a = new Thread(()->{
            try {
                b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A start");

            for (int i = 0; i < 5; i++)
                System.out.println(i);
        });

        a.start();
        b.start();


    }



}

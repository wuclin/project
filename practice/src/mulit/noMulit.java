package mulit;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class noMulit {

    private static int count = 10;

    public static void main(String[] args){


        ExecutorService s = Executors.newFixedThreadPool(10);
        for (int i = 0; i< 5; i++){
            s.execute(new Thread(()->{
                while(true)
                if (count != 0)
                    System.out.println(Thread.currentThread().getName() + ":" + count--);
                else break;
            }));
        }




    }
}

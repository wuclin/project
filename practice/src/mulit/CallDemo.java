package mulit;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> ft = new FutureTask<Integer>(new myCallable());
        Thread t = new Thread(ft);
        t.start();
        System.out.println(ft.get());
    }



    static class myCallable implements Callable{
        public Integer call(){
            return 123;
        }
    }
}

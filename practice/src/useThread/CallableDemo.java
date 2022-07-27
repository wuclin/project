package useThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 本质上通过接口实现的都只能当作是任务，最后还是通过Thread来调用
 * 这里的callable比较特殊，它可以有返回值，返回值通过futureTask封装
 * futuretask实际上继承了Runnable和Future
 * 所以可以吧futuretask对象当作runnable来使用传入Thread中
 */
public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask ft = new FutureTask(new MyCallable());
        Thread t = new Thread(ft);
        t.start();
        System.out.println(ft.get());
    }



    static class MyCallable implements Callable{
        public Integer call(){
            return 123;
        }
    }
}

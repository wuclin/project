import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class threadPoolExecutoDemo2 {
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE,
                MAX_POOL_SIZE,KEEP_ALIVE_TIME, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY), new ThreadPoolExecutor.CallerRunsPolicy());

        List<Future<String>> futuresList = new ArrayList<>();
        Callable<String> callable = new MyCallable();

        for (int i = 0; i < 10; i++){
            Future<String> future = threadPoolExecutor.submit(callable);
            futuresList.add(future);
        }

        for (Future<String> f : futuresList){
            try{
                System.out.println(new Date() + f.get());
            }catch(InterruptedException | ExecutionException exception){
                exception.printStackTrace();
            }
        }
//使用实现callable接口的类作为任务，并且在call方法中写入返回值，
        //使用线程池的submit方法传入callable方法，返回值会存放到Future类中，且可以通过Future.get方法获取
        threadPoolExecutor.shutdown();
    }
}

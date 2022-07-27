import java.util.concurrent.*;

public class threadPoolExecutoDemo {
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE,
                MAX_POOL_SIZE,KEEP_ALIVE_TIME, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY), new ThreadPoolExecutor.CallerRunsPolicy());

        FutureTask<Object> futureTask = new FutureTask<>(new MyCallable());
        threadPoolExecutor.execute(futureTask);
        System.out.println(futureTask.get());
        /*for (int i = 0; i < 10; i++){
            Runnable worker = new MyRunnable("" + i);
            threadPoolExecutor.execute(worker);

        }*/
        threadPoolExecutor.shutdown();
    }
}

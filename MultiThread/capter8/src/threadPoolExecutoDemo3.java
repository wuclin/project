import java.util.concurrent.*;

public class threadPoolExecutoDemo3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.SECONDS
        ,new ArrayBlockingQueue<>(1000), new ThreadPoolExecutor.CallerRunsPolicy());

        FutureTask<String> futureTask = new FutureTask<>(new LongTimeCallable());
        threadPoolExecutor.submit(futureTask);

        int sum = 0;
        for (int i = 0; i < 100; i++){
            sum += i;
            if (i == 10)
                System.out.println(futureTask.get());
            System.out.println(sum);
        }
    }
}

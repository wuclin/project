import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }
}

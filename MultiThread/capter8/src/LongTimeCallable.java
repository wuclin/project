import java.util.concurrent.Callable;

public class LongTimeCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return doing();
    }

    public String doing() throws InterruptedException{
        System.out.println("子线程开始");
        Thread.sleep(10000);
        return "子线程结束";

    }
}

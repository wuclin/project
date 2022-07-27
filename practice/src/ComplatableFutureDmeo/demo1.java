package ComplatableFutureDmeo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture cf = CompletableFuture.runAsync(()->{
            System.out.println(123);
        });

        cf.get();

    }
}

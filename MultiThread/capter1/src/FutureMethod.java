import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureMethod {
    public static void main(String[] args){

        Callable<String> callable = ()-> {return "CallableMethod";};

        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        try{
            System.out.println(futureTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

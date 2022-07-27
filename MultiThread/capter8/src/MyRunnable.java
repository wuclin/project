import java.time.LocalDateTime;
import java.util.concurrent.ThreadPoolExecutor;

public class MyRunnable implements Runnable {

    private String command;

    MyRunnable(String command){
        this.command = command;
    }
    @Override
    public void run() {
        System.out.println("start" + LocalDateTime.now());
        process();
        System.out.println("end" + LocalDateTime.now());
    }

    public void process(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

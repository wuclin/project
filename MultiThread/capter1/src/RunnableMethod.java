public class RunnableMethod {
    public static void main(String[] args){
        Thread thread = new Thread(()->{
            System.out.println("123");
        });

        thread.start();
    }
}

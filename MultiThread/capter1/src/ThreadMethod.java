public class ThreadMethod {
    public static void main(String[] args){
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("使用Thread方法");
            }
        };

        t1.start();
    }
}

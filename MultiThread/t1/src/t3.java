public class t3 extends Thread{
    private int count =5;
    public t3(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0){
            count--;
            System.out.println(this.currentThread().getName() + "count=" + count);
        }
    }
}

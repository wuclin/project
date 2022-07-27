public class t4 extends Thread{
    private int count = 5;

    @Override
    synchronized public void run() {
        count--;
        System.out.println(this.currentThread().getName() + count);
    }
    /**
     * 不加synchronized就会出现线程不同步问题
     */
}

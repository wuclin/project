public class Test1 {
    public static void main(String[] args){
        MyThread mythread = new MyThread();
        mythread.start();
        System.out.println("end");
    }

    /**
     *  多线程里面代码的运行结果和代码顺序和代码调用顺序无关
     */
}

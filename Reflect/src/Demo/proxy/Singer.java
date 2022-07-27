package Demo.proxy;

/**
 * 实际对象
 */
public class Singer implements Star {
    @Override
    public void Sing() {
        System.out.println("开始唱歌");
        System.out.println("stop singing");
    }

    @Override
    public void Dance() {
        System.out.println("start dance");
        System.out.println("stop dance");
    }
}

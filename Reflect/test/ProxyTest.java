import Demo.proxy.JDKProxyExample;
import Demo.proxy.Singer;
import Demo.proxy.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args){
        //代理地真实对象
        Star singer = new Singer();

        /**
         * JKDProxyExample实现了InvocationHandler接口
         * 要代理哪个真实对象就把哪个真实对象传进去
         */
        InvocationHandler handler = new JDKProxyExample(singer);

        ClassLoader loader = singer.getClass().getClassLoader();
        Class[] interfaces = singer.getClass().getInterfaces();

        Star star = (Star) Proxy.newProxyInstance(loader, interfaces, handler);
        System.out.println("动态代理对象地类型"+star.getClass().getName());


        singer.Dance();
        singer.Sing();
    }
}

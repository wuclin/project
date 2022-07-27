package Demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理绑定和逻辑实现
 */
public class JDKProxyExample implements InvocationHandler {

    //真实对象
    private Object realSubject;

    /**
     * 构造函数，给要代理的真实对象赋值
     * @param realSubject
     */
    public JDKProxyExample(Object realSubject){
        this.realSubject = realSubject;
    }

    /**
     * 代理类要实现的方法
     * 该方法集中处理动态代理类上所有方法调用
     * 根据参数进行预处理或反派到委托类实例上反射执行
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理真实对象前的一些操作
        System.out.println("方法调用前");
        System.out.println("Method:"+method);

        //当代理对象调用真实的方法时，会自动地跳转到代理对象关联地handler对象地invoke方法
        Object returnValue = method.invoke(realSubject,args);

        //代理结束后
        System.out.println("调用完后");
        return returnValue;
    }
}

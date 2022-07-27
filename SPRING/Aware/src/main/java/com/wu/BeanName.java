package com.wu;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanName implements BeanNameAware, DisposableBean, InitializingBean {

    @Override
    public void setBeanName(String name) {
        System.out.println("实例化之后会来到这里？");
        System.out.println(name);
    }

    public void init(){
        System.out.println("初始化");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("非init初始化");
    }
}

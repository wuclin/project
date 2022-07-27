package com.wu;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("自定义FactoryPostProcessor");
        //通过bean的id拿到beanDefinition，通过MutablePropertyValues类的addPropertyValue方法可以修改bean的属性
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("xx");
        MutablePropertyValues mutablePropertyValues = beanDefinition.getPropertyValues();
        System.out.println(mutablePropertyValues.toString());
        mutablePropertyValues.addPropertyValue("name","afterBeanFactoryPostProcessor");
    }
}

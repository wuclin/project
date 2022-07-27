import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import service.BeanConfig;
import service.impl.loginService;


/**
 * @Configuration                甚至连这个注解都不需要，都理解错了，这个和springboot不一样
 * @EnableAspectJAutoProxy
 */

public class main {
    public static void main(String[] args){
       // ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
        loginService ls = ac.getBean("ss", loginService.class);
        ls.login();
    }
}

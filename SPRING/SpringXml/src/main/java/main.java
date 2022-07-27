import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.xmlloginService;

/**
 * 使用xml实现aop
 */
public class main {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Context.xml");
        xmlloginService xls = ac.getBean("sss",xmlloginService.class);
        xls.login();
    }
}

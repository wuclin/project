import bean.SpringAopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedHashSet;

//没用的
public class main {
    public static void main(String[] args){
        LinkedHashSet
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringAopService a = ac.getBean("sas",SpringAopService.class);
        a.talk("nihao");
    }
}

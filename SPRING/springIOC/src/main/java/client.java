import enty2.catService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用注解的方法注入
 */
public class client {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
        catService c = ac.getBean("ss",catService.class);
        //catService里面的catDao对象为null，因为@Service只创建了对象，没有注入
        System.out.println(c);
        c.getCat();
        c.useCat();//使用数据注入注解前catdao为空报空指针，使用之后对象就被注入了

    }
}

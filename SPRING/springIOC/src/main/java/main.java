import enty.book;
import enty.onwer;
import enty.privateBook;
import enty.publicBook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用xml的方式实现依赖注入
 */
public class main {
    public static void main(String[] args){
        ApplicationContext a = new ClassPathXmlApplicationContext("context.xml");
        book v = a.getBean("zxc",book.class);
       // v.sd();

/*
        privateBook b1 = a.getBean("dd",privateBook.class);
        b1.setName("xx");
        b1.setAuthor("cc");
        b1.sd();
        privateBook b2 = a.getBean("dd",privateBook.class);
        b2.sd();
        publicBook b3 = a.getBean("cc",publicBook.class);
        b3.setName("oo");
        b3.setAuthor("pp");
        b3.sd();
        publicBook b4 = a.getBean("cc",publicBook.class);
        b4.sd();

        if (b1.equals(b2))
            System.out.println("yeyse");*/
        onwer o = a.getBean("MING",onwer.class);
        o.st();


    }
}

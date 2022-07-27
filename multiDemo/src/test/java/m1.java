import com.Dao.CustomerDao;
import com.Service.ServiceImpl.CustomerServiceImpl;
import com.util.BeanUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CompletableFuture;

public class m1 {
    @Autowired
    CustomerDao customerDao;

    @Test
    public void si(){
        //System.out.println(customerDao.size());
        for (int i = 1; i < 100; i++)
            BeanUtil.getBean(CustomerServiceImpl.class).checkDBRecord(i);
      //  CompletableFuture cf = CompletableFuture.runAsync()
        //ClassPathXmlApplicationContext
    }
}

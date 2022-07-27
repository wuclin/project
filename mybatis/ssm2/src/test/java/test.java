import com.Bean.Customer;
import com.Dao.CustomerDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {

    final InputStream inputStream = Resources.getResourceAsStream("Context.xml");
    final SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


    public test() throws IOException {
    }


    @Test
    public void testCacheLevel2() throws IOException{
        final SqlSession sqlSession1 = sqlSessionFactory.openSession();
        final SqlSession sqlSession2 = sqlSessionFactory.openSession();

        final CustomerDao customerDao1 = sqlSession1.getMapper(CustomerDao.class);
        final CustomerDao customerDao2 = sqlSession1.getMapper(CustomerDao.class);
        final List<Customer> customer = customerDao1.SelectUser();
        System.out.println(customer.toString());

    }
}

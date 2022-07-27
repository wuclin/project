import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
//RedisTemplate默认的的序列化使用的是JdkSerializationRedisSerializer，所以存储的时候值的前面会有一串字符
//如果使用StringRedisSerializer序列化就不会有这个问题，使用StringRedisSerializer序列化的方法
//1.直接使用StringRedisTemplate
//2.修改RedisTemplate中的序列化方案：
//redisTemplate.setKeySerializer(new StringRedisSerializer());
public class redisDemo {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("rContext.xml");
        RedisTemplate redisTemplate = ac.getBean(RedisTemplate.class);
        ValueOperations v = redisTemplate.opsForValue();
        System.out.println(v.get("test1"));

    }
}

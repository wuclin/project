import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class ehcacheTest {
    public static void main(String[] args){
        CacheManager cacheManager = CacheManager.create("./src/main/resources/ehcache.xml");
        Cache cache = cacheManager.getCache("testCache");
        /*Element element = new Element("key1", "value1");
        cache.put(element);*/

       /* cache.put(new Element("key2","value2"));
        cache.put(new Element("key3","value3"));*/

        System.out.println(cache.get("key1"));
        System.out.println(cache.get("key2"));
        System.out.println(cache.get("key3"));

        //使用flush方法，就可以手动将缓存保存到
        cache.flush();
        cacheManager.shutdown();
    }
}

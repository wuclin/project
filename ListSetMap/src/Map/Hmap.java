package Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Hmap {
    public static void main(String[] args){
       /* Map m1 = new HashMap();
        m1.put(null,1);
        Map m2 = new Hashtable();
     //   m2.put(null,1);
        Map m3 = new TreeMap();
        m3.put(null,null);
        Map m4 = new ConcurrentHashMap();*/

        Map m1 = new TreeMap();
        Map m2 = new HashMap();
        m1.put(4,"1");
        m1.put(1,"2");
        m1.put(5,"3");
        m2.put(4,"1");
        m2.put(1,"2");
        m2.put(5,"3");

        Iterator E= m1.entrySet().iterator();
        while (E.hasNext()){
            Map.Entry E1 = (Map.Entry) E.next();
            System.out.println(E1.getKey()+" "+E1.getValue());
        }
        Iterator E2= m2.entrySet().iterator();
        while (E2.hasNext()){
            Map.Entry E1 = (Map.Entry) E2.next();
            System.out.println(E1.getKey()+" "+E1.getValue());
        }
    }
}

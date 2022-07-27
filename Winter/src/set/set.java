package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
    public static void main(String[] args){
        Set set = new HashSet();
        set.add("你");
        set.add("我");
        boolean add2 = set.add("他");
        boolean add1 = set.add("你");
        System.out.println(set.size());
        System.out.println(add1);
        System.out.println(add2);
        System.out.println(set);

        Iterator i = set.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

}

package search;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstUniqCharDemo {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new LinkedHashMap<>();
        char[] ch = s.toCharArray();
        for (char c : ch){
            if (map.containsKey(c))
                map.put(c, false);
            else
                map.put(c, true);
        }

        for (Map.Entry<Character, Boolean> e : map.entrySet())
            if (e.getValue())
                return e.getKey();

        return ' ';
    }

}
//abaccdeff
//leetcode

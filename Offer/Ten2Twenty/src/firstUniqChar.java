import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstUniqChar {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] ch = s.toCharArray();
        for (char c : ch)
            dic.put(c, !dic.containsKey(c));
        for (Map.Entry<Character, Boolean> d : dic.entrySet()){
            if (d.getValue()) return d.getKey();
    }
        return ' ';

    }
}

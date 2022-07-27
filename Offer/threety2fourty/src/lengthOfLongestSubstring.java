import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = dic.getOrDefault(s.charAt(i), -1);
            dic.put(s.charAt(j), j);
            tmp = tmp < i - j ? tmp + 1 : j - i;
            res = Math.max(res, tmp);
        }
        return res;
    }
}

package dynamic;

/**
 * 1.首先定义dp数组，其中dp[i]表示以字符i为结尾最长的不重复字符串长度
 * 2.转移方程：这里有两种情况，就是字符i是否在位置i之前出现过
 *  a.没有出现，则dp[i] = dp[i-1] + 1
 *  b.出现了，则dp[i]的大小取决了字符i是否出现在前一段最长字符串内，还是在之外
 *      1.出现之外，也就是前一段最长字符串中没有包含字符i，则dp[i] = dp[i - 1] + 1;
 *      2.出现之内，则dp[i] = 该字符i的位置 - 该字符i上一次出现的位置

 */

public class lengthOfLongestSubstringDemo {
    public int lengthOfLongestSubstring(String s) {
        int res = 0, temp = 0;
        for (int i = 0; i < s.length(); i++){
            int j = i - 1;
            while (j >=0 && s.charAt(i) != s.charAt(j))
                j--; //这里会得到字符i上一次出现的位置
            temp = temp < i - j ? temp + 1 : i - j;
            res = Math.max(res, temp);
        }
        return res;
    }
}

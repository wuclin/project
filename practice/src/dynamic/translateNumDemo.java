package dynamic;

import java.util.ArrayList;

/**
 * 这里对于是往前还是往后结果是一样的，
 * 1. 首先定义dp数组，dp[i]表示以数字i为结尾有dp[i]种方法
 * 2. 对于dp[i]的取值来说，取决于当前字符i和字符i+1有一种还是两种排列方式，假如dp[i-1]dp[i]在10到24之间则说明有两种方式
 * 3.
 *
 * 12258
 */
public class translateNumDemo {
    public int translateNum(int num) {
        int a = 1, b = 1;
        int x, y = num % 10; //x为前一位，y为后一位
        while(num != 0){
            num /= 10;
            x = num % 10;
            int temp = x * 10 + y;
            int c = (temp >= 10 && temp <= 24) ? a+b : a;
            y = x;
            b = a;
            a = c;

        }

        return a;

    }
}

package DoubleLink;

import java.nio.Buffer;
import java.util.ArrayList;

public class reverseWordsDemo {
    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuffer res = new StringBuffer();
        while(i >= 0){
            while (i >= 0 && s.charAt(i) != ' ')
                i--;
            res.append(s.substring(i+1, j+1) + ' ' );
            while (i >= 0 && s.charAt(i) == ' ')
                i--;
            j = i;
        }
        return res.toString().trim();
    }
}

package search;

import java.util.HashMap;

public class findRepeatNumberDemo {
    public static void main(String[] args){
        int[] a = {2,3,1,0,2,5,3};
        System.out.println(findRepeatNumber(a));
    }
    public static int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
            if (map.containsKey(i))
                return i;
            else
                map.put(i, 0);
        }
        return 0;
    }
}

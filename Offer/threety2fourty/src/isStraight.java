import java.util.HashSet;
import java.util.Set;

public class isStraight {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int min = 14;
        int max = 0; //注意这里
        for (int num : nums){
            if (num == 0) continue;;
            min = Math.min(min,num);
            max = Math.max(max,num);
            if (repeat.contains(num)) return false;
            repeat.add(num);
        }
        return max - min < 5;
    }

    //构成顺子 1.不能有重复除了零 2.最大值的和最小值之差小于5
}

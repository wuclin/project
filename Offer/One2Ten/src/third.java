import java.util.Arrays;
import java.util.HashMap;

public class third {
    public static void main(String[] args){
        int[] nums = {2,3,1,0,2,5,3};
        Solution1 a = new Solution1();
        Solutino2 b = new Solutino2();
        System.out.println(a.findRepeatNumber(nums));
        System.out.println(b.findRepeatNumber(nums));
    }

}
class Solution1{
     public int findRepeatNumber(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if (map.containsKey(nums[i]))
                return nums[i];
            else
            {
                map.put(nums[i],i);
            }
        }
        return 0;
    }
}
class Solutino2{
    public int findRepeatNumber(int[] nums){
        Arrays.sort(nums);
        for (int i=0; i<nums.length;i++)
        {
            while (nums[i] != i)
            {
                if (nums[i] == nums[nums[i]])
                    return nums[i];
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[nums[i]] = temp;
            }
        }
        return 0;
    }
}

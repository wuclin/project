package DoubleLink;

public class twoSumDemo {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i < j){
            if (target > nums[i] + nums[j])
                j--;
            else if (target < nums[i] + nums[j])
                i++;
            else return new int[]{nums[i], nums[j]};
        }
        return new int[0];
    }
}

package dynamic;
//[-2,1,-3,4,-1,2,1,-5,4]
//6
public class maxSubArrayDemo {
    public int maxSubArray(int[] nums) {
        int res = nums[0];

        for(int i = 1; i < nums.length; i++){
            nums[i] += Math.max(nums[i-1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }

}

//这里不适用dp辅助数组直接在原数组上操作
//

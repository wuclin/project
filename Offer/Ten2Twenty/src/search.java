public class search {
    int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target-1);
    }
    int helper(int[] nums, int target){
        int i = 0;
        int j = nums.length - 1;
        while(i <= j){
            int m = (i+j)/2;
            if (nums[m] <= target)
                i = m + 1;
            else
                j = m - 1;
        }
        return i;
    }

}

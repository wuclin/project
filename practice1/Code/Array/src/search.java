//二分查找
//主要是看左右区间，如果是左闭右闭区间的话，由于左右区间最后会重合，所以这里判断条件就用等于
public class search {
    public int search(int[] nums, int target) {
        if(target > nums[nums.length - 1] || target < nums[0])
            return -1;

        Math.min
        int i = 0, j = nums.length - 1;
        while(i <= j){
            int m = i + ((j - i) >> 1);
            if (nums[m] > target)
                j = m - 1;
            else if (nums[m] < target)
                i = m + 1;
            else
                return m;
        }
        return -1;
    }
}

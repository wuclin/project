public class exchange {
    public int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i > j){
            if (nums[i] % 2 != 0){
                i++;
                continue;
            }
            if (nums[j] % 2 == 0){
                j--;
                continue;
            }
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;

        }
        return nums;
    }
}

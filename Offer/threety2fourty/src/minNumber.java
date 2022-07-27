import java.util.Arrays;

public class minNumber {
    public String minNumber(int[] nums){
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs,(x, y) -> (x + y).compareTo(y + x));
        //背下来，芜湖
        StringBuffer res =new StringBuffer();
        for (String str : strs)
            res.append(str);

        return res.toString();
    }
}

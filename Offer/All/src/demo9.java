/**
 * 旋转数组的最小数字
 */
public class demo9 {
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high){
            int p = low + (high - low)/2;
            if (numbers[high] > numbers[p])
                high = p;
            else if (numbers[p] > numbers[high])
                low = p+1;
            else
                high -= 1;
        }

        return numbers[low];
    }
}

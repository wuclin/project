package search;

public class minArrayDemo {
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while(i < j){
            int m = i + (j - i)/2;
            if (numbers[m] > numbers[j])
                i = m + 1;
            else if (numbers[m] < numbers[i])
                j = m;
            else
                j--;
        }
        return numbers[i];
    }
}
//最小值的左边比他大右边也比她大
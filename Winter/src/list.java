import java.util.Arrays;

public class list {
    public static void main(String[] args){
        int[] a = {4,2,1,5,6,3};
        sort s = new sort();
        for (int i:a)
            System.out.println(i);
        System.out.println(a);
        s.PrintSort(a);
        for (int i:a)
            System.out.println(i);
        a[5] = 1;
        System.out.println(a);
    }

}
class sort{
    public void PrintSort(int[] a){
        Arrays.sort(a);
    }
}
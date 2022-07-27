package sort;


public class testdemo {
    public static void main(String[] args){
        int[] a = {2,1,3,5,4};
        testdemo t1 = new testdemo();
        t1.sort(a);


        for (int i : a)
            System.out.println(i);
    }


    public void sort(int[] a){
        sort(a, 0, a.length - 1);
    }

    public void sort(int[] a, int lo, int hi){
        if (lo >= hi)
            return;
        int p = partition(a, lo, hi);
        sort(a, lo, p - 1);
        sort(a, p + 1, hi);
    }

    public int partition(int[] a, int lo, int hi){
        int i = lo, j = hi + 1;
        int temp = a[lo];
        while(true){
            while(a[++i] < temp) if (i == hi) break;
            while(a[--j] > temp) if (j == lo) break;
            if (i >= j)
                break;
            int t = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        int t = a[lo];
        a[lo] = a[j];
        a[j] = t;
        return j;
    }
}


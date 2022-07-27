package sort;


public class QuickSort {
    public void sort(int[] a){
        sort(a, 0, a.length - 1);
    }

    public void sort(int[] a, int lo, int hi){
        if (lo >= hi) return;
        int p  = parition(a, lo, hi);
        sort(a, lo, p - 1);
        sort(a, p + 1, hi);
    }

    public int parition(int[] a, int lo, int hi){
        int i = lo, j = hi + 1;
        int temp = a[lo];
        while(true) {
            while(a[++i] < temp) if (i == hi) break;
            while (a[--j] > temp) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public void exch(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}

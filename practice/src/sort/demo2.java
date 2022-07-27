package sort;

public class demo2 {

    public static void main(String[] args){
        int[] a = {2,1,4,5,3};
        demo2 d = new demo2();
        d.mq(a);

        for (int i : a)
            System.out.println(i);
    }

    private static int[] aux;

    public void mq(int[] a){
        aux = new int[a.length];
        mq(a, 0, a.length - 1);
    }

    public void mq(int[] a, int lo, int hi){
        if (lo >= hi)
            return;
        int mid = lo + (hi-lo) /2;
        mq(a, lo, mid);
        mq(a, mid + 1, hi);
        sort(a, lo, mid, hi);
    }

    public void sort(int[] a, int lo, int mid, int hi){
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];

        for (int k = lo; k <= hi; k++)
        {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[i] > aux[j]) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
}


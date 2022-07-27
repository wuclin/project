package dynamic;

//0 0, 1 1, 2 1, 3 2
public class numWaysDemo {
    public int numWays(int n) {
        int[] a = {0,1};
        if (n < 2)
            return a[n];

        int res = 0;
        for (int i = 2; i <= n; i++){
            res = (a[0] + a[1]) % 1000000007;
            a[0] = a[1];
            a[1] = res;
        }
        return res;
    }
}

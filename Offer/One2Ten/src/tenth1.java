public class tenth1 {
    public static void main(String[] args){
        int n1 = 2;
        int n2 = 5;
        System.out.println(fib(2));
        System.out.println(fib(5));
    }
    public static int fib(int n){
        int[] res = {0,1};
        if(n < 2){
            return res[n];
        }
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        for (int i = 2; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}

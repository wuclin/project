public class fourty {
    public static void main(String[] args){
        Solution14 s14 = new Solution14();
        System.out.println(s14.cuttingRope(2));
        System.out.println(s14.cuttingRope(10));
    }
}
class Solution14{
    public int cuttingRope(int n){
        if (n < 2) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;

        //这一块以下记着就可以啦
        int timesOf3 = n/3;
        if (n - timesOf3*3 == 1){
            timesOf3 -= 1;
        } //如果有4的就要切成2*2

        int timesOf2 = (n-timesOf3*3) /2;

        return (int)Math.pow(3,timesOf3) *
                (int)Math.pow(2,timesOf2);
    }

    public int cuttingRope2(int n){
        return 0;
    }
}

public class sumNums {
    int res = 0;
    int sumNums(int n){
        boolean x = n>1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }
}

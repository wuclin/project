public class threeth {
}
class Solution13{
    int m,n,k;
    boolean[][] visited;
    public int movingCount(int m, int n,int k){
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        return dfs(0,0);
    }
    public int dfs(int i,int j){
        if (i >= m || j >= n || k < getDigitSum(i) + getDigitSum(j) ||
                visited[i][j])
            return 0;
        visited[i][j] = true;
        return 1+dfs(i+1,j)+dfs(i,j+1);
    }


    int getDigitSum(int number){
        int sum = 0;
        while(number != 0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
}
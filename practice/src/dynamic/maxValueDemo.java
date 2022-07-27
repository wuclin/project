package dynamic;

/**
 *  [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 *   用一个二维数组对应，每一个元素表示到该位置获得的最大礼物价值
 */
public class maxValueDemo {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        for(int i = 1; i < m; i++)
        {
            dp[i][0] += grid[i-1][0];
            System.out.println(dp[i][0]);
        }

        for (int i = 1; i < n; i++)
            dp[0][i] += grid[0][i-1];

        int res = Integer.MIN_VALUE;
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++){
                dp[i][j] = grid[i][j] + Math.max(dp[i-1][j], dp[i][j-1]);
                res = Math.max(dp[i][j], res);
            }


        /*for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                System.out.println(dp[i][j] + ",");*/
        return res;

    }
}

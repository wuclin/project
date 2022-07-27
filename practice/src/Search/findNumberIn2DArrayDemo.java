package search;
//[
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
//


public class findNumberIn2DArrayDemo {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int m = matrix.length, n = matrix[0].length;
        int i = m - 1, j = 0;
        while(i >= 0 && j <= n -1){
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                i--;
            else if (matrix[i][j] < target)
                j++;

        }
        return false;
    }
}

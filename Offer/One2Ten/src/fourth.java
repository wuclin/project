public class fourth {
    public static void main(String[] args){
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19}
                ,{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target1 = 5;
        int target2 = 20;
        Solution solution = new Solution();
        System.out.println(solution.findNumberIn2DArray(matrix,target1));
        System.out.println(solution.findNumberIn2DArray(matrix,target2));

    }


}
class  Solution{
    public boolean findNumberIn2DArray(int[][] matrix, int target){
        boolean flag = false;
        if (matrix == null || matrix.length == 0 ||matrix[0].length == 0)
            return flag;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols - 1;
        while(row < rows && col > 0)
        {
            if (matrix[row][col] == target)
            {
                flag = true;
                return flag;
            }
            else {
                if (matrix[row][col] < target)
                    row++;
                else col--;
            }
        }
        return flag;
    }

}

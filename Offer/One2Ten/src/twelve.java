public class twelve {

}
class Solution12{
    boolean exist(char[][]board, String word){
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (DFS(board, words, i, j, 0))  //这里需要对每一个坐标都进行深度
                    return true;
            }
        }
        return false;
    }
    boolean DFS(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i<0 || j >= board[0].length || j<0 || board[i][j] != word[k])
            return false;
        if (k == word.length - 1)
            return true;
        board[i][j] = '\0';//表示该点已被访问过
        boolean res = DFS(board, word, i+1, j, k+1) || DFS(board, word, i, j+1, k+1) ||
                      DFS(board, word, i-i, j, k+1) || DFS(board, word, i, j-1, k+1);
        board[i][j] = word[k];
        return res;
    }

}

package Track;

public class existDemo {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++){
                if (dfs(words, board, i, j, 0))
                    return true;
            }

        return false;
    }

    public boolean dfs(char[] words, char[][] board, int i, int j, int k){
        if (i >= board.length || i < 0 || j >= board[0].length || j <0 ||
        board[i][j] != words[k])
            return false;

        if (k == words.length - 1)
            return true;

        board[i][j] = '\0';
        boolean res = dfs(words, board, i+1, j, k + 1)||dfs(words, board, i, j+1, k + 1)
                      ||dfs(words, board, i-1, j, k + 1)||dfs(words, board, i, j-1, k + 1)

        board[i][j] = words[k];

        return res;
    }
}

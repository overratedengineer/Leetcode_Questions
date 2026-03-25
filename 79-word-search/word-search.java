class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, 0, word)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, int i, int j, int idx, String word) {
        if (idx == word.length()) return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
            || board[i][j] != word.charAt(idx)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board, i + 1, j, idx + 1, word) ||
                        dfs(board, i - 1, j, idx + 1, word) ||
                        dfs(board, i, j + 1, idx + 1, word) ||
                        dfs(board, i, j - 1, idx + 1, word);

        board[i][j] = temp;

        return found;
    }
}
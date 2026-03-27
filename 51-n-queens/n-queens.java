import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        int r[] = new int[n];
        int ld[] = new int[2*n-1];
        int ud[] = new int[2*n-1];
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row:board) Arrays.fill(row,'.');
        fun(0,n,r,ld,ud,ans,board);
        return ans;
    }

    public void fun(int col, int n, int r[], int ld[], int ud[],
                    List<List<String>> ans, char[][] board) {

        if (col==n) {
            List<String> temp = new ArrayList<>();
            for (int i=0; i<n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for (int row=0; row<n; row++) {
            if (r[row]==0 && ld[row+col]==0 && ud[n-1+col-row]==0) {
                board[row][col] = 'Q';
                r[row]=1;
                ld[row+col]=1;
                ud[n-1+col-row]=1;

                fun(col+1,n,r,ld,ud,ans,board);

                board[row][col]='.';
                r[row]=0;
                ld[row+col] = 0;
                ud[n-1+col-row]=0;
            }
        }
    }
}
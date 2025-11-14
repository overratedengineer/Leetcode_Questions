class Solution {

    void dfs(int r, int c, char[][] grid, boolean[][] vis) {
        vis[r][c] = true;
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        for (int k=0; k<4;k++) {
            int nr = r+dr[k];
            int nc = c+dc[k];
            if (nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length) {
                if (grid[nr][nc]=='1'&& vis[nr][nc]==false) {
                    dfs(nr,nc,grid,vis);
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int count = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j]=='1' && vis[i][j]==false) {
                    dfs(i,j,grid,vis);
                    count++; 
                }
            }
        }

        return count;
    }
}

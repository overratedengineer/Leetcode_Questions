class Solution {
     void dfs(int r , int c ,int grid[][]){
     
        int n = grid.length;
        int m = grid[0].length;
        // int x[] ={1,-1,0,0};
        // int y[] ={0,0,-1,1};
        // for(int k=0;k<4;k++){
        //    int xi = i+x[k];
        //    int yj = j+y[k];
        //    if(xi<n&&xi>=0 && yj<m &&yj>=0){
        //     if(grid[xi][yj]==1)  dfs(xi,yj,grid);
           
        //    }
        // }
        //    grid[r][c] = 0;
         if(r<n&&r>=0 && c<m &&c>=0 && grid[r][c]==1){
            grid[r][c] = 0;
            dfs( r+1, c,grid);
            dfs( r-1, c,grid);
            dfs( r,c+1,grid);
            dfs( r,c-1,grid);
         }
    }
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i =0;i<n;i++){
            if(grid[i][0]==1) dfs(i,0,grid);
            if(grid[i][m-1]==1) dfs(i,m-1,grid);
        }

         for(int i =0;i<m;i++){
            if(grid[0][i]==1) dfs(0,i,grid);
              if(grid[n-1][i]==1) dfs(n-1,i,grid);
        }
        int count=0;
 for(int i =0;i<n;i++){
 for(int j=0;j<m;j++){
if(grid[i][j]==1) count++;
 }

 }
    return count;    
    }
}
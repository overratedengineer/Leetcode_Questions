class Solution {
    public void dfs(int i , int j , char grid[][] , int vis[][]){
        int m=grid.length;
        int n=grid[0].length;
        vis[i][j]=1;
        int x[] = {1,-1,0,0};
        int y[] = {0,0,1,-1};
        for(int k =0;k<4;k++){
            int xi = i + x[k];
            int yj = j + y[k];
            if(xi<m && xi>=0 && yj<n &&yj>=0 ){
                if(grid[xi][yj]=='1' && vis[xi][yj]!=1){
                 dfs(xi,yj,grid,vis);
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        int vis[][] = new int[m][n]; 
       for(int i =0; i<m ;i++){
        for(int j =0;j<n;j++){
           if(vis[i][j]!=1 && grid[i][j]=='1'){
            dfs(i,j,grid,vis);
             count++;
           }
        }
       }
       return count;
    }
}

class Solution {
    int solve(int i,int j,int grid[][], Integer dp[][]){
        int n = grid.length;
        int m = grid[0].length;
        if(n-1==i && m-1==j) return grid[i][j];
        if(dp[i][j]!=null) return dp[i][j];
        int min = Integer.MAX_VALUE;
        if(i+1<n){
         min = Math.min(min,solve(i+1,j,grid,dp)+grid[i][j]);
        }
          if(j+1<m){
        min = Math.min(min,solve(i,j+1,grid,dp)+grid[i][j]);
          }
         return dp[i][j]=min; 
          }
    
    public int minPathSum(int[][] grid) {
         int n = grid.length;
        int m = grid[0].length;
        Integer dp[][]= new  Integer[n][m];
       return solve(0,0,grid,dp);
    }
}
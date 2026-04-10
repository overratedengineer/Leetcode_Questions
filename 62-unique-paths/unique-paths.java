class Solution {
    public int solve(int i,int j,int arr[][],Integer dp[][]){
        int n = arr.length;
        int m = arr[0].length;
      if(i==n-1 && j==m-1){
       return 1;
      }
      if(dp[i][j]!=null) return dp[i][j] ;
      int w =0;
      if(i+1<n)
      w = solve(i+1,j,arr,dp);
    
    if(j+1<m){
       w+=solve(i,j+1,arr,dp);
    }
    return dp[i][j]=w;
    }
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];
        Integer dp[][] = new Integer[m][n];
        return solve(0,0,arr,dp);
    }
}
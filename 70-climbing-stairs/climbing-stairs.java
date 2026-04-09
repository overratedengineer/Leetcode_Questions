class Solution {
    public int climbStairs(int n) {
        Integer dp[] = new Integer [n+1];
       return solve(0,n,dp);
    }
    public int solve(int i ,int n,Integer  dp[]){
        if(i>n){
            return 0;
        }
        if(i==n){
            return 1;
        }
        if(dp[i]!=null) return dp[i];
        int w =0;
      w = solve(i+1,n,dp)+
        solve(i+2,n,dp);
        return dp[i]=w;
    }
}
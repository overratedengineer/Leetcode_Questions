class Solution {
    public int solve(int w,int i,int sum,int[] coins, Integer dp[][]){
        int n = coins.length;
        if(sum==0){
            return 1;
        }
        if(sum<0 || i>n-1){
            return 0;
        }
        if(dp[i][sum]!=null) return dp[i][sum];
        //not take
        w=solve(w,i+1,sum,coins,dp);
        //take
        w+=solve(w,i,sum-coins[i],coins,dp);
        return dp[i][sum]=w;
    }
    public int change(int amount, int[] coins) {
         int c = coins.length;
        Integer dp[][] = new Integer [c][amount+1];
        return solve(0,0,amount,coins,dp);
    }
}
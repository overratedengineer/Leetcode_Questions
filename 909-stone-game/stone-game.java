class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Integer dp[][] = new Integer[n][n];
        return rec(0,n-1,piles,dp)>0;
    }
    public int rec(int l,int r,int arr[], Integer dp[][])
    {
        if(l==r) return arr[l];
        if(dp[l][r]!=null) return dp[l][r];
        int m = arr[l] + rec(l+1,r,arr,dp);
        int o = arr[r]+rec(l,r-1,arr,dp);
        return dp[l][r]=Math.max(m,o);
    }
}
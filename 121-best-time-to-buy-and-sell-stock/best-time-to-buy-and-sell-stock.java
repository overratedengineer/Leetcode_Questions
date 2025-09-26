class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[] = new int[n];
        

        int min = prices[0];
        for(int i =0;i<n;i++){
            min = Math.min(prices[i],min);
         if(i!=0)  dp[i] = Math.max(prices[i] - min,dp[i-1]);else dp[0]=0;

        }
        return dp[n-1];
    }
}
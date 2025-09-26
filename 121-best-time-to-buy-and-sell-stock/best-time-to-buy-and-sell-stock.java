class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[] = new int[n];
        

        int min = prices[0];
         int prev =0;
         int prev2 =0;
        for(int i =0;i<n;i++){
        min = Math.min(prices[i],min);
        if(i!=0)  prev = Math.max(prices[i]-min,prev2);
         prev2 = prev;
        }
        return prev2;
    }
}
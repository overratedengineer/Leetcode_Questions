class Solution {
    public int superEggDrop(int k, int n) {
        Integer[][] dp = new Integer[k + 1][n + 1];
        return solve(k, n, dp);
    }

    public int solve(int k, int n, Integer[][] dp) {
        if (k == 1) return n;
        if (n == 0 || n == 1) return n;
        if (dp[k][n] != null) return dp[k][n];
        int low = 1, high = n;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int breakCase = solve(k - 1, mid - 1, dp);
            int notBreakCase = solve(k, n - mid, dp);
            int temp = 1 + Math.max(breakCase, notBreakCase);
            ans = Math.min(ans, temp);
            if (breakCase < notBreakCase) {
                low = mid + 1;   
            } else {
                high = mid - 1;  
            }
        }

        return dp[k][n] = ans;
    }
}
class Solution {

    public int func(int i, int prevIndex, int[] arr, int[][] dp) {
        if (i == arr.length) {
            return 0;
        }
        if (dp[i][prevIndex + 1] != -1) {
            return dp[i][prevIndex + 1];
        }

        int take = 0;
        if (prevIndex == -1 || arr[i] > arr[prevIndex]) {
            take = 1 + func(i + 1, i, arr, dp);
        }
        int skip = func(i + 1, prevIndex, arr, dp);
        dp[i][prevIndex + 1] = Math.max(take, skip);

        return dp[i][prevIndex + 1];
    }

    public int lengthOfLIS(int[] nums) {

        int n = nums.length;
        int[][] dp = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        return func(0, -1, nums, dp);
    }
}

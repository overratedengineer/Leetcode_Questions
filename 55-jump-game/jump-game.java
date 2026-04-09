class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        return solve(nums, 0, dp);
    }

    public boolean solve(int[] nums, int i, Boolean[] dp) {
        if (i >= nums.length - 1)
            return true;

        boolean a = false;
        if (dp[i] != null)
            return dp[i];
        for (int x = 1; x <= nums[i]; x++) {
            a = a || solve(nums, i + x, dp);
        }
        return dp[i] = a;
    }
}
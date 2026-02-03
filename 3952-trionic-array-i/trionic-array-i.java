class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int i = 0;

        // 1️⃣ strictly increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;   // no increasing part

        // 2️⃣ strictly decreasing
        int mid = i;
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == mid) return false; // no decreasing part

        // 3️⃣ strictly increasing again
        int last = i;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == last) return false; // no final increasing

        return i == n - 1;
    }
}

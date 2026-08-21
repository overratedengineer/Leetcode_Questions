class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int count = 0;
        int zero = 0;
        int max = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                zero++;
            }
            count++;
            if(zero > k) {
                if (nums[l] == 0) {
                    zero--;
                }
                l++;
                count--;
            }
            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}

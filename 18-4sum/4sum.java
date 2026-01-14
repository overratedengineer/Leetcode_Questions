class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> al = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return al;
        for (int l = 0; l < n - 3; l++) {
            if (l > 0 && nums[l] == nums[l - 1]) continue;

            int i = l + 1;
            while (i < n - 2) {
                if (i > l + 1 && nums[i] == nums[i - 1]) {
                    i++;
                    continue;
                }

                int j = i + 1;
                int k = n - 1;

                while (j < k) {
                    long sum = (long) nums[l] + nums[i] + nums[j] + nums[k];

                    if (sum == target) {
                        al.add(Arrays.asList(nums[l], nums[i], nums[j], nums[k]));

                        int prevj = nums[j];
                        int prevk = nums[k];
                        while (j < k && nums[j] == prevj) j++;
                        while (j < k && nums[k] == prevk) k--;
                    }
                    else if (sum < target) {
                        int prevj = nums[j];
                        while (j < k && nums[j] == prevj) j++;
                    }
                    else {
                        int prevk = nums[k];
                        while (j < k && nums[k] == prevk) k--;
                    }
                }
                i++;
            }
        }
        return al;
    }
}

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> al = new ArrayList<>();
        int n = nums.length;
        if (n < 3) return al;

        Arrays.sort(nums);

        int i = 0;

        while (i < n - 2) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    al.add(temp);

                    int prevj = nums[j];
                    int prevk = nums[k];
                    while (j < k && nums[j] == prevj) j++;
                    while (j < k && nums[k] == prevk) k--;
                }
                else if (sum < 0) {
                    int prevj = nums[j];
                    while (j < k && nums[j] == prevj) j++;
                }
                else {
                    int prevk = nums[k];
                    while (j < k && nums[k] == prevk) k--;
                }
            }

            int previ = nums[i];
            while (i < n - 2 && nums[i] == previ) i++;
        }

        return al;
    }
}

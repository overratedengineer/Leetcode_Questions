class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1); 
        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i = i + 1) {
            prefixSum = prefixSum + nums[i];

            int need = prefixSum - k;

            if (map.containsKey(need)) {
                count = count + map.get(need);
            }

            if (map.containsKey(prefixSum)) {
                map.put(prefixSum, map.get(prefixSum) + 1);
            } else {
                map.put(prefixSum, 1);
            }
        }

        return count;
    }
}

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        int prefix =0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
             prefix += nums[i];
            if(map.containsKey(prefix-goal)){
               count += map.get(prefix - goal); 
            }     
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;

    }
}
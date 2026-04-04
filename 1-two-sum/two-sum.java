import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer,Integer> map = new HashMap<>();
      for(int i =0;i<nums.length;i++){
        int chk = target-nums[i];
           if(map.containsKey(chk)){
             int f = map.get(chk);
             int a[] = {i,f};
            return a;
           } else {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
           }
      }
      throw new IllegalArgumentException("No two sum solution");
    }
}
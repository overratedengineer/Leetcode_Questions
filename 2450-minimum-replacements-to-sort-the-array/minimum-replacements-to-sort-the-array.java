import java.util.*;
class Solution {
    public long minimumReplacement(int[] nums) {
        long count =0;
        int n = nums.length;
        for(int i =n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
               int k = (int)Math.ceil((double)nums[i] / nums[i+1]);
               int min = (int)(nums[i]/k);
               nums[i]=min;
               count+=k-1;
            }
        }
        return count;
    }
    
}
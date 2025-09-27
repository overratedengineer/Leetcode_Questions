import java.util.*;
class Solution {
    public long minimumReplacement(int[] nums) {
        long count =0;
        int n = nums.length;
        for(int i =n-2;i>=0;i--){
            if(nums[i]%nums[i+1]==0){
                    count+=(nums[i]/nums[i+1] -1);
                    nums[i]=nums[i+1];
                } else {
                    int k = (nums[i]/nums[i+1])+1;
                    count+=k-1;
                    nums[i]=nums[i]/k;
                }
        }
        return count;
    }
    
}
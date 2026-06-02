class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max =0;
        int n =nums.length;
        for(int i:nums) max =Math.max(max,i);
        int l=0;
        long sum =0;
         int mc =0;
        for(int r=0;r<n;r++){
         if(nums[r]==max) mc++;
         while(mc>=k){
            sum+=n-r;
           if(nums[l]==max) mc--;
            l++;
         }
         
        }
        
      return sum; 
    }
}
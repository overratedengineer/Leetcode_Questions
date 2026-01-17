class Solution {
    public int[] searchRange(int[] nums, int target) {
       int s =0;
      int e = nums.length-1;
      int ans[] = {-1,-1};
      int n = nums.length;
    
        while(s<=e){
          int mid = (s+e)/2;
          if(nums[mid]==target){
            ans[0]=mid;
            ans[1]=mid;
            while(mid>0 && nums[mid-1]==target){
              ans[0]=mid-1;
              mid--;
            }
             while(mid<n-1 && nums[mid+1]==target){
              ans[1]=mid+1;
              mid++;
            }
            return ans;
          }
        else if(nums[mid]>target){
              e=mid-1;
          } else{
              s=mid+1;
          }
       }
           return ans;
    }
}
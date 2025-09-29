class Solution {
    public int[] searchRange(int[] nums, int target) {
         int n = nums.length;
        int l = 0;
        int r =n-1;
        int flag =0;
        int c1=0;
        int c2=0;
        int mid = (l+r)/2;
        int mid2 = mid;
        while(l<=r){
         if(flag!=1) { mid = (l+r)/2; mid2=mid; }
         if(flag==1){
            if(mid2>0 && nums[mid2-1]==target) mid2--; else c1=1;
            if(mid<n-1 && nums[mid+1]==target) mid++; else c2=1;
         }
         if(c1==1 && c2==1) break;
           if(nums[mid]==target && flag!=1){
            flag=1;
           } else if(nums[mid]<target){
            l=mid+1;
           } else if(nums[mid]>target) {
           r=mid-1;
           }
        }
      int[] a = new int[2];
        if (flag == 0) { 
            a[0] = -1;
            a[1] = -1;
        } else {
            a[0] = mid2;
            a[1] = mid;
        }
        return a;
    }
}
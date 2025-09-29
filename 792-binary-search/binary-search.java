class Solution {
    public int bs(int l,int r,int nums[],int target){
        int mid =(l+r)/2;
        if(nums[mid]==target) return mid;
        if(l>r){
           return -1;
        }
        
        if(nums[mid]>target){
          return  bs(l,mid-1,nums,target);
        } else {
          return  bs(mid+1,r,nums,target);
        }  
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        // int l = 0;
        // int r =n-1;
        // int flag =0;
        // while(l<=r){
        //   int mid = (l+r)/2;
        //    if(nums[mid]==target){
        //    return mid;
        //    } else if(nums[mid]<target){
        //     l=mid+1;
        //    } else {
        //    r=mid-1;
        //    }

        // }
        return bs(0,n-1,nums,target);
        
    }
}
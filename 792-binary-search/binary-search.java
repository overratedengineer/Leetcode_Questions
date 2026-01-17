class Solution {
    public int bs(int[] arr, int target,int s,int e){
        int mid = s+(-s+e)/2;
        if(s>e){
       return -1;
        }
         if(arr[mid]==target){
            return mid;
         } else if(arr[mid]>target){
           return bs(arr,target,s,mid-1);
         } else {
            return bs(arr,target,mid+1,e);
         }
         
    }
    public int search(int[] nums, int target) {
         return bs(nums,target,0,nums.length-1);
    }
}
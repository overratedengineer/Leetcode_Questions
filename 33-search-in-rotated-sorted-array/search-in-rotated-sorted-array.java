class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int s=0, e=n-1;
        while(s<e) {
            int mid=s+(e-s)/2;
            if(nums[mid]<=nums[e]) {
                e=mid;
            }else{
                s=mid+1;
            }
        }

        int pivot=s;
        s=0;
        e=n-1;

        if(target>=nums[pivot]&&target<=nums[e]) {
            s=pivot;
        }else{
            e=pivot-1;
        }

        while (s<=e) {
            int mid =s+(e-s)/2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]<target) s=mid+1;
            else e=mid-1;
        }

        return -1;
    }
}

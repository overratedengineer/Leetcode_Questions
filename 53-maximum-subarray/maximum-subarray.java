class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int n = nums.length;
        int max =0;
        int flag =0;;
        int min = -100000;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(nums[i]>0){
                flag=1;
            }
            if(sum<0){
                sum=0;
            }
            max = Math.max(sum,max);
            min = Math.max(nums[i],min);
        }
        if(flag==0) return min;
        return max;
    }
}
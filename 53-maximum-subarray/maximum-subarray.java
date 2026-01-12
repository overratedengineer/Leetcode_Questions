class Solution {
    public int maxSubArray(int[] nums) {
        // core idea if anywhere sum becomes negative leave it and move forward
        int max =-9999999;
        int sum =0;
         int maxi=-99999999;
        for(int i:nums){
            sum+=i;
            if(sum<0) sum=0;
            max = Math.max(max,sum);
            maxi=Math.max(maxi,i);
            
        }
        if(max==0) max=maxi;
        return max;
    }
}
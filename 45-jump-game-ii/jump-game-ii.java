class Solution {
    public int jump(int[] nums) {
       int jumps=0;
       int n=nums.length;
        int l=0;
        int r=0;
        while(r<n-1){
             int f=0;
             for(int i=l;i<=r;i++){
                f=Math.max(f,i+nums[i]);
             }
             jumps++;
            l=r+1;
            r=f;
        }
        return jumps;
    }
}
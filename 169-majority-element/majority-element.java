class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int e =0;
        for(int i =0;i<nums.length;i++){
          if(c==0) {
            c++;
           e=nums[i];
            continue;
            }
            if(e==nums[i]){
                c++;
            } else {
                c--;
            }
        }
        return e;
    }
}
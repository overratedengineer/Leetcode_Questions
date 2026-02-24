class Solution {
    public int[] singleNumber(int[] nums) {
        long xor =0;
        for(int i:nums){
           xor^=i;
        }
        long val=xor;
        xor&=(xor-1);
        val^=xor;
        int b1=0;
        int b2=0;
        for(int i:nums){
              if((i&val)!=0){
                b1^=i;
              } else {
                b2^=i;
              }
        }
        return new int[]{b1,b2};

    }
}
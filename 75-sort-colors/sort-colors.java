class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zp = 0;        
        int op = 0;        
        int tp = n - 1;    

        while (op <= tp) {
            if (nums[op] == 0) {
                int temp = nums[zp];
                nums[zp] = nums[op];
                nums[op] = temp;
                zp++;
                op++;
            } else if (nums[op] == 1) {
                op++;
            } else { 
              
                int temp = nums[op];
                nums[op] = nums[tp];
                nums[tp] = temp;
                tp--;
            }
        }
    }
}

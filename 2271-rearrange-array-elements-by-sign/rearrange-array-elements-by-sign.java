class Solution {
    public int[] rearrangeArray(int[] nums) {
        int no = nums.length;
        int arr[] = new int[no];
        int i =0;
        int p=-2;
        int n=-1;
        while(i<no){
            if(nums[i]>0){
            p+=2;
            arr[p]=nums[i];
            } else {
                n+=2;
                arr[n]=nums[i];
            }
            i++;
        }
        return arr;
    }
}
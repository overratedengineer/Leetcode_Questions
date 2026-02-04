class Solution {
    public void reverse(int arr[],int s,int e){
      while(s<e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
      }
    }
    public void rotate(int[] nums, int k) {
         int n = nums.length;
        if (n == 1) return;
        k = k % n;          
        if (k == 0) return;
        int s = n - k;
        reverse(nums, 0, s - 1);
        reverse(nums, s, n - 1);
        reverse(nums, 0, n - 1);
    }
}
class Solution {

    public int find(int arr[],int goal){
        int count =0;
        int sum =0;
        int l = 0;
        if(goal<0) return 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>goal){
                sum-=arr[l];
                l++;
            }
            count+=i-l+1;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
       // try optimal one - to find for <goal+1 - <goal this means finding for sum=goal

      return find(nums,goal) - find(nums,goal-1);
    }
}
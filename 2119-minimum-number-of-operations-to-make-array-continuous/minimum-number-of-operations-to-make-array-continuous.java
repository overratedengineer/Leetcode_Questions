class Solution {
    public int minOperations(int[] nums) {
          Arrays.sort(nums);
         int n = nums.length;
         // first set range l to r for every element 
         // 
         // set a mid pointer that goes till element equals n-1+1 and also count          duplicates and remove from the count  
         // get minimum from all elements and return the min
         // ans from every element will be n-(r-l)-d where d is duplicate till r 
         ArrayList<Integer> al = new ArrayList<>();
         al.add(nums[0]);
         for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]) al.add(nums[i]);
         }
       int l =0;
       int r =0;
       int min = Integer.MAX_VALUE;
       while(l<al.size()){
        int val1 = al.get(l)+n-1;
        while(r<al.size() && al.get(r)<=val1){
            r++;
        }
        min=Math.min(min,n-(r-l));
         l++;
       }
      
        return min; 
    }
}
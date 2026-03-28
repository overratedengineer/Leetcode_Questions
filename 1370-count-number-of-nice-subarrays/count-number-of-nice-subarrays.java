class Solution {
    public int find(int arr[],int k){
        if(k<0) return 0;
        int l =0;
        int count =0;
        int oc=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&1)==1) oc++;
            while(oc>k){
                if((arr[l]&1)==1) oc--;
                l++;
            }
            count+=i-l+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        // I figured out myself 
        // try to find for subarrays with <=k - <=k-1 =k-1
             return find(nums,k)-find(nums,k-1);
    }
}
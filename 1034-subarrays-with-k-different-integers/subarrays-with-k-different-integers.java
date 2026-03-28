class Solution {

    public int find(int arr[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0;
        int count=0;
        for(int r=0;r<arr.length;r++){
            map.put(arr[r], map.getOrDefault(arr[r],0) + 1);
            if(k<0) return 0;
            while(map.size()>k){
                int val = map.get(arr[l]);
                map.put(arr[l],val-1);
                if(val==1){
                    map.remove(arr[l]);
                } 
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
 // whenever exactly k comes i think of <=k-<=k-1 and it works lets hope if it works 
      return find(nums,k)-find(nums,k-1);

    }
}
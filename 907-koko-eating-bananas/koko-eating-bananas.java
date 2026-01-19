class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int s =1;
        int max=0;
       for(int i=0;i<arr.length;i++){
        max = Math.max(max,arr[i]);
       }
        int e = max;
        while(s<=e){
            int mid =s+(e-s)/2;
            long val=0;
            for(int i=0;i<arr.length;i++){
             if(arr[i]<=mid){
               val++;
             } else if(arr[i]%mid==0){
               val+=(arr[i]/mid);
             } else {
                 val+=(arr[i]/mid);
                 val++;
             }
            }
            if(val>h){
               s=mid+1;
            } else if(val<=h){
                e=mid-1;
            }
        }
        return s;
    }
}
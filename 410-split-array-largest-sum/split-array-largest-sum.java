class Solution {
    public int splitArray(int[] arr, int k) {
         int n = arr.length;
        if(k>n) return -1;
        long s =0;
        long e =0;
        for(int i:arr){
             s = Math.max(s,i);
            e+=i;
        }
        while(s<=e){
            long mid = (s+e)/2;
            long sum =0;
            int kn=1;
           for (int i = 0; i < n; i++) {
             if (sum+arr[i]<=mid) {
              sum+=arr[i];
              }else{
             kn++;
             sum = arr[i];
             }
             }
            if(kn>k){
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        return (int)s;
    }
}
class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int s = 0;
        int e = 0;
        for(int i:arr){
            s=Math.max(s,i);
        e+=i;
        }

        while(s<=e){
            int mid = (s+e)/2;
            int d =0;
            int sum=0;
            for(int i : arr){
              sum+=i;
              if(sum>mid){
                d++;
                sum=i;
              }
            }
            if(d>=days){
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
      return s;
    }
}
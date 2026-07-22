class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        long s =1;
        long e =0;
        for(int i:arr) e= Math.max(e,i);
        while(s<=e){
            long mid = (e+s)/2;
            long needed =0;
            for(int i:arr){
                //if(i<=mid) { needed++; continue;}
                needed+=(i+mid-1)/mid;
            }
            if(needed>h){
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        return (int)s;
    }
}
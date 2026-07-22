class Solution {
    public int minDays(int[] arr, int m, int k) {
        int s =1;
        int e =0;
        int n= arr.length;
       if ((long)m * k > n)
    return -1;
        for(int i:arr) e=Math.max(e,i);
        int max =e;
        while(s<=e){
            int mid = s+(e-s)/2;
            int needed = 0;
            int mn =0;
            for(int i:arr){
                 if(i<=mid) needed++;
                 else needed =0;
                 if(needed == k) {mn++; needed =0;}
            }
            if(m>mn)
                s=mid+1;
            else e=mid-1;
        }
         return s;
    }
}
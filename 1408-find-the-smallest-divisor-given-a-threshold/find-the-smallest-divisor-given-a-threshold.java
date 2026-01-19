class Solution {
    public int smallestDivisor(int[] arr, int t) {
          int s=1,e=0;
         
        for (int x : arr) {
            e=Math.max(e, x);
        }
        
        int max =e;
        while (s<=e) {
            int mid = s+(e-s)/2;
            long vb =0;
            for (int x:arr) {
               vb+=(int)Math.ceil((double)x/mid);
            }
            if (vb>t) {
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        return s;
    }
}
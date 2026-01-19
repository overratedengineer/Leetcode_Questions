class Solution {
    public int minDays(int[] arr, int m, int k) {
          int s=1,e=0;
          
        for (int x : arr) {
            e=Math.max(e, x);
            s=Math.min(s,x);
        }
        int max =e;
        while (s<=e) {
            int mid = s+(e-s)/2;
            long vb =0;
            int count =0;
            for (int x:arr) {
                if(x<=mid){
                    count++;
                } else {
                    count=0;
                }
                if(count==k){
                    vb++;
                    count=0;
                }
            }

            if (vb<m) {
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        if(s>max){
            return -1;
        }
        return s;
    }
}
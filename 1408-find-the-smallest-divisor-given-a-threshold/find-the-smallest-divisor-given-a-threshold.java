class Solution {
    public int smallestDivisor(int[] arr, int t) {
        int n =arr.length;
        int s =1;
        int e =0;
        for(int i:arr) e=Math.max(e,i);
        while(s<=e){
            int mid = s+(e-s)/2;
            int v =0;
            for(int i:arr) v+=(i+mid-1)/mid;
            if(v>t)
                s=mid+1;
            else 
                e=mid-1;
        }
        return s;
    }
}
class Solution {
    public int minDays(int[] arr, int m, int k) {
        int s =1;
        int e =1;
        for(int i:arr){
            e=Math.max(e,i);
        }
        int fa =-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            int c=0;
            int ans =0;
            for(int i:arr){
                if(c==k){
                    ans++;
                    c=0;
                }
                if(i<=mid){
                  c++;
                } else {
                    c=0;
                }
            }
             if(c==k){
                    ans++;
                    c=0;
                }
           if(ans>=m){
               fa=mid;
               e=mid-1;
            } else {
               s=mid+1;
            }
        }
        return fa;
    }
}
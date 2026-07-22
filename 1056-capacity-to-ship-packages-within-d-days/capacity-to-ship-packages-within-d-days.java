class Solution {
    public int shipWithinDays(int[] arr, int d) {
        int s = 1;
        int e = 0;
        for(int i:arr){
        s=Math.max(s,i);
        e+=i;
        }
        int ans =0;
        while(s<=e){
            int mid = s+(e-s)/2;
             int cd = 1;
            int sum = 0;
            for (int i : arr) {
                if (sum + i > mid) {
                    cd++;
                    sum=i;
                } else {
                    sum+=i;
                }
            }
            if(cd>d){
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        return s;
    }
}
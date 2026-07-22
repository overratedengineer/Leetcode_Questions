class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int s =0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int vn = arr[mid]-(mid+1);
            if(vn<k){
             s=mid+1;
            } else {
             e=mid-1;
            }
        }
        return k+s;
    }
}
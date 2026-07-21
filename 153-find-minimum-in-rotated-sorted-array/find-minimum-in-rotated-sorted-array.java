class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int s =0;
        int e = n-1;
        int min = 5001;
        while(s<=e){
            int mid = s+(e-s)/2;
          if(arr[s]<=arr[mid]){
                min = Math.min(arr[s],min);
                s=mid+1;
          } else {
              min = Math.min(arr[mid],min);
              e=mid-1;
          }
        }
        return min;

    }
}
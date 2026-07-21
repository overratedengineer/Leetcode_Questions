class Solution {
    public boolean search(int[] arr, int k) {
        int n = arr.length;
        int s =0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==k){
                return true;
            } else {
                
            if (arr[s] == arr[mid] && arr[mid] == arr[e]) {
                s++;
                e--;
            } 
               else
                if(arr[s]<=arr[mid]){
                   if(k>=arr[s] && k<arr[mid]){
                    e=mid-1;
                   } else {
                    s=mid+1;
                   }
                } else {
                    if(k>=arr[mid] && k<=arr[e]){
                    s=mid+1;
                   } else {
                    e=mid-1;
                   }
                }
            }
        }
        return false;
    }
}
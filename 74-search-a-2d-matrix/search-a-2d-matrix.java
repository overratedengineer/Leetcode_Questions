class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int rs =0;
        int re = n-1;
        int cs =0;
        int ce =m-1;
        int ans=-1;
        if(target<arr[0][0]) return false;
        while(rs<=re){
            int mid = rs+(re-rs)/2;
            if(arr[mid][0]==target) return true;
            else if(arr[mid][0]>target){re=mid-1;ans=mid-1;}
            else {rs=mid+1; ans =mid;}
        }
         if (ans == -1) return false;
        while(cs<=ce){
            int mid = cs+(ce-cs)/2;
            if(arr[ans][mid]==target) return true;
            else if(arr[ans][mid]>target) ce=mid-1;
            else cs=mid+1;
        }
        return false;
    }
}
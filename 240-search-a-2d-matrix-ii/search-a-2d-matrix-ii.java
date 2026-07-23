class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        int n = arr.length;
        int m = arr[0].length;
        int r=0;
        int c=m-1;
        while(r<n && c>=0){
            if(arr[r][c]==t){
                return true;
            } else if(arr[r][c]>t){
                c--;
            } else{
                r++;
            }
        }
       return false;
        
    }
}
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int r = 0 ; int c = m-1;
        while(r<n&&c>=0){
            if(target==arr[r][c]){
                return true;
            } else if(target>arr[r][c]){
                r++;
            } else {
                c--;
            }
        }
      return false;
    }
}
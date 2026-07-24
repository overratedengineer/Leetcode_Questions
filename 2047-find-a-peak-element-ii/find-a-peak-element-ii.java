class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
         int s =0;
         int e = m-1;
         while(s<=e){
            int mid = s+(e-s)/2;
            int max =0;
            int ni= 0;
              for(int i=0;i<n;i++){
               if(max<=arr[i][mid]){
                 max = Math.max(max,arr[i][mid]);
                 ni=i;
               }
               }
               int x = mid>0?arr[ni][mid-1]:-1;
               int y = (mid>0 && mid<m-1)?arr[ni][mid+1]:-1;
               if( max>x && max>y){
                return new int[]{ni,mid};
               } else if(max<y){
                s=mid+1;
               } else {
                e=mid-1;
               }
         }
         return new int[]{-1};
    }
}
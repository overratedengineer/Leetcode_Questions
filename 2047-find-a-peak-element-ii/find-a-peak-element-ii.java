class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int s =0;
        int e =n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            //find max from that row 
            int max =arr[0][mid];
            int idx =0;
            for(int i=0;i<m;i++){
            if(max<arr[i][mid]){
                max=arr[i][mid];
                idx=i;
            }
            }
            int left=-1;
            if (mid-1>=0) left = arr[idx][mid-1];
            int right=-1;
            if (mid+1<n) right = arr[idx][mid+1];
            if(left<arr[idx][mid]&&right<arr[idx][mid]){
                return new int[]{idx,mid};
            } else if(left>arr[idx][mid]){
                 e=mid-1;
            } else {
                s=mid+1;
            }
            
        }
       
        return new int[]{0, 0};
    }
}

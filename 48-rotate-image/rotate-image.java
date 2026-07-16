class Solution {

    public void rotate(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for( int i=0;i<n;i++){
            for(int j =0;j<=i;j++){
              if(i!=j){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]=temp;
              }
            }
        }
     for(int i=0;i<n;i++){
        int pt =0;
        int lt = m-1;
        while(pt<lt){
        int temp = arr[i][pt];
                arr[i][pt] = arr[i][lt];
                arr[i][lt]=temp;
                pt++;
                lt--;
        }
     }
        
    }
}
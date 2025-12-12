class Solution {
    public int orangesRotting(int[][] grid) {
        
     Queue<int[]> q = new LinkedList<>();
   
     int n = grid.length;
     int m = grid[0].length;
       int vis[][] = new int[n][m];
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==2){
                vis[i][j]=1;
                int arr[] = {i,j,0};
                q.add(arr);
            }
        }
     }
     
     int max = 0;
   while(!q.isEmpty()){
    int ans[] = q.poll();
    int pi = ans[0];
    int pj = ans[1];
   
    int w = ans[2];
    max=Math.max(max,w);

     int x[]={0,0,1,-1};
     int y[]={1,-1,0,0};
    for(int i =0;i<4;i++){
        int xaxis = pi+x[i];
        int yaxis = pj+y[i];
        if(xaxis<n && xaxis>=0 && yaxis>=0 && yaxis<m && vis[xaxis][yaxis]==0 && grid[xaxis][yaxis]==1){
            int da[] ={xaxis,yaxis,w+1};
             vis[xaxis][yaxis]=1;
            q.add(da);
        }
    }
   }

   for(int i =0;i<n;i++){
    for(int j=0;j<m;j++){
        if(grid[i][j]==1 && vis[i][j]==0){
            return -1;
        }
    }
   }

      return max;
    }
}
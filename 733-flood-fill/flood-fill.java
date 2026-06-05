class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        boolean vis[][] = new boolean[m][n];

       //Pair k = new Pair(sr,sc);
        int col = image[sr][sc];
        image[sr][sc] = color;
        dfs(sr,sc,image,color,col,n,m,vis);
        return image;
    }
    public static void dfs(int i,int j ,int[][] arr,int c,int ac,int n , int m,boolean vis[][]){
     int ra[] ={1,0,-1,0};
     int ca[] ={0,1,0,-1};
     for(int f =0;f<4;f++){
        int nr = i-ra[f];
        int nc = j-ca[f];
        if(nr>=0 && nr<m && nc<n && nc>=0 && arr[nr][nc]==ac && !vis[nr][nc]){
           vis[nr][nc]=true;
           arr[nr][nc]=c;
           dfs(nr,nc,arr,c,ac,n,m,vis);
        }
     }

    }
}
class Pair{
    int r;
    int c ;
    public Pair(int r1,int c1){
     this.r=r1;
     this.c=c1;
    }
}
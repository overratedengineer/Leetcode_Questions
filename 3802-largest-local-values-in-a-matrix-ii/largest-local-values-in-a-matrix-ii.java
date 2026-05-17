class Solution {

    public int countLocalMaximums(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int ans=0;

        for(int val=1;val<=200;val++){

            int pre[][]=new int[n+1][m+1];

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){

                    int add=matrix[i][j]>val ? 1 : 0;

                    pre[i+1][j+1]=add
                            +pre[i][j+1]
                            +pre[i+1][j]
                            -pre[i][j];
                }
            }

            for(int i=0;i<n;i++){

                for(int j=0;j<m;j++){

                    if(matrix[i][j]!=val) continue;

                    int sr=Math.max(0,i-val);
                    int er=Math.min(n-1,i+val);

                    int sc=Math.max(0,j-val);
                    int ec=Math.min(m-1,j+val);

                    int cnt=
                            pre[er+1][ec+1]
                          - pre[sr][ec+1]
                          - pre[er+1][sc]
                          + pre[sr][sc];

                    if(i-val>=0 && j-val>=0 && matrix[i-val][j-val]>val) cnt--;

                    if(i-val>=0 && j+val<m && matrix[i-val][j+val]>val) cnt--;

                    if(i+val<n && j-val>=0 && matrix[i+val][j-val]>val) cnt--;

                    if(i+val<n && j+val<m && matrix[i+val][j+val]>val) cnt--;

                    if(cnt==0) ans++;
                }
            }
        }

        return ans;
    }
}
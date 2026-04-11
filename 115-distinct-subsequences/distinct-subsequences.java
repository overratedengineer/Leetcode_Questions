class Solution {
    public int solve(int i ,int j ,String s, String t, Integer dp[][]){
        int n = s.length();
        int m = t.length();
         if(j>m-1) return 1;
         if(i>n-1) return 0; 
         if(dp[i][j]!=null) return dp[i][j];
        // not pick
         dp[i][j] = solve(i+1,j,s,t,dp);
        //pick
        if(s.charAt(i)==t.charAt(j)){
           //ds+=solve(i+1,j,s,t);
           dp[i][j]+=solve(i+1,j+1,s,t,dp);
        }
        return dp[i][j];
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        Integer dp[][] = new Integer[n][m];
        return solve(0,0,s,t,dp);
    }
}
class Solution {
    public int solve(int i,int j,String s1,String s2,Integer dp[][]){
        if(i==s1.length()) return s2.length()-j;
         if(j==s2.length()) return s1.length()-i;
         if(dp[i][j]!=null) return dp[i][j];
        //insert 
       int a = solve(i,j+1,s1,s2,dp)+1;
        //delete
        a= Math.min(a,solve(i+1,j,s1,s2,dp)+1);
        //replace
        a= Math.min(a,solve(i+1,j+1,s1,s2,dp)+1);

        if(s1.charAt(i)==s2.charAt(j)){
           a=Math.min(a,solve(i+1,j+1,s1,s2,dp));
        }

        return dp[i][j]=a;
    }
    public int minDistance(String s1, String s2) {
      
        Integer dp[][] = new Integer[s1.length()][s2.length()];
        return solve(0,0,s1,s2,dp);
    }
}
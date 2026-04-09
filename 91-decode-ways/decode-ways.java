class Solution {
    public int numDecodings(String s) {
         Integer dp[] = new Integer[s.length()];
        return solve(0, s,dp);
    }
    public int solve(int i, String s,Integer dp[]) {
        // reached end → valid way
        if (i==s.length()) return 1;
        // invalid case
        if (s.charAt(i)=='0') return 0;
        if(dp[i]!=null) return dp[i];
        // take single digit
        int ways = solve(i+1,s,dp);
        // take two digits
        if (i+1<s.length()) {
            int num=(s.charAt(i)-'0')*10+(s.charAt(i+1)-'0');
            if (num>=10&&num<=26) {
                ways+=solve(i+2,s,dp);
            }
        }
        return dp[i]=ways;
    }
}
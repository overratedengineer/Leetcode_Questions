class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n!=goal.length()) return false;
        for(int i=0;i<n;i++){
            char c = goal.charAt(0);
            goal=goal.substring(1,n);
            goal+=c;
            if(goal.equals(s)) return true;
        }
        return false;
    }
}
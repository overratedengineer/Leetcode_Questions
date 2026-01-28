class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n!=goal.length()) return false;
          String s2 = s+s;
        if(s2.indexOf(goal) != -1)
        return true;
        return false;
    
    }
}
class Solution {
    public String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();
        int n = s.length();
        for(int i =0;i<n;i++){
            int c = (int) s.charAt(i);
            if(c>=65&&c<=90) {
                c+=32;
            }
            res.append((char)c);
        }
        return res.toString();
    }
}
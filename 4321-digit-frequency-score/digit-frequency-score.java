class Solution {
    public int digitFrequencyScore(int n) {
        long sum =0;
        String s = n+"";
        for(int i=0;i<s.length();i++){
           int v = s.charAt(i)-'0';
           sum+=v;
        }
        return (int)sum;
    }
}
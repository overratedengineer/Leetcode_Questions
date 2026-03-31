class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c : tasks){
            freq[c-'A']++;
        }
        int mf=0;
        for(int f:freq){
            mf = Math.max(mf, f);
        }
        int c=0;
        for(int f:freq){
            if(f==mf)c++;
        }
        int ans=(mf-1)*(n+1)+c;

        return Math.max(ans, tasks.length);
    }
}
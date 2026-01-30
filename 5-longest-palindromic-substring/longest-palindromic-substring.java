class Solution {
    public int pal(String s, int l,int r){
        int n = s.length();
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return l+1;
    }
    
    public String longestPalindrome(String s) {
        int ls = -1;
        int rs = -1;
        int max = 0;
        int n = s.length();

        for(int i=0;i<n;i++){
            int odd = pal(s,i,i);
            int even = pal(s,i,i+1);

            int oddc = ((i-odd)*2)+1;
            int evenc = ((i-even+1)*2);

            if(oddc > max){
                max = oddc;
                ls = odd;
                rs = odd + oddc - 1;
            }

            if(evenc > max){
                max = evenc;
                ls = even;
                rs = even + evenc - 1;
            }
        }

        if(ls == -1){
            return s.charAt(0)+"";
        }

        String t = "";
        for(int i=ls;i<=rs;i++){
            t+=s.charAt(i);
        }
        return t;
    }
}

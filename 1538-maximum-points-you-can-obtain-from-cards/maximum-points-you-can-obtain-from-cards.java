class Solution {
  
    public int maxScore(int[] cardScore, int k) {
        int n = cardScore.length;
        int ls =0; int rs =0;
        int lp =0;
        int rp= n-1;
        int max =0;
       // int n = cardScore.length;
        for(int i =0;i<k;i++){
            ls+=cardScore[i];
            
        }
        max=ls;
        for(int i=k-1;i>=0;i--){
            ls-=cardScore[i];
            rs+=cardScore[rp];
            rp--;
           max = Math.max(max,ls+rs);
        }
        return max;
    }
}
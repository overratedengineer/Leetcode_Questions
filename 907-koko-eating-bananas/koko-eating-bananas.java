class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i =0;i<piles.length;i++){
            max =Math.max(piles[i],max);
        }
        int s = 1;
        int e = max;
        int ans =max;
        while(s<=e){
            int mid = s+((e-s)/2);
            if(poss(mid,h,piles)){
                ans =mid;
                e = mid-1;
            } else {
                s =mid+1;
            }
        }
      return ans;
    }
    public boolean poss(int v,int h ,int piles[]){
        long count = 0;
        
        for(int i =0;i<piles.length;i++){
            if(v>=piles[i]){
                count+=1;
            } else 
            if(piles[i]%v==0){
               count += piles[i]/v;
            } else {
                count += (piles[i]/v) +1;
            }
        }
        if(count<=h){
            return true;
        } 
            return false;
    }
}
class Solution {
    public int mySqrt(int x) {
        int s =0;
        int e =x/2;
        if(x==1){return 1;}
        if(x==0){return 0;}
        while(s<=e){
            double mid = (s+e)/2;

            if(mid*mid==x){
                return (int)mid;
            } else if(mid*mid>x){
            e=(int)mid-1;
            } else if(mid*mid<x) {
              s=(int)mid+1;
            } 
        }
        return e;
    }
}
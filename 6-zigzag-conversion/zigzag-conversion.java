 import java.util.*;
class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1) return s;
        int n = s.length();
        int rc= numRows;
        int jump = 2*(rc-1);
        String res ="";
        for(int i=0;i<rc;i++ ){
        for(int j=i;j<n;j+=jump){
            res+=s.charAt(j);
            if(i!=0 && i!=rc-1 && j+jump-(2*i)<n){
                res+=s.charAt(j+jump-(2*i));
            }
        }
        }
       
     return res;
    }
}
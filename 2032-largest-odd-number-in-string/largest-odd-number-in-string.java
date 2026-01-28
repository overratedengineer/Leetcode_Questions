class Solution {
    public String largestOddNumber(String num) {
        int li =-1;
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                li=i;
                break;
            }
        }
        if(li!=-1){
            return new String (num.toCharArray(),0,li+1);
        } 

        return new String("");
    }
}
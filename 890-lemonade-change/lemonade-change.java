class Solution {
    public boolean lemonadeChange(int[] b) {
        int a[] = new int[2];
        for(int i=0;i<b.length;i++){
            if(b[i]==5){
                a[0]++;
            } else if(b[i]==10){
                a[1]++;
                if(a[0]<=0){
                    return false;
                }
                a[0]--;    
            } else {
                if(a[1]>0 && a[0]>0){
                    a[1]--;
                    a[0]--;
                } else if(a[0]>2){
                    a[0]-=3;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}
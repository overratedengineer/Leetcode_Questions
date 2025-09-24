import java.util.*;

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int water = 0;
        int l =0;
        int r = n-1;
        int maxl =0;
        int maxr =0;
       
        while(l<r){
            if(maxl<height[l]){
                maxl =height[l];
            }
            if(maxr<height[r]){
                maxr = height[r];
            }
           if(maxr>maxl){
            water+=maxl-height[l++];
           } else {
            water+=maxr-height[r--];
           }
        }

        return water;
    }
}

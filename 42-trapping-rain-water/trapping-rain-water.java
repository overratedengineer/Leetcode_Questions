import java.util.*;

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int water = 0;

        for (int i = 0; i < n; i++) {
            int h = height[i];
            while (!st.isEmpty() && h > height[st.peek()]) {
                int th = st.pop(); 
                int prev = th;
                if (!st.isEmpty()) {
                     prev = st.peek(); 
                }
                int width = i - prev - 1;
                int he = Math.min(height[prev], height[i]) - height[th];
                water += width * he;
            }
            st.push(i);
        }

        return water;
    }
}

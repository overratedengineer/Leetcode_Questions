class Solution {

    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int max =0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int val = arr[st.pop()];
                int w = !st.isEmpty()?i-st.peek()-1:i;
                max = Math.max(max,val*w);
            }
            st.push(i);
        }
         while (!st.isEmpty()) {
            int val = arr[st.pop()];
            int w = st.isEmpty() ? n : n - st.peek() - 1;
            max = Math.max(max, val * w);
        }
        return max;
    }
}
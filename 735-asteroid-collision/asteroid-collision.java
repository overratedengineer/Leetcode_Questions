class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            boolean destroyed = false;
            while (!st.isEmpty() && st.peek() > 0 && curr < 0) {
                if (st.peek() < -curr) {
                    st.pop();
                } else if (st.peek() == -curr) {
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                st.push(curr);
            }
        }

        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }
}
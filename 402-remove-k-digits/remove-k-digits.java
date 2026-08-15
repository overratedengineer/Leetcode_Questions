import java.util.*;

class Solution {
    public String removeKdigits(String s, int k) {
        Deque<Character> st = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (k > 0 && !st.isEmpty() && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        if (st.isEmpty()) return "0";
        StringBuilder sc = new StringBuilder();
        while (!st.isEmpty()) {
            sc.append(st.pop());
        }
        sc.reverse();
        int i = 0;
        while (i < sc.length() && sc.charAt(i) == '0') {
            i++;
        }
        sc.delete(0, i);
        if (sc.length() == 0) return "0";
        return sc.toString();
    }
}
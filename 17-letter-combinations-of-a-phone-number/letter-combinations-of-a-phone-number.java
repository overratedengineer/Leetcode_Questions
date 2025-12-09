import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        int arr[] = new int[n];
        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = digits.charAt(i) - '0';
        }

        StringBuilder sb = new StringBuilder();
        String chars[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String cs1 = chars[arr[0]];

        if (n > 1) {
            for (int i = 0; i < cs1.length(); i++) {
                sb.append(cs1.charAt(i));
                rec(arr, 1, sb, chars, s, n);
                sb.deleteCharAt(sb.length() - 1);
            }
        } else {
            for (int i = 0; i < cs1.length(); i++) {
                String m = cs1.charAt(i) + "";
                s.add(m);
            }
        }
        return s;
    }

    public void rec(int arr[], int i, StringBuilder sb, String[] chars, List<String> s, int n) {
        if (i == n) {
            String ans = sb.toString();
            s.add(ans);
            return;
        }

        String cs = chars[arr[i]];
        for (int j = 0; j < cs.length(); j++) {
            sb.append(cs.charAt(j));        // fixed: use cs, not s
            rec(arr, i + 1, sb, chars, s, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

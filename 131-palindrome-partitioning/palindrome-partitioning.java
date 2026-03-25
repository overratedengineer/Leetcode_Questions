import java.util.*;
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(0, s, list, ans);
        return ans;
    }
    public void solve(int idx, String s, List<String> list, List<List<String>> ans) {
        if (idx == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                list.add(s.substring(idx, i + 1));
                solve(i + 1, s, list, ans);
                list.remove(list.size() - 1); 
            }
        }
    }
    public boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
class Solution {
    public int minimumPushes(String s) {
       int[] freq = new int[26];
       for (char c : s.toCharArray()) {
       freq[c - 'a']++;
       }
       Arrays.sort(freq);
        int ans = 0;
        int mul = 1;
        int cnt = 0;
        for (int i = 25; i >= 0 && freq[i] > 0; i--) {
            if (cnt == 8) {
                cnt = 0;
                mul++;
            }
            ans += freq[i] * mul;
            cnt++;
        }
return ans;
    }
}
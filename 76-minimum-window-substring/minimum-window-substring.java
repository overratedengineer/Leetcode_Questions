class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (n > m) {
            return "";
        }

        // Step 1: Frequency map for t
        HashMap<Character, Integer> freqT = new HashMap<Character, Integer>();
        for (int i = 0; i < n; i = i + 1) {
            char c = t.charAt(i);
            if (freqT.containsKey(c)) {
                freqT.put(c, freqT.get(c) + 1);
            } else {
                freqT.put(c, 1);
            }
        }

        HashMap<Character, Integer> freqS = new HashMap<Character, Integer>();

        int required = freqT.size();
        int formed = 0;

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        for (int right = 0; right < m; right = right + 1) {
            char c = s.charAt(right);

            if (freqS.containsKey(c)) {
                freqS.put(c, freqS.get(c) + 1);
            } else {
                freqS.put(c, 1);
            }

            if (freqT.containsKey(c)) {
                if (freqS.get(c).intValue() == freqT.get(c).intValue()) {
                    formed = formed + 1;
                }
            }

            while (formed == required) {
                int windowLen = right - left + 1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    minStart = left;
                }

                // Shrink from left
                char l = s.charAt(left);
                freqS.put(l, freqS.get(l) - 1);

                if (freqT.containsKey(l)) {
                    if (freqS.get(l).intValue() < freqT.get(l).intValue()) {
                        formed = formed - 1;
                    }
                }

                left = left + 1;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minStart, minStart + minLen);
    }
}

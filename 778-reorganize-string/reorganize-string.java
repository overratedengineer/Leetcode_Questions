class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i = i + 1) {
            char c = s.charAt(i);
            freq[c - 'a'] = freq[c - 'a'] + 1;
        }

        int maxFreq = 0;
        for (int i = 0; i < 26; i = i + 1) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }
        if (maxFreq > (n + 1) / 2) {
            return "";
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[1] - a[1]
        );

        for (int i = 0; i < 26; i = i + 1) {
            if (freq[i] > 0) {
                pq.add(new int[]{i, freq[i]});
            }
        }
        StringBuilder sb = new StringBuilder();

        while (pq.size() > 1) {
            int[] first = pq.poll();
            int[] second = pq.poll();

            sb.append((char) (first[0] + 'a'));
            sb.append((char) (second[0] + 'a'));

            first[1] = first[1] - 1;
            second[1] = second[1] - 1;

            if (first[1] > 0) {
                pq.add(first);
            }
            if (second[1] > 0) {
                pq.add(second);
            }
        }

        if (pq.size() == 1) {
            int[] last = pq.poll();
            sb.append((char) (last[0] + 'a'));
        }

        return sb.toString();
    }
}

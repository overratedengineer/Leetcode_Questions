import java.util.*;
class Solution {
    public int minTaps(int n, int[] ranges) {
        List<int[]> intervals = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            int start = Math.max(0, i - ranges[i]);
            int end = Math.min(n, i + ranges[i]);
            intervals.add(new int[]{start, end});
        }
        intervals.sort((a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });
        int taps = 0;
        int currEnd = 0;
        int farthest = 0;
        int i = 0;
        while (currEnd < n) {
            while (i < intervals.size() && intervals.get(i)[0] <= currEnd) {
                farthest = Math.max(farthest, intervals.get(i)[1]);
                i++;
            }
            if (farthest == currEnd) {
                return -1;
            }
            taps++;
            currEnd = farthest;
        }
        return taps;
    }
}

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        int n = intervals.length;
        int count = 1;
        int endTime = intervals[0][1];
        for (int i = 1;i < n;i++)
        {
            if (endTime <= intervals[i][0])
            {
                count++;
                endTime = intervals[i][1];
            }
        }

        return n - count;
    }
}
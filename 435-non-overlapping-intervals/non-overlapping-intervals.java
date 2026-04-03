class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        PriorityQueue<int []> pq = new PriorityQueue<>(
           (a,b) -> a[1]-b[1]);
            for (int i = 0; i < intervals.length; i++) {
            pq.add(new int[]{intervals[i][0], intervals[i][1]}); 
        }
           int comp = Integer.MIN_VALUE;
           int count=0;
       while (!pq.isEmpty()) {
            int[] x = pq.poll();   
            if (x[0] >= comp) {     
                count++;
                comp = x[1];
            }
        }

        return intervals.length-count;
    }
}
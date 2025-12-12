import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        // if (stations != null && stations.length > 1) {
        //     Arrays.sort(stations, new Comparator<int[]>() {
        //         @Override
        //         public int compare(int[] a, int[] b) {
        //             return a[0] - b[0];
        //         }
        //     });
        // }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int idx = 0;
        int n = stations == null ? 0 : stations.length;
        int ans = 0;
        long fuel = startFuel;

        while (fuel < target) {
            while (idx < n && stations[idx][0] <= fuel) {
                pq.add(stations[idx][1]);
                idx++;
            }

            if (pq.isEmpty()) {
                return -1;
            }

            fuel += pq.poll();
            ans++;
        }

        return ans;
    }
}

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] freq = new int[n + 1];
        int bf = Integer.MAX_VALUE;
        for (int[] item : items) {
            int f = item[0];
            int c = item[1];
            freq[f]++;
            bf = Math.min(bf, c);
        }
        int[] freeCnt = new int[n + 1];
        for (int f = 1; f <= n; f++) {
            if (freq[f] == 0) continue;
            int free = freq[f] - 1;
            for (int mult = 2 * f; mult <= n; mult += f) {
                free += freq[mult];
            }
            freeCnt[f] = free;
        }
        HashMap<Integer, Long> costToFree = new HashMap<>();
        for (int[] item : items) {
            int f = item[0];
            int c = item[1];
            int free = freeCnt[f];
            if (free > 0) {
                costToFree.put(
                    c,
                    costToFree.getOrDefault(c, 0L) + free
                );
            }
        }
        PriorityQueue<long[]> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        for (var e : costToFree.entrySet()) {
            pq.add(new long[]{e.getKey(), e.getValue()});
        }
        long ans = 0;
        long remBudget = budget;
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long cost = cur[0];
            long cnt = cur[1];
            if (cost > 2L * bf) {
                break;
            }
            long take = Math.min(cnt, remBudget / cost);
            remBudget -= take * cost;
            ans += 2L * take;
        }
        ans += remBudget / bf;
        return (int) ans;
    }
}
class Solution {
    public boolean isNStraightHand(int[] arr, int k) {
        if (arr.length % k != 0) return false;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
        }
        while (!pq.isEmpty()) {
            int first = pq.peek();  
            for (int i = 0; i < k; i++) {
                if (!pq.remove(first + i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
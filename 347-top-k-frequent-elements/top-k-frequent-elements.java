class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for(int key : map.keySet()){
            pq.add(new int[]{key, map.get(key)});
            
            if(pq.size() > k){
                pq.remove();
            }
        }

        int[] ans = new int[k];
        int idx = 0;

        for(int[] e : pq){
            ans[idx++] = e[0];
        }

        return ans;
    }
}
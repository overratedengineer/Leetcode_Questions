class Solution {
    public int minimumPushes(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> {
            if (!e1.getValue().equals(e2.getValue()))
                return e2.getValue() - e1.getValue();
            return e1.getKey() - e2.getKey();
        });
        int count = 0;
        int mul = 1;
        int ans = 0;
        for (Map.Entry<Character, Integer> e : list) {
            if (count == 8) {
                count = 0;
                mul++;
            }
            count++;
            ans += e.getValue() * mul;
        }
        return ans;
    }
}
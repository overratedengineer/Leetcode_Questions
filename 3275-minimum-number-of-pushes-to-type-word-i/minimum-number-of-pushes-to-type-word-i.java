class Solution {
    public int minimumPushes(String s) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count =0;
        int ans=0;
        int mul=1;
        for(char c:map.keySet()){
            if(count==8){
                count=0;
                mul++;
            }
            count++;
             ans+=map.get(c)*mul;
        }
        return ans;
    }
}
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = fruits.length;
        int l=0;
        int max =0;
        for(int i=0;i<n;i++){
            int key = fruits[i];
           map.put(key,map.getOrDefault(key,0)+1);
            if(map.size()>2){
                  int v =map.get(fruits[l]);
                  if(v==1){
                    map.remove(fruits[l]);
                  } else {
                    map.put(fruits[l],v-1);
                  }
                  l++;
            }
            max = Math.max(max,i-l+1);
        }
        return max;
    }
}
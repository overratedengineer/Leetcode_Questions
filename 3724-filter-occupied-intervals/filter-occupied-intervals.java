class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] oi, int fs, int fe) {
       if(oi ==null || oi.length==0){
           return new ArrayList<>();
       }
        Arrays.sort(oi,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> m = new ArrayList<>();
        int curr[] =oi[0];
        for(int i=1;i<oi.length;i++){
            int nxt[] = oi[i];
            if(nxt[0]<=curr[1]+1) curr[1]=Math.max(curr[1],nxt[1]);
            else {m.add(curr); curr=nxt;}
        }
        m.add(curr);
      List<List<Integer>> res = new ArrayList<>();
        for(int[] x:m){
            int s = x[0];
            int e = x[1];
add(res,s,Math.min(e,fs-1));
            add(res,Math.max(s,fe+1),e);
        }
        return res;
    }
    public void add(List<List<Integer>> res ,int s,int e){
        if(s<=e){
                List<Integer> b = new ArrayList<>();
            b.add(s);
            b.add(e);
            res.add(b);
            }
    }
}
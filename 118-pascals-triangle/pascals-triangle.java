class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int n=1;n<=numRows;n++) {
            List<Integer> al = new ArrayList<>();
            double prev = 1;
            al.add(1);
            for (int i=1;i<=n-2;i++) {
                prev=prev*(n-i)/i;
                al.add((int)prev);
            }
            if (n>1)
                al.add(1);
            adj.add(al);
        }
        return adj;
    }
}
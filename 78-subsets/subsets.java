class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                   l.add(nums[j]);
                }
            }
            al.add(l);
        }
        return al;
    }
}
class Solution {
    public void fn(int[] arr, int i, List<List<Integer>> ans, List<Integer> ds) {
        
        ans.add(new ArrayList<>(ds));

        for (int j = i; j < arr.length; j++) {
            
            if (j!=i && arr[j]==arr[j-1]) continue;

            ds.add(arr[j]);
            fn(arr, j + 1, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        fn(nums, 0, ans, new ArrayList<>());
        return ans;
    }
}
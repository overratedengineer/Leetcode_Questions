class Solution {
    public void fn(int[] arr, int t ,int i,List<List<Integer>> ans , List<Integer> ds){
        if(t==0){
          ans.add(new ArrayList<>(ds));
          return;
        }
        if(i>=arr.length || t<0){
            return ;
        }
        //pick 
        ds.add(arr[i]);
        fn(arr,t-arr[i],i,ans,ds);
        ds.remove(ds.size() - 1);
        //not pick
        fn(arr,t,i+1,ans,ds);
    } 
    public List<List<Integer>> combinationSum(int[] arr, int t) {
     /// either pick or not if pick put the element in ds and decrease target and then move forward if not pick move index to +1 ;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
         fn(arr,t,0,ans,ds);
         return ans;
    }
}
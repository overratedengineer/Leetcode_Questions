class Solution {
    public int[][] insert(int[][] arr, int[] b) {
        int i=0;
        int n = arr.length;
       ArrayList<int []> ans = new ArrayList<>();
        while(i<n&&arr[i][1]<b[0]){
             ans.add(arr[i]);
             i++;
        }
        while(i<n&&arr[i][0]<=b[1]){
            b[0] = Math.min(arr[i][0],b[0]);
             b[1] = Math.max(arr[i][1],b[1]);
             i++;
        }
        ans.add(b);
        while(i<n){
            ans.add(arr[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
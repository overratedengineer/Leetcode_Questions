class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
       List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            if(i>0 && arr[i]==arr[i-1]) continue;
            while(j<k){
            int sum = arr[i]+arr[j]+arr[k];
            if(sum==0){
            List<Integer> al2 = new ArrayList<>();
            al2.add(arr[i]);
            al2.add(arr[j]);
            al2.add(arr[k]);
             al.add(al2);
            k--;
            j++;
            while(k>0&&arr[k]==arr[k+1]){
                k--;
            }
             while(j<n&&arr[j]==arr[j-1]){
                j++;
            }
            } else if(sum>0){
                k--;
                while(k>0 && arr[k]==arr[k+1]){
                k--;
            }
            }  else {
                j++;
                  while(j<n && arr[j]==arr[j-1]){
                j++;
            }
             if(k<=j) continue;
            }
        }
        }
        return al;
    }
}
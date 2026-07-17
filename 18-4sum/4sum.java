class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]){ continue;}
            for(int k=i+1;k<n;k++){
                 if(k>i+1 && arr[k]==arr[k-1]){ continue;}
               int x = k+1;
               int y= n-1;
               while(x<y){
                long sum = (long)arr[i]+arr[k]+arr[x]+arr[y];
                if(sum>target){
                    y--;
                } else
                if(sum<target){
                    x++;
                } else {
                    al.add(Arrays.asList(arr[i],arr[x], arr[y],arr[k]));
                    x++;
                    y--;
                    while(x<n-1 &&arr[x]==arr[x-1])x++;
                    while(y>0 && arr[y]==arr[y+1])y--;
                }
               }
            }
        }
        return al;
    }
}
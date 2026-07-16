class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        int c = 1;
        int e = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==e){
                c++;
            } else {
                c--;
            }
            if(c<0){
                e=arr[i];
                c++;
            }
        }
      return e;
    }
}
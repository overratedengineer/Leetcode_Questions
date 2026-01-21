class Solution {
    public int splitArray(int[] arr, int k) {
          int n = arr.length;
     int s =0;
     int e = 0;
     if(k>n){return -1;}
     for(int i :arr){
        if(i>s){
          s=i;
        }
       //  s = Math.max(s,i);
         e+=i;
     }
     while(s<=e){
         int mid = (e+s)/2;
        int students = 1;
         int pages = 0;

           for (int i = 0; i < n; i++) {
             if (pages+arr[i]<=mid) {
              pages+=arr[i];
              }else{
             students++;
             pages = arr[i];
             }
             }
            if(students>k){
                s=mid+1;
            } else{
                e=mid-1;
               
            } 
     }
     return s;
    }
}
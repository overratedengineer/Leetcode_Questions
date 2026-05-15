class Solution {
private static int ss[] = new int[1000001];
static{
    for(int i = 2; i*i <= 1000000; i++){
        if(ss[i] == 0){
            for(int j = i*i; j <= 1000000; j += i){
                if(ss[j] == 0){
                    ss[j] = i;
                }
            }
        }
    }
}

    public int minOperations(int[] arr) {
     int n = arr.length;        
       int count =0;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] > arr[i+1]){
                if(ss[arr[i]] == 0){
                    //System.out.println(-1);
                    return -1;
                }
                arr[i] = ss[arr[i]];
                count++;     
            }
            if(arr[i]>arr[i+1]){
            //   if(ss[arr[i]] == 0){
            //         //System.out.println(-1);
            //         return -1;
            //     }
            return -1;
            }
        }
        // for(int i: arr)System.out.println(i);
        return count;
}
}
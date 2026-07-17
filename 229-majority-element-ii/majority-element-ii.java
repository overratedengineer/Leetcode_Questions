class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        int e1 = -1;
        int c1 =0;
        int e2 = -1;
        int c2=0;
        for(int i=0;i<n;i++){
            if(c1==0 && arr[i]!=e2){
                e1=arr[i];
                c1=1;
                continue;
            } 
            if(arr[i]!=e1 && c2==0){
                e2=arr[i];
                c2=1;
                continue;
            } 
            if(arr[i]==e1){
                c1++;
            } else
            if(arr[i]==e2){
                c2++;
            } else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==e1) c1++;
           else if(arr[i]==e2) c2++;
        }
        if(c1>=(int)(n/3)+1) al.add(e1);
        if(c2>=(int)(n/3)+1) al.add(e2);

        return al;
    }
}
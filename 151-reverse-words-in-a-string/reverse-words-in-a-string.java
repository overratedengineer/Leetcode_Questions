class Solution {

    void reverse(char arr[],int l,int r){
      while(l<r){
        char temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
      }
    }
    public String reverseWords(String s) {
        int n = s.length();
        char arr[] = s.toCharArray();
        int idx=0;
         for (int i = 0; i < n; i++) {
            if (arr[i] != ' ') {
                if (idx != 0) arr[idx++] = ' ';
                while (i < n && arr[i] != ' ') {
                    arr[idx++] = arr[i++];
                }
            }
        }
        reverse(arr,0,idx-1);
          int start = 0;
        for (int i = 0; i <= idx; i++) {
             if(i == idx || arr[i] == ' ') {
                reverse(arr, start, i-1);
                start = i+1;
            }
        }
       return new String(arr, 0, idx);
    }
}
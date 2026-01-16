class Solution {
    public int reversePairs(int[] nums) {
         long[] count = new long[1];
        mergeSort(nums,0,nums.length-1,count);
        return (int)count[0];
    }
     static void mergeSort(int arr[],int s,int e,long[] count) {
        if (s>=e) return;

        int mid = s+(e-s)/2;
        mergeSort(arr,s, mid,count);
        mergeSort(arr, mid+1,e,count);
        merge(arr,s,mid,e,count);
    }

    static void merge(int arr[],int s,int mid,int e,long[] count) {
        int[] temp = new int[e-s+1];
        int i=s, j=mid+1, k=0;
          while (i<=mid && j<=e) {
            if (arr[i]>2L*arr[j]) {
                count[0]+=(mid-i+1); 
                j++;
            } else {
               i++;
            }
        }
        i=s;j=mid+1;k=0;
        while (i<=mid && j<=e) {
            if (arr[i]<=arr[j]) {
                temp[k++]=arr[i++];
            } else {
                temp[k++]=arr[j++];
            }
        }

        while (i<=mid) temp[k++]=arr[i++];
        while (j<=e) temp[k++]=arr[j++];

        for (int x=0;x<temp.length;x++) {
            arr[s+x]=temp[x];
        }
    }
}
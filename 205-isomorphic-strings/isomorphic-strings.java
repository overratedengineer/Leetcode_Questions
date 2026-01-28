class Solution {
    public boolean isIsomorphic(String s, String t) {
        int arr[] = new int[200];
        int arr2[] = new int[200];
        Arrays.fill(arr, -1);
        Arrays.fill(arr2, -1);

        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i) ;
            int l = t.charAt(i) ;

            if (arr[k] == -1 && arr2[l] == -1) {
                arr[k] = l;
                arr2[l] = k;
            } else {
                if (arr[k] != l || arr2[l] != k) {
                    return false;
                }
            }
        }
        return true;
    }
}

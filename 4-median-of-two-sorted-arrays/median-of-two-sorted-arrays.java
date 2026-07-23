class Solution {

    public double solve(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int t = (n + m + 1) / 2;

        int s = 0;
        int e = n;

        while (s <= e) {

            int mid = s + (e - s) / 2;
            int need = t - mid;

            int ls = Integer.MIN_VALUE;
            if (mid > 0)
                ls = arr1[mid - 1];

            int le = Integer.MAX_VALUE;
            if (mid < n)
                le = arr1[mid];

            int rs = Integer.MIN_VALUE;
            if (need > 0)
                rs = arr2[need - 1];

            int re = Integer.MAX_VALUE;
            if (need < m)
                re = arr2[need];

            if (ls <= re && rs <= le) {

                if ((n + m) % 2 == 0) {
                    return (Math.max(ls, rs) + Math.min(le, re)) / 2.0;
                }

                return Math.max(ls, rs);
            }
            if (ls > re) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return 0;
    }

    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return solve(arr2, arr1);
        }
        return solve(arr1, arr2);
    }
}
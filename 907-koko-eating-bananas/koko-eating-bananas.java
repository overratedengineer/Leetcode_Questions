class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int s = 1, e = 0;
        // this is clean code
        for (int x : arr) {
            e = Math.max(e, x);
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;
            long hours = 0;

            for (int x : arr) {
                hours += (x + mid - 1) / mid;
            }

            if (hours > h) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return s;
    }
}

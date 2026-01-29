class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;
        long ans = 0;

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // 2. Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // 3. Convert digits
        while (i < n) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') break;

            ans = ans * 10 + (c - '0');

            // 4. Overflow check
            if (sign == 1 && ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && -ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * ans);
    }
}

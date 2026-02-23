class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;
        while(a>=b){
            int shift = 0;
            while(a>=(b<<(shift+1))){
                shift++;
            }

            result+=(1<<shift);
            a-=(b<<shift);
        }

        return negative ? -result : result;
    }
}
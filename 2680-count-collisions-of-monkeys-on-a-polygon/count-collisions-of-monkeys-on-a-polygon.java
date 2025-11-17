class Solution {
    public int monkeyMove(int n) {
        long mod = 1_000_000_007L;
        long base = 2;
        long exp = n;
        long result = 1;

        
        while (exp > 0) {
            if ((exp & 1L) == 1L) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp = exp >> 1;
        }

       
        result = (result - 2 + mod) % mod;

        return (int) result;
    }
}

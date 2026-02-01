class Solution {
    static final long MOD = 1_000_000_007;
    public static long FindPow(long a, long b) {
        if (b == 0) return 1;
        if (b == 1) return a % MOD;

        if (b % 2 == 0) {
            long half = FindPow(a, b / 2);
            return (half * half) % MOD;
        } else {
            return (a % MOD * FindPow(a, b - 1)) % MOD;
        }
    }

    public long myPow(long x, long n) {
        return FindPow(x, n);
    }

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2; 
        long odd = n / 2;        

        return (int) ((myPow(5, even) * myPow(4, odd)) % MOD);
    }
}

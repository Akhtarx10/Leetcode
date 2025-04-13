class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; // even indices (0-based)
        long oddCount = n / 2;        // odd indices (0-based)

        long evenWays = powMod(5, evenCount);
        long oddWays = powMod(4, oddCount);

        return (int) ((evenWays * oddWays) % MOD);
    }

    private long powMod(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}

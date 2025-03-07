class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] ans = {-1, -1};
        int prevPrime = -1, minDiff = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                if (prevPrime != -1 && (i - prevPrime < minDiff)) {
                    minDiff = i - prevPrime;
                    ans[0] = prevPrime;
                    ans[1] = i;
                }
                prevPrime = i;
            }
        }
        return ans;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}

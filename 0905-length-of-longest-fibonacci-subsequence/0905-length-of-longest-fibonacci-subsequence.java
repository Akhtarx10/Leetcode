import java.util.HashMap;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int[][] dp = new int[n][n];
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int k = indexMap.getOrDefault(arr[i] - arr[j], -1);
                if (k >= 0 && k < j) {
                    dp[j][i] = dp[k][j] + 1;
                    maxLen = Math.max(maxLen, dp[j][i]);
                }
                dp[j][i] = Math.max(dp[j][i], 2);
            }
        }

        return (maxLen > 0) ? maxLen  : 0;
    }
}

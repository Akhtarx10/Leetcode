class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length(), n = str2.length();
        String lcs = findLCS(str1, str2, m, n);
        StringBuilder result = new StringBuilder();
        
        int i = 0, j = 0;
        for (char c : lcs.toCharArray()) {
            while (i < m && str1.charAt(i) != c) result.append(str1.charAt(i++));
            while (j < n && str2.charAt(j) != c) result.append(str2.charAt(j++));
            result.append(c);
            i++;
            j++;
        }
        
        result.append(str1.substring(i)).append(str2.substring(j));
        return result.toString();
    }

    private String findLCS(String s1, String s2, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        
        return lcs.reverse().toString();
    }
}

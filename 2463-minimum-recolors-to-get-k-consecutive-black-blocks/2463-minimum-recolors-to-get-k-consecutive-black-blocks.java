class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minCount = Integer.MAX_VALUE;
        int n = blocks.length();

        for (int i = 0; i <= n - k; i++) {
            int currCount = 0;
            for (int j = 0; j < k; j++) {
                if (blocks.charAt(i + j) == 'W') {
                    currCount++;
                }
            }
            minCount = Math.min(currCount, minCount);
        }

        return minCount;
    }
}
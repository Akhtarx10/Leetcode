class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxSum = Integer.MIN_VALUE;
        int maxPrev = values[0];

        for(int i=1;i<values.length;i++){
            maxSum = Math.max(maxSum, maxPrev + values[i] - i);
            maxPrev = Math.max(maxPrev, values[i] + i);
        }
        return maxSum;
    }
}
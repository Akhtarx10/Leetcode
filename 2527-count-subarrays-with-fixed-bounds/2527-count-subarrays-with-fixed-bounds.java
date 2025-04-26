class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long totalCount = 0;
        int lastMinIndex = -1;
        int lastMaxIndex = -1;
        int lastInvalidIndex = -1;
        for (int currentIndex = 0; currentIndex < nums.length; ++currentIndex) {
            if (nums[currentIndex] < minK || nums[currentIndex] > maxK) {
                lastInvalidIndex = currentIndex;
            }
            if (nums[currentIndex] == minK) {
                lastMinIndex = currentIndex;
            }
            if (nums[currentIndex] == maxK) {
                lastMaxIndex = currentIndex;
            }
            totalCount += Math.max(0, Math.min(lastMinIndex, lastMaxIndex) - lastInvalidIndex);
        }
        return totalCount;
    }
}

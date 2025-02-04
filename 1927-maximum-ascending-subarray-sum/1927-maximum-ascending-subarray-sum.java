class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currMax = nums[0]; // Start with the first element
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                currMax += nums[i];
            } else {
                max = Math.max(max, currMax);
                currMax = nums[i]; // Start a new subsequence
            }
        }
        max = Math.max(max, currMax); // Final comparison to update max
        return max;
    }
}
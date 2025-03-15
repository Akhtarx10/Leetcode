class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 0;
        int right = (int) 1e9;

        while (left < right) {
            int mid = (left + right) >> 1;
            if (calculatePartitionCount(nums, mid) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int calculatePartitionCount(int[] nums, int x) {
        int count = 0;
        int lastPartitionIndex = -2;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > x || i == lastPartitionIndex + 1) {
                continue;
            }
            ++count;
            lastPartitionIndex = i;
        }
        return count;
    }
}

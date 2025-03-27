class Solution {
    public int minimumIndex(List<Integer> nums) {
        int dominant = dominant(nums);
        int totalFreq = 0;
        for (int num : nums) {
            if (num == dominant) {
                totalFreq++;
            }
        }

        int leftFreq = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == dominant) {
                leftFreq++;
            }
            int leftSize = i + 1;
            int rightSize = nums.size() - leftSize;

            if (leftFreq > leftSize / 2 && (totalFreq - leftFreq) > rightSize / 2) {
                return i;
            }
        }
        return -1;
    }

    private int dominant(List<Integer> nums) {
        int majority = nums.get(0);
        int vote = 0;

        for (int num : nums) {
            if (vote == 0) {
                majority = num;
            }
            vote += (num == majority) ? 1 : -1;
        }

        return majority;
    }
}

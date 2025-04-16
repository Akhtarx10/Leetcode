class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        int left = 0;
        long pairs = 0, res = 0;

        for (int right = 0; right < n; right++) {
            int val = nums[right];
            pairs += freq.getOrDefault(val, 0);
            freq.put(val, freq.getOrDefault(val, 0) + 1);

            while (pairs >= k) {
                res += n - right;
                int leftVal = nums[left];
                freq.put(leftVal, freq.get(leftVal) - 1);
                pairs -= freq.get(leftVal);
                left++;
            }
        }

        return res;
    }
}

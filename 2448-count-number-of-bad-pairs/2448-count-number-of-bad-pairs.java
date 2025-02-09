class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = (long) n * (n - 1) / 2;
        HashMap<Integer, Long> freq = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < n; i++) {
            int key = nums[i] - i;
            goodPairs += freq.getOrDefault(key, 0L);
            freq.put(key, freq.getOrDefault(key, 0L) + 1);
        }

        return totalPairs - goodPairs;
    }
}
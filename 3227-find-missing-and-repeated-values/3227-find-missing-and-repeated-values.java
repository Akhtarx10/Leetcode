class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] nums = new int[n * n];
        int index = 0;
        
        for (int[] row : grid) {
            for (int num : row) {
                nums[index++] = num;
            }
        }
        
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        int repeated = -1, missing = -1;
        for (int i = 1; i <= n * n; i++) {
            if (count.getOrDefault(i, 0) == 2) {
                repeated = i;
            } else if (!count.containsKey(i)) {
                missing = i;
            }
        }
        
        return new int[]{repeated, missing};
    }
}
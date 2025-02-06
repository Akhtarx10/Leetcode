class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length, count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        for (int freq : productCount.values()) {
            if (freq > 1) {
                count += (freq * (freq - 1) / 2) * 8;
            }
        }

        return count;
    }
}







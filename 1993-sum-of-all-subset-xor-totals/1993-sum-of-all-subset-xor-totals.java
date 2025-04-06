class Solution {
    int ans = 0;

    public int subsetXORSum(int[] nums) {
        if (nums.length == 1)
            ans = nums[0];
        else {
            xor(0, nums, 0, nums.length - 1);
        }
        return ans;
    }

    private void xor(int X, int[] nums, int i, int j) {
        if (i > j)
            return;

        ans += X ^ nums[i];
        xor(X ^ nums[i], nums, i + 1, j);
        xor(X, nums, i + 1, j);
    }
}
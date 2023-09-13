class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int n = nums.size();
        if (n < 3) {
            // Handle the case when there are less than 3 elements in nums.
            // You may return an error code or handle it as per your requirements.
            return 0; // Assuming 0 as the error code.
        }

        sort(nums.begin(), nums.end());

        // Calculate two possible products:
        // 1. Product of the three largest numbers.
        // 2. Product of the two smallest numbers (negative) and the largest number.
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum of the two products.
        return max(product1, product2);
    }
};

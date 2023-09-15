class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n); // Initialize ans with the same size as nums
        int evenIdx = 0;
        int oddIdx = n - 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                ans[evenIdx] = nums[i];
                evenIdx++;
            } else {
                ans[oddIdx] = nums[i];
                oddIdx--;
            }
        }
        return ans;
    }
};

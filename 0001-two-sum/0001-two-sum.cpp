class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> ans;
        for(int i=0;i<nums.size();i++){
            int x=target-nums[i];
              if (ans.find(x) != ans.end()) {
                return {ans[x], i};
            }
            ans[nums[i]] = i;
        }
        return {};
    }
};
class Solution {
    vector<vector<int>> ans;
    void dfs(int start,int size,vector<int>& nums){
        if(start>=size){
            ans.push_back(nums);
            return;
        }
        else{
            for(int i=start;i<size;++i){
                swap(nums[start],nums[i]);
                dfs(start+1,size,nums);
                swap(nums[start],nums[i]);
            }
        }
    }
public:
    vector<vector<int>> permute(vector<int>& nums) {
        dfs(0,nums.size(),nums);
        return ans;
    }
};
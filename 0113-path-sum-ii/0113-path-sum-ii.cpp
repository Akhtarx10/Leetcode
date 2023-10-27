/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> pathSum(TreeNode* root, int sum) {
        vector<vector<int>> result;
        vector<int> path;
        dfs(root, sum, path, result);
        return result;
    }

private:
    void dfs(TreeNode* root, int sum, vector<int>& path, vector<vector<int>>& result) {
        if (root == nullptr)
            return;

        path.push_back(root->val);

        if (root->left == nullptr && root->right == nullptr && root->val == sum) {
            result.push_back(path);
        } else {
            dfs(root->left, sum - root->val, path, result);
            dfs(root->right, sum - root->val, path, result);
        }

        path.pop_back();
    }
};

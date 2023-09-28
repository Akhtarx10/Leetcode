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
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        vector<vector<int>> result;
        levelOrderBottomHelper(root, result, 0);
        reverse(result.begin(), result.end());
        return result;
    }

    void levelOrderBottomHelper(TreeNode* root, vector<vector<int>>& result, int level) {
        if (root == nullptr)
            return;

        if (level == result.size()) {
            result.push_back({});
        }

        result[level].push_back(root->val);

        levelOrderBottomHelper(root->left, result, level + 1);
        levelOrderBottomHelper(root->right, result, level + 1);
    }
};

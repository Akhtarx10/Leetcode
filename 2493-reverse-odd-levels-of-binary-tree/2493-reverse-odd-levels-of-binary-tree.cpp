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
  TreeNode* reverseOddLevels(TreeNode* root) {
    queue<TreeNode*> q;
    q.push(root);
    bool isOddLevel = false;

    while (!q.empty()) {
      int size = q.size();
      vector<TreeNode*> levelNodes;

      for (int i = 0; i < size; ++i) {
        TreeNode* node = q.front();
        q.pop();
        levelNodes.push_back(node);

        if (node->left) q.push(node->left);
        if (node->right) q.push(node->right);
      }

      if (isOddLevel) {
        int n = levelNodes.size();
        for (int i = 0; i < n / 2; ++i) {
          swap(levelNodes[i]->val, levelNodes[n - 1 - i]->val);
        }
      }

      isOddLevel = !isOddLevel;
    }

    return root;
  }
};

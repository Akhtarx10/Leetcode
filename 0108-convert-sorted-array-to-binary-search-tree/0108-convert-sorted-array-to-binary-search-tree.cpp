class Solution {
public:
    TreeNode* sortedArrayToBST(const vector<int>& nums) {
        // Check if the vector is empty, return nullptr for an empty tree.
        if (nums.empty()) {
            return nullptr;
        }

        // Find the middle element of the vector.
        int mid = nums.size() / 2;

        // Create a new TreeNode with the middle element as the root.
        TreeNode* root = new TreeNode(nums[mid]);

        // Recursively construct the left and right subtrees.
        // Note: Pass the appropriate subvector to each recursive call.
        root->left = sortedArrayToBST(vector<int>(nums.begin(), nums.begin() + mid));
        root->right = sortedArrayToBST(vector<int>(nums.begin() + mid + 1, nums.end()));

        return root;
    }
};

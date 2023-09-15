class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> ans(n + 1, 0);  // Initialize the answer vector with size n+1
        
        for (int i = 1; i <= n; i++) {
            // To count the set bits in 'i', you can use ans[i/2] (right-shifted by 1) and add 1 if 'i' is odd.
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;
    }
};

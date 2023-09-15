class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> result;

        for (int i = 0; i < nums1.size(); i++) {
            bool found = false;
            
            for (int j = 0; j < result.size(); j++) {
                if (nums1[i] == result[j]) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                for (int j = 0; j < nums2.size(); j++) {
                    if (nums1[i] == nums2[j]) {
                        result.push_back(nums1[i]);
                        break;
                    }
                }
            }
        }
        
        return result;
    }
};

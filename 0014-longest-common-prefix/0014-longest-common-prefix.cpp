class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
         sort(strs.begin(), strs.end());
    string firstStr = strs[0];
    string lastStr = strs[strs.size() - 1];

    string prefix = "";
    
    // Compare the characters of the first and last strings.
    for (int i = 0; i < firstStr.length(); ++i) {
        if (i < lastStr.length() && firstStr[i] == lastStr[i]) {
            prefix += firstStr[i];
        } else {
            break;
        }
    }

    return prefix;
    }
};
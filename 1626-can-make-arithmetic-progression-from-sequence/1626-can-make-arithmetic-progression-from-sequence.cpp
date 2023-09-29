class Solution {
public:
    bool canMakeArithmeticProgression(vector<int>& arr) {
        if (arr.size() < 3) {
            return true;  // Any 2 or fewer elements are always in an arithmetic progression.
        }

        // Sort the input vector.
        sort(arr.begin(), arr.end());

        // Calculate the common difference.
        int commonDiff = arr[1] - arr[0];

        // Check if all differences are the same.
        for (int i = 2; i < arr.size(); i++) {
            if (arr[i] - arr[i - 1] != commonDiff) {
                return false;
            }
        }

        return true;
    }
};

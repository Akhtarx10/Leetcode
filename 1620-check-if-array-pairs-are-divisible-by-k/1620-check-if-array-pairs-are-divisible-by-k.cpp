class Solution {
public:
    bool canArrange(vector<int>& arr, int k) {
        map<int, int> modFrequency;
        for (int i = 0; i < arr.size(); ++i)
        {
            int num = arr[i] % k;
            if (num < 0)
                num += k;
            modFrequency[num]++;
        }
        if (modFrequency[0] % 2 != 0)
            return false;
        for (int i = 1; i <= k / 2; i++)
        {
            if (modFrequency[i] != modFrequency[k - i])
                return false;
        }
        return true;
    }
};
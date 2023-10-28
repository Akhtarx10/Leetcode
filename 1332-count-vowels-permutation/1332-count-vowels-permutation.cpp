class Solution {
public:
    int countVowelPermutation(int n) {
        int kMod = 1000000007;
        unordered_map<char, long long> dp = {{'a', 1}, {'e', 1}, {'i', 1}, {'o', 1}, {'u', 1}};

        for (int i = 0; i < n - 1; i++) {
            unordered_map<char, long long> newDp = {
                {'a', (dp['e'] + dp['i'] + dp['u']) % kMod},
                {'e', (dp['a'] + dp['i']) % kMod},
                {'i', (dp['e'] + dp['o']) % kMod},
                {'o', dp['i'] % kMod},
                {'u', (dp['i'] + dp['o']) % kMod}
            };
            dp = newDp;
        }

        long long sum = 0;
        for (auto const &pair : dp) {
            sum = (sum + pair.second) % kMod;
        }
        return sum;
    }
};
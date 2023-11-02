class Solution {
public:
    string multiply(string num1, string num2) {
        const int len1 = num1.size();
        const int len2 = num2.size();
        std::string result(len1 + len2, '0');

        for (int i = len1 - 1; i >= 0; --i) {
            for (int j = len2 - 1; j >= 0; --j) {
                int product = (num1[i] - '0') * (num2[j] - '0') + (result[i + j + 1] - '0');
                result[i + j] += product / 10;
                result[i + j + 1] = '0' + product % 10;
            }
        }

        size_t start_pos = result.find_first_not_of('0');
        if (start_pos == std::string::npos) return "0";
        return result.substr(start_pos);
    }
};

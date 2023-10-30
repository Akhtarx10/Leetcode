
class Solution {
public:
    int countSetBits(int n) {
        int count = 0;
        while (n) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    bool compareBits(int a, int b) {
        int countA = countSetBits(a);
        int countB = countSetBits(b);
        if (countA == countB) {
            return a < b;
        }
        return countA < countB;
    }

    vector<int> sortByBits(vector<int>& arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (compareBits(arr[j], arr[i])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
};

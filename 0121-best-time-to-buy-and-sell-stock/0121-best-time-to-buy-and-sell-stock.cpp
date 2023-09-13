class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int lowest = INT_MAX; // Initialize with a high value
        int day = 0; // Initialize with the first day index
        int maxProfit = 0;

        for (int i = 0; i < prices.size(); i++) {
            if (prices[i] < lowest) {
                lowest = prices[i];
                day = i;
            } else if (prices[i] - lowest > maxProfit) {
                maxProfit = prices[i] - lowest;
            }
        }

        return maxProfit;
    }
};

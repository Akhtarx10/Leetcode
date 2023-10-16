class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> row(rowIndex + 1, 0); // Initialize the row with zeros
        
        row[0] = 1; // The first element is always 1
        
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                // Update each element by adding the value from the previous row
                row[j] += row[j - 1];
            }
        }
        
        return row;
    }
};

class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& coordinates) {
        int n = coordinates.size();
        if (n <= 2) {
            return true; // Any two points or fewer are always on a straight line.
        }

        for (int i = 2; i < n; i++) {
            int x0 = coordinates[i - 2][0], y0 = coordinates[i - 2][1];
            int x1 = coordinates[i - 1][0], y1 = coordinates[i - 1][1];
            int x2 = coordinates[i][0], y2 = coordinates[i][1];
            
            // Check if the points are collinear.
            if ((y1 - y0) * (x2 - x1) != (y2 - y1) * (x1 - x0)) {
                return false;
            }
        }
        return true;
    }
};

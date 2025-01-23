class Solution {
    public int countServers(int[][] grid) {
        int numRows = grid.length, numCols = grid[0].length, connectedServers = 0;
        int[] rowCount = new int[numRows], colCount = new int[numCols];
        for (int i = 0; i < numRows; ++i)
            for (int j = 0; j < numCols; ++j)
                if (grid[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
        for (int i = 0; i < numRows; ++i)
            for (int j = 0; j < numCols; ++j)
                if (grid[i][j] == 1 && (rowCount[i] > 1 || colCount[j] > 1))
                    connectedServers++;
        return connectedServers;
    }
}

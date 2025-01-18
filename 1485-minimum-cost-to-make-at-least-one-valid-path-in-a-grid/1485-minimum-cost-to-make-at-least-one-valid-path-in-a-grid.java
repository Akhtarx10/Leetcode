class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dist = new int[m][n];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{0, 0, 0});
        dist[0][0] = 0;

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!deque.isEmpty()) {
            int[] curr = deque.poll();
            int x = curr[0], y = curr[1], cost = curr[2];

            for (int d = 0; d < 4; d++) {
                int nx = x + directions[d][0], ny = y + directions[d][1];
                int newCost = cost + (grid[x][y] == d + 1 ? 0 : 1);

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && newCost < dist[nx][ny]) {
                    dist[nx][ny] = newCost;
                    if (grid[x][y] == d + 1) deque.offerFirst(new int[]{nx, ny, newCost});
                    else deque.offerLast(new int[]{nx, ny, newCost});
                }
            }
        }
        return dist[m - 1][n - 1];
    }
}

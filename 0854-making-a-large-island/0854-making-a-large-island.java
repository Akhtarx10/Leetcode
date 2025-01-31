import java.util.*;

public class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        int index = 2;
        Map<Integer, Integer> islandSizes = new HashMap<>();
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // DFS to find island sizes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    islandSizes.put(index, dfs(grid, i, j, index, n, directions));
                    index++;
                }
            }
        }

        int maxArea = islandSizes.values().stream().max(Integer::compare).orElse(0);

        // Try converting each 0 to 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> seen = new HashSet<>();
                    int newArea = 1;
                    for (int[] dir : directions) {
                        int ni = i + dir[0], nj = j + dir[1];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n && grid[ni][nj] > 1) {
                            int idx = grid[ni][nj];
                            if (seen.add(idx)) {
                                newArea += islandSizes.get(idx);
                            }
                        }
                    }
                    maxArea = Math.max(maxArea, newArea);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j, int index, int n, int[][] directions) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        grid[i][j] = index;
        int size = 0;

        while (!stack.isEmpty()) {
            int[] cell = stack.pop();
            size++;
            for (int[] dir : directions) {
                int ni = cell[0] + dir[0], nj = cell[1] + dir[1];
                if (ni >= 0 && ni < n && nj >= 0 && nj < n && grid[ni][nj] == 1) {
                    grid[ni][nj] = index;
                    stack.push(new int[]{ni, nj});
                }
            }
        }
        return size;
    }
}

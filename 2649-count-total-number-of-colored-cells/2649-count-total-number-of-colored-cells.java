class Solution {
    public long coloredCells(int n) {
        long ans = (long) ((2 * Math.pow(n, 2)) - (2 * n) + 1);

        return ans;
    }
}
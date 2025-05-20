class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        
        for (int[] q : queries) {
            int l = q[0], r = q[q.length - 1];
            diff[l] -= 1;
            if (r + 1 < n) diff[r + 1] += 1;
        }

        int delta = 0;
        for (int i = 0; i < n; i++) {
            delta += diff[i];
            nums[i] += delta;
            if (nums[i] > 0) return false;
        }

        return true;
    }
}

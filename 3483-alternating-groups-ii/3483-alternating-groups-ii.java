class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int valid = 1;

        for (int i = 1; i < k; i++) {
            if (colors[i] == colors[i - 1]) {
                valid = 0;
                break;
            }
        }
        count += valid;

        for (int i = 1; i < n; i++) {
            if (colors[(i + k - 1) % n] == colors[(i + k - 2) % n]) {
                valid = 0;
            }
            if (colors[i] == colors[(i - 1 + n) % n]) {
                valid = 1;
                for (int j = i; j < i + k - 1; j++) {
                    if (colors[j % n] == colors[(j + 1) % n]) {
                        valid = 0;
                        break;
                    }
                }
            }
            count += valid;
        }
        
        return count;
    }
}

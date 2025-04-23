class Solution {
    public int countLargestGroup(int n) {
        int[] size = new int[37];
        for (int i = 1; i <= n; i++) {
            int pos = digitSum(i);
            size[pos]++;
        }
        int max = 0;
        for (int i = 0; i < 37; i++) {
            if (size[i] > max) {
                max = size[i];
            }
        }
        int count = 0;
        for (int i = 0; i < 37; i++) {
            if (size[i] == max) {
                count++;
            }
        }
        return count;
    }

    int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

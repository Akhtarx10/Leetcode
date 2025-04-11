class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int i = low; i <= high; i++) {
            int count = digitCount(i);
            if (count % 2 == 0) {
                int leftSum = digitSum(i, 0, count / 2 - 1);
                int rightSum = digitSum(i, count / 2, count - 1);
                if (leftSum == rightSum) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private int digitCount(int n) {
        return String.valueOf(n).length();
    }

    private int digitSum(int num, int start, int end) {
        String s = String.valueOf(num);
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
}

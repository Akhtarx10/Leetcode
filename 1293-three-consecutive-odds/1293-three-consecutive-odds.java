class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean ans = false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (isOdd(arr[i]) && isOdd(arr[i + 1]) && isOdd(arr[i + 2])) {
                return true;
            }
        }
        return false;
    }
    private boolean isOdd(int x){
        return ((x&1) == 1);
    }
}
class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        build(arr, nums, 0, nums.length);
        return arr;
    }
    private void build(int[] arr, int[] nums, int i, int n) {
        if(i == n) return;
        arr[i] = nums[nums[i]];
        build(arr, nums, i+1, n);
    } 
}
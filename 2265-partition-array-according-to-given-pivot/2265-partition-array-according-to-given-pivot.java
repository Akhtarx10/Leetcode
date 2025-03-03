class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         int[] ans = new int[nums.length];
        int left = 0, right = nums.length - 1, mid = 0;

        for (int num : nums) {
            if (num < pivot) {
                left++;
            } else if (num == pivot) {
                mid++;
            }
        }

        int l = 0, m = left, r = left + mid;

        for (int num : nums) {
            if (num < pivot) {
                ans[l++] = num;
            } else if (num == pivot) {
                ans[m++] = num;
            } else {
                ans[r++] = num;
            }
        }

        return ans;
    }
    public int findPivotPosition(int[] nums,int pivot,int k){
        int i=0;
        while(i<nums.length){
            if(nums[i]<pivot){
                k++;
            }
            i++;
        }

        return k;
    }
}
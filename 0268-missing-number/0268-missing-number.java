class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i< nums.length){
            int cpos = nums[i];
            if(nums[i] <nums.length && nums[i] != nums[cpos]){
                swap(nums,i,cpos);
            }else{
                i++;
            }
        }
        for(int idx=0;idx<nums.length;idx++){
            if(nums[idx] != idx){
                return idx;
            }
        }
        return nums.length;
    }
    void swap(int[] nums,int n1,int n2){
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
}
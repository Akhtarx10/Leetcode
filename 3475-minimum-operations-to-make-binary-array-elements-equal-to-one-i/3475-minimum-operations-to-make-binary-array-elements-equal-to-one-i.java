class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                operation(nums,i,i+2);
                count++;
            }
        }
        if(checkAllOne(nums)){
            return count;
        }

        return -1;

    }

    private void operation(int[] nums, int i , int j ){
        if(j >= nums.length){
            return;
        }
        while(i <= j){
            if(nums[i]==0){
                nums[i] = 1;
            }else{
                nums[i] = 0;
            }
            i++;
        }
    }

    private boolean checkAllOne(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i < nums.length){
            int cpos = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[cpos]){
                swap(nums,i,cpos);
            }else{
                i++;
            }
        }
       
       
       for(int j=0;j<nums.length;j++){
           if(nums[j] != j+1){
               return j+1;
           }
       }
       return nums.length+1;
    }
    void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}
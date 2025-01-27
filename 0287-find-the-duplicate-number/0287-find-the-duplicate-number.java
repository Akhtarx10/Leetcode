class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int cpos = nums[i]-1;
            if(nums[i] != i+1){
                if(nums[i] != nums[cpos]){
                swap(nums,i,cpos);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        
        // for(int idx =0;idx<nums.length;idx++){
        //     if(nums[idx] != idx+1){
        //         return nums[idx];
        //     }
        // }
      return -1;  
    }
    void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}
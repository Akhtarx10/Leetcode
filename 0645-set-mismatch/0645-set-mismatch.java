class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i < nums.length){
            int cpos = nums[i]-1;
            if(nums[i] != nums[cpos]){
                swap(nums,i,cpos);
            }else{
                i++;
            }
        }
        
      int[] ans = new int[2];
       for(int j=0;j<nums.length;j++){
           if(nums[j] != j+1){
               ans[0]=nums[j];
               ans[1]=j+1;
           }
       }
       return ans;
    }
    void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}
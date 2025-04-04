class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i < nums.length){
            int cpos = nums[i]-1;
            if(nums[i] != nums[cpos]){
                swap(nums,i,cpos);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                ans.add(nums[j]);
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
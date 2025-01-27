class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int cpos = nums[i]-1;
            if(nums[i] != nums[cpos]){
                swap(nums,i,cpos);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int idx =0;idx<nums.length;idx++){
            if(nums[idx] != idx+1){
                ans.add(idx+1);
            }
        }
        return ans;
    }
    void swap(int[] nums,int n1,int n2){
        int temp =nums[n1];
        nums[n1] =nums[n2];
        nums[n2]=temp;
    }
}
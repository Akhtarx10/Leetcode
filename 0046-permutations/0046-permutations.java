class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0,nums,ans);
        return ans;
    }
    private void recurPermute(int idx, int[] nums, List<List<Integer>> ans){
        if(idx == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int num : nums){
                ds.add(num);
            }
            ans.add(ds);
            return;
        }

        for(int i=idx; i<nums.length; i++){
            swap(i,idx,nums);
            recurPermute(idx+1,nums,ans);
            swap(i,idx,nums);
        }
    }
    private void swap(int i,int idx,int[] nums){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
}
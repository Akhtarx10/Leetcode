class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        recurPermute(nums,ds,map,ans);
        return ans;
    }
    private void recurPermute(int[] nums,List<Integer> ds,boolean[] map,List<List<Integer>> ans){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!map[i]){
                map[i]=true;
                ds.add(nums[i]);
                recurPermute(nums,ds,map,ans);
                ds.remove(ds.size()-1);
                map[i]=false;
            }
        }
    }
}
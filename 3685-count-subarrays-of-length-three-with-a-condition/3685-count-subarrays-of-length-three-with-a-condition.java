class Solution {
    public int countSubarrays(int[] nums) {
        int i=0;
        int j=1;
        int count =0;
        for(int k=2;k<nums.length;k++){
            float x = nums[i];
            float y = nums[j];
            float z = nums[k];

            if((y/2) == x+z){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}
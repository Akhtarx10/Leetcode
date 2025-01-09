class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] arr : accounts){
            int currSum =0;
            for(int num : arr){
                currSum +=num;
            }
            max = Math.max(currSum,max);
        }
        return max;
    }
}
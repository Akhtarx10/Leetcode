class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int val : nums){
            if(even(val)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int n){
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }
        if(count%2 == 0){
            return true;
        }
        return false;
    }
}
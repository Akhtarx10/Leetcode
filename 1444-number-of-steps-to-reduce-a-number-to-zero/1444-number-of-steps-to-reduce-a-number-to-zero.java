class Solution {
    int count=0;
    public int numberOfSteps(int num) {
        if(num==0){
            return 0;
        }
        if(num%2==0){
            count+=1;
            numberOfSteps(num/2);
        }else{
            count+=1;
            numberOfSteps(num-1);
        }


        return count;
    }
}
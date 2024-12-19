class Solution {
public:
    int maxChunksToSorted(vector<int>& arr) {
        int count =0;
        int runningSum=0;
        for(int i=0;i<arr.size();i++){
            int sum = i*(i+1)/2;
            runningSum +=arr[i];
            if(runningSum == sum){
                count++;
            }
        }
        return count;
    }
};
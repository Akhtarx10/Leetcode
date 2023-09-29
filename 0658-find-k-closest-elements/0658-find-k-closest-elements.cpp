class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        //used binary ser=arch approch;
        int low=0;
        int high=arr.size()-k;
        while(low < high){
            int mid = low + (high-low)/2;
            // If the mid element is closer to x, move the 'high' pointer to the left
            if(x-arr[mid]<=arr[mid+k]-x){
                high = mid;
            }
            // Otherwise, move the 'low' pointer to the right
            else{
                
                low = mid+1;
            }
        }
         // Create a vector to store the k closest elements
        vector<int> ans(arr.begin() + low, arr.begin() + low + k); 
        return ans;
    }
};

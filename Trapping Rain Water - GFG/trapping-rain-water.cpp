//{ Driver Code Starts
#include<bits/stdc++.h>

using namespace std;


// } Driver Code Ends
class Solution{

    // Function to find the trapped water between the blocks.
    public:
    long long trappingWater(int arr[], int n) {
        if (n <= 2) {
        return 0; // There can be no water trapped with less than 3 blocks.
        }

        long long trappedWater = 0;
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;

        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] > leftMax) {
                leftMax = arr[left];
            } else {
                trappedWater += leftMax - arr[left];
            }
            left++;
            }else {
            if (arr[right] > rightMax) {
                rightMax = arr[right];
            } else {
                trappedWater += rightMax - arr[right];
            }
            right--;
           }

    }

    return trappedWater;
}

};

//{ Driver Code Starts.

int main(){
    
    int t;
    //testcases
    cin >> t;
    
    while(t--){
        int n;
        
        //size of array
        cin >> n;
        
        int a[n];
        
        //adding elements to the array
        for(int i =0;i<n;i++){
            cin >> a[i];            
        }
        Solution obj;
        //calling trappingWater() function
        cout << obj.trappingWater(a, n) << endl;
        
    }
    
    return 0;
}
// } Driver Code Ends
//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
    //Function to find the next greater element for each element of the array.
    vector<long long> nextLargerElement(vector<long long> arr, int n){
        // Your code here
       std::vector<long long> result(n, -1); // Initialize the result array with -1
        std::vector<int> pendingIndices; // Keep track of indices for which we haven't found the next larger element

        for (int i = 0; i < n; i++) {
            // Check if there are pending indices and the current element is greater
            while (!pendingIndices.empty() && arr[i] > arr[pendingIndices.back()]) {
                int prev_index = pendingIndices.back(); // Get the index of the previous element
                pendingIndices.pop_back();
                result[prev_index] = arr[i]; // Update the result for the previous element
            }
            pendingIndices.push_back(i); 
        }

        return result;
    }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        
        int n;
        cin>>n;
        vector<long long> arr(n);
        for(int i=0;i<n;i++)
            cin>>arr[i];
        
        Solution obj;
        vector <long long> res = obj.nextLargerElement(arr, n);
        for (long long i : res) cout << i << " ";
        cout<<endl;
    }
	return 0;
}
// } Driver Code Ends
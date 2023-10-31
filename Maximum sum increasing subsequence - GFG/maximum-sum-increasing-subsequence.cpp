//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
		

	public:
	int maxSumIS(int arr[], int n)  
	{  
	    // Your code goes here
	    int maxsum[n]; 
 
        for ( int i = 0; i < n; i++ )  {
            maxsum[i] = arr[i];
        }
            
        for ( int i = 1; i < n; i++ )  {
            for (int j = 0; j < i; j++ ){
                if (arr[i] > arr[j] &&  
                    maxsum[i] < maxsum[j] + arr[i]) {
                        maxsum[i] = maxsum[j] + arr[i]; 
                    } 
                     
            } 
                
        }
        
        int max=0;
            
        for (int i = 0; i < n; i++ ) {
            if ( max <maxsum[i] )  
                max = maxsum[i]; 
        } 
        return max;  
	}  
};

//{ Driver Code Starts.
int main() 
{
   	
   
   	int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;

        int a[n];

        for(int i = 0; i < n; i++)
        	cin >> a[i];

      

	    Solution ob;
	    cout << ob.maxSumIS(a, n) << "\n";
	     
    }
    return 0;
}


// } Driver Code Ends
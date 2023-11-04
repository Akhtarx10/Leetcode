//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
public:
    bool is_Possible(vector<vector<int>>& grid) {
        int n = grid.size();
        if (n == 0) {
            return false;
        }

        vector<vector<bool>> visited(n, vector<bool>(n, false));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j, visited);
                }
            }
        }
        return false;
    }

    bool dfs(vector<vector<int>>& grid, int i, int j, vector<vector<bool>>& visited) {
        if (i < 0 || i >= grid.size() || j < 0 || j >= grid[0].size() || grid[i][j] == 0 || visited[i][j]) {
            return false;
        }

        if (grid[i][j] == 2) {
            return true;
        }

        visited[i][j] = true;

        bool up = dfs(grid, i - 1, j, visited);
        bool down = dfs(grid, i + 1, j, visited);
        bool left = dfs(grid, i, j - 1, visited);
        bool right = dfs(grid, i, j + 1, visited);

        return up || down || left || right;
    }
};









//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		vector<vector<int>>grid(n, vector<int>(n, -1));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				cin >> grid[i][j];
			}
		}
		Solution obj;
		bool ans = obj.is_Possible(grid);
		cout << ((ans) ? "1\n" : "0\n");
	}
	return 0;
}
// } Driver Code Ends
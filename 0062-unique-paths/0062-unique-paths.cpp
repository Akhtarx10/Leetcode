class Solution {
public:
    int uniquePaths(int m, int n) {
       long num=1;
        for(int i=1;i<m;i++){
            num= num*(n-1+i)/i;
        }
        return (int)num;
    }
    
};
// this is memoization

class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        int n = triangle.size();
        vector<vector<int>> dp(n, vector<int>(n, -1e9));
        return findPath(0, 0, triangle, dp, n);
    }

    int findPath(int i, int j, vector<vector<int>> &arr, vector<vector<int>> &dp, int size){
        if (i == size-1) return arr[i][j];
        if (dp[i][j] != -1e9) return dp[i][j];
        int down = arr[i][j] + findPath(i+1, j, arr, dp, size);
        int diagonal = arr[i][j] + findPath(i+1, j+1, arr, dp, size);
        return dp[i][j] = min(down, diagonal);
    }
};
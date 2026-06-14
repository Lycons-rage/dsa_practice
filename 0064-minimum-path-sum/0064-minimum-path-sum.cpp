// this is memoization
class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
        int row = grid.size();
        int col = grid[0].size();
        vector<vector<int>> dp(row, (vector<int>(col, -1)));
        return findPath(row-1, col-1, grid, dp);
    }

    int findPath(int i, int j, vector<vector<int>> &arr, vector<vector<int>> &dp){
        // base cases
        if (i == 0 && j == 0) return arr[i][j];
        if (i < 0) return INT_MAX - arr[i+1][j];
        if (j < 0) return INT_MAX - arr[i][j+1];

        // DP Check
        if (dp[i][j] != -1) return dp[i][j];
        int up = arr[i][j] + findPath(i-1, j, arr, dp);
        int left = arr[i][j] + findPath(i, j-1, arr, dp);
        return dp[i][j] = min(up, left);
    }
};
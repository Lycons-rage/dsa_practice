// this is memoization
class Solution {
public:
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        int row = obstacleGrid.size();
        int col = obstacleGrid[0].size();
        vector<vector<int>> dp(row+1, vector<int>(col+1, -1));
        return findPath(row-1, col-1, obstacleGrid, dp);
    }

    int findPath(int i, int j, vector<vector<int>>& arr, vector<vector<int>> &dp){
        if (i >= 0 && j >= 0 && arr[i][j] == 1) return 0;
        if (i == 0 && j == 0) return 1;
        if (i < 0 || j < 0) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int up = findPath(i-1, j, arr, dp);
        int left = findPath(i, j-1, arr, dp);

        return dp[i][j] = up + left;
    }
};
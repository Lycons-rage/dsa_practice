// this is memoization
// class Solution {
// public:
//     int minPathSum(vector<vector<int>>& grid) {
//         int row = grid.size();
//         int col = grid[0].size();
//         vector<vector<int>> dp(row, (vector<int>(col, -1)));
//         return findPath(row-1, col-1, grid, dp);
//     }

//     int findPath(int i, int j, vector<vector<int>> &arr, vector<vector<int>> &dp){
//         // base cases
//         if (i == 0 && j == 0) return arr[i][j];
//         if (i < 0) return INT_MAX - arr[i+1][j];
//         if (j < 0) return INT_MAX - arr[i][j+1];

//         // DP Check
//         if (dp[i][j] != -1) return dp[i][j];
//         int up = arr[i][j] + findPath(i-1, j, arr, dp);
//         int left = arr[i][j] + findPath(i, j-1, arr, dp);
//         return dp[i][j] = min(up, left);
//     }
// };

// this is tabulation
// class Solution {
// public:
//     int minPathSum(vector<vector<int>>& grid) {
//         int row = grid.size();
//         int col = grid[0].size();
//         vector<vector<int>> dp(row, vector<int>(col, -1));

//         dp[0][0] = grid[0][0];
//         for (int i = 0; i < row; i++){
//             for (int j = 0; j < col; j++){
//                 int up = INT_MAX, left = INT_MAX;
//                 if (i > 0) up = grid[i][j] + dp[i-1][j];
//                 if (j > 0) left = grid[i][j] + dp[i][j-1];
//                 if (i > 0 || j > 0) dp[i][j] = min(up, left);
//             }
//         }
//         return dp[row-1][col-1];
//     }
// };

// this is space optimization
class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
        int row = grid.size();
        int col = grid[0].size();
        vector<int> prev(col, 0);

        for (int i = 0; i < row; i++){
            vector<int> curr(col, 0);
            for (int j = 0; j < col; j++){
                if (i==0 && j==0) curr[j] = grid[i][j];
                else{
                    int up = grid[i][j];
                    if (i > 0) up += prev[j];
                    else up += 1e9;

                    int left = grid[i][j];
                    if (j > 0) left += curr[j-1];
                    else left += 1e9;

                    curr[j] = min(up, left);
                }
            }
            prev = curr;
        }
        return prev[col-1];
    }
};
// this is memoization top - down approach 

// class Solution {
// public:
//     int minFallingPathSum(vector<vector<int>>& matrix) {
//         int n = matrix.size();
//         vector<int> low(n, -1);
//         vector<vector<int>> dp(n, vector<int>(n, 1e9));
//         for (int i = 0; i < n; i++){
//             low[i] = findPath(n-1, i, n, matrix, dp);
//         }

//         auto min_path = min_element(low.begin(), low.end());
//         return *min_path;
//     }

//     int findPath(int i, int j, int size, vector<vector<int>>& arr, vector<vector<int>>& dp){
//         if (j < 0 || j > size-1) return 1e9;
//         if (i == 0) return arr[i][j];
//         if (dp[i][j] != 1e9) return dp[i][j];
//         int up = arr[i][j] + findPath(i-1, j, size, arr, dp);
//         int left = arr[i][j] + findPath(i-1, j-1, size, arr, dp);
//         int right = arr[i][j] + findPath(i-1, j+1, size, arr, dp);

//         return dp[i][j] = min({up, left, right});
//     }
// };

// this is tabulation bottom - up approach

// class Solution {
// public:
//     int minFallingPathSum(vector<vector<int>>& matrix) {
//         int n = matrix.size();
//         vector<vector<int>> dp(n, vector<int>(n, 1e9));
//         for (int i = 0; i < n; i++){
//             dp[0][i] = matrix[0][i];
//         }

//         for (int i = 1; i < n; i++){
//             for (int j = 0; j < n; j++){
//                 int up = matrix[i][j] + dp[i-1][j];
//                 int left = 0;
//                 if (j > 0){
//                     left = matrix[i][j] + dp[i-1][j-1];
//                 } else {
//                     left = 1e9;
//                 }
//                 int right = 0;
//                 if (j < n-1){
//                     right = matrix[i][j] + dp[i-1][j+1];
//                 } else {
//                     right = 1e9;
//                 }
//                 dp[i][j] = min({up, left, right});
//             }
//         }

//         auto min_path = min_element(dp[n-1].begin(), dp[n-1].end());
//         return *min_path;
//     }
// };

// this is space optimization

class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int n = matrix.size();
        vector<int> prev(n, 1e9);
        for (int i = 0; i < n; i++){
            prev[i] = matrix[0][i];
        }

        for (int i = 1; i < n; i++){
            vector<int> current(n, 1e9);
            for (int j = 0; j < n; j++){
                int up = matrix[i][j] + prev[j];
                int left = 0;
                if (j > 0){
                    left = matrix[i][j] + prev[j-1];
                } else {
                    left = 1e9;
                }
                int right = 0;
                if (j < n-1){
                    right = matrix[i][j] + prev[j+1];
                } else {
                    right = 1e9;
                }
                current[j] = min({up, left, right});
            }
            prev = current;
        }

        auto min_path = min_element(prev.begin(), prev.end());
        return *min_path;
    }
};
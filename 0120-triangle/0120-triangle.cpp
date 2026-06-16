// this is memoization

// class Solution {
// public:
//     int minimumTotal(vector<vector<int>>& triangle) {
//         int n = triangle.size();
//         vector<vector<int>> dp(n, vector<int>(n, -1e9));
//         return findPath(0, 0, triangle, dp, n);
//     }
//     int findPath(int i, int j, vector<vector<int>> &arr, vector<vector<int>> &dp, int size){
//         if (i == size-1) return arr[i][j];
//         if (dp[i][j] != -1e9) return dp[i][j];
//         int down = arr[i][j] + findPath(i+1, j, arr, dp, size);
//         int diagonal = arr[i][j] + findPath(i+1, j+1, arr, dp, size);
//         return dp[i][j] = min(down, diagonal);
//     }
// };

// this is tabulation

// class Solution {
// public:
//     int minimumTotal(vector<vector<int>>& triangle) {
//         int n = triangle.size();
//         vector<vector<int>> dp(n, vector<int>(n, -1e9));

//         for (int j = 0; j < n; j++){
//             dp[n-1][j] = triangle[n-1][j];
//         }

//         for (int i = n-2; i >= 0; i--){
//             for (int j = i; j >= 0; j--){
//                 int down = triangle[i][j] + dp[i+1][j];
//                 int diagonal = triangle[i][j] + dp[i+1][j+1];
//                 dp[i][j] = min(down, diagonal);
//             }
//         }
//         return dp[0][0];
//     }
// };

// this is space optimization

class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        int n = triangle.size();
        vector<int> prev(n, -1e9);

        for (int j = 0; j < n; j++){
            prev[j] = triangle[n-1][j];   // this sorts the base case
        }

        for (int i = n-2; i >= 0; i--){
            vector<int> current(i+1, -1e9);
            for (int j = i; j >= 0; j--){
                int down = triangle[i][j] + prev[j];
                int diagonal = triangle[i][j] + prev[j+1];
                current[j] = min(down, diagonal);
            }
            prev = current;
        }
        return prev[0];
    }
};
// this is memoization

class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int n = matrix.size();
        vector<int> low(n, -1);
        vector<vector<int>> dp(n, vector<int>(n, 1e9));
        for (int i = 0; i < n; i++){
            low[i] = findPath(n-1, i, n, matrix, dp);
        }

        auto min_path = min_element(low.begin(), low.end());
        return *min_path;
    }

    int findPath(int i, int j, int size, vector<vector<int>>& arr, vector<vector<int>>& dp){
        if (j < 0 || j > size-1) return 1e9;
        if (i == 0) return arr[i][j];
        if (dp[i][j] != 1e9) return dp[i][j];
        int up = arr[i][j] + findPath(i-1, j, size, arr, dp);
        int left = arr[i][j] + findPath(i-1, j-1, size, arr, dp);
        int right = arr[i][j] + findPath(i-1, j+1, size, arr, dp);

        return dp[i][j] = min({up, left, right});
    }
};
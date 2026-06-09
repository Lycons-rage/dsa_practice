// this is memoization

class Solution {
public:
    int climbStairs(int n) {
        vector<int> dp(n+1, -1);
        return climbing(n, dp);
    }

    int climbing(int n, vector<int> &dp){
        if (n <= 1) return 1;
        if (dp[n] != -1) return dp[n];
        return dp[n] = climbing(n-1, dp) + climbing(n-2, dp);
    }
};
// this is memoization top - down

// class Solution {
// public:
//     int climbStairs(int n) {
//         vector<int> dp(n+1, -1);
//         return climbing(n, dp);
//     }

//     int climbing(int n, vector<int> &dp){
//         if (n <= 1) return 1;
//         if (dp[n] != -1) return dp[n];
//         return dp[n] = climbing(n-1, dp) + climbing(n-2, dp);
//     }
// };


// this is tabulation bottom - up

// class Solution {
// public:
//     int climbStairs(int n) {
//         vector<int> dp(n+1);

//         dp[0] = dp[1] = 1;
//         for (int i = 2; i <= n; i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }

//         return dp[n];
//     }
// };


// this is space optimization

class Solution {
public:
    int climbStairs(int n) {
        int pre = 1, pre2 = 1;
        int current = 1;
        for (int i = 2; i <= n; i++){
            current = pre + pre2;
            pre2 = pre;
            pre = current;
        }

        return current;
    }
};
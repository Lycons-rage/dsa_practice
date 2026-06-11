// this is memoization top - down approach

// class Solution {
// public:
//     int rob(vector<int>& nums) {
//         int size = nums.size();
//         vector<int> dp(size+1, -1);
//         return memoization(nums, size-1, dp);
//     }

//     int memoization(vector<int> &nums, int index, vector<int> &dp){
//         if (index == 0) return nums[index];
//         if (index < 0) return 0;

//         if (dp[index] != -1) return dp[index];
//         int pick = nums[index] + memoization(nums, index-2, dp);
//         int notPick = 0 + memoization(nums, index-1, dp);

//         return dp[index] = max(pick, notPick);
//     }
// };

// this is tabulation bottom - up approach

// class Solution {
// public:
//     int rob(vector<int>& nums) {
//         int size = nums.size();
//         vector<int> dp(size+1, -1);
        
//         dp[0] = nums[0];
        
//         for (int i = 1; i < size; i++){
//             int take = nums[i];
//             if (i > 1) take += dp[i-2];
//             int notTake = dp[i-1];

//             dp[i] = max(take, notTake);
//         }
//         return dp[size-1];
//     }
// };

// this is space optimization

class Solution {
public:
    int rob(vector<int>& nums) {
        int size = nums.size();
        int prev = nums[0], prev2 = 0;
        
        for (int i = 1; i < size; i++){
            int take = nums[i];
            if (i > 1) take += prev2;
            int notTake = prev;

            int current = max(take, notTake);
            prev2 = prev;
            prev = current;
        }
        return prev;
    }
};
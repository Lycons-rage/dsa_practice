// this is memoization top - down approach

class Solution {
public:
    int rob(vector<int>& nums) {
        int size = nums.size();
        vector<int> dp(size+1, -1);
        return memoization(nums, size-1, dp);
    }

    int memoization(vector<int> &nums, int index, vector<int> &dp){
        if (index == 0) return nums[index];
        if (index < 0) return 0;

        if (dp[index] != -1) return dp[index];
        int pick = nums[index] + memoization(nums, index-2, dp);
        int notPick = 0 + memoization(nums, index-1, dp);

        return dp[index] = max(pick, notPick);
    }
};
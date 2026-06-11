class Solution {
public:
    int rob(vector<int>& nums) {
        int size = nums.size();
        int prev = nums[0], prev2 = 0;
        if (size == 1) return prev;

        for (int i = 1; i < size-1; i++){
            int take = nums[i];
            if (i > 1) take += prev2;
            int notTake = prev;

            int current = max(take, notTake);
            prev2 = prev;
            prev = current;
        }
        int ans1 = prev;

        prev = nums[1], prev2 = 0;
        for (int i = 2; i < size; i++){
            int take = nums[i];
            if (i > 2) take += prev2;
            int notTake = prev;

            int current = max(take, notTake);
            prev2 = prev;
            prev = current;
        }

        int ans2 = prev;
        return max(ans1, ans2);
    }
};
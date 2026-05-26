class Solution {
public:
    bool canJump(vector<int>& nums) {
        int maxIdxReach = 0;
        for (int i = 0; i < nums.size(); i++){
            if (i > maxIdxReach){
                return false;
            }
            maxIdxReach = max(maxIdxReach, i+nums[i]);
        }

        return true;
    }
};
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        sort(intervals.begin(), intervals.end());

        int current_small = intervals[0][0], current_large = intervals[0][1];
        for (int i = 1; i < intervals.size(); i++){
            if (intervals[i][0] <= current_large){
                if (intervals[i][1] > current_large){
                    current_large = intervals[i][1];
                }
            }
            else{
                ans.push_back({current_small, current_large});
                current_small = intervals[i][0];
                current_large = intervals[i][1];
            }
        }

        ans.push_back({current_small, current_large});
        return ans;
    }
};
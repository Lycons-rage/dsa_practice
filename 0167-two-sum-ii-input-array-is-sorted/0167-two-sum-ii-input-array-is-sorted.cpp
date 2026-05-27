class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int begin=0, end=numbers.size()-1;
        vector<int> ans;

        while (begin < end) {
            if (numbers[begin] + numbers[end] > target){
                end -= 1;
            }
            else if (numbers[begin] + numbers[end] < target){
                begin += 1;
            }
            else{
                ans.push_back(begin+1);
                ans.push_back(end+1);
                break;
            }
        }

        return ans;
    }
};
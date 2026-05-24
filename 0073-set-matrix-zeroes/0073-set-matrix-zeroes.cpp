class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        set<int> rowSet;
        set<int> colSet;

        // finding 0 and storing the position
        for (int row = 0; row < matrix.size(); row++){
            for (int col = 0; col < matrix[row].size(); col++){
                if (matrix[row][col] == 0){
                    rowSet.insert(row);
                    colSet.insert(col);
                }
            }
        }    

        for (int row = 0; row < matrix.size(); row++){
            for (int col = 0; col < matrix[row].size(); col++){
                if (rowSet.count(row)){
                    matrix[row][col] = 0;
                }
                else if (colSet.count(col)){
                    matrix[row][col] = 0;
                }
            }
        }
    }
};
class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        // the observation : each column in input becomes each row in output but reversed
        // the approach : transpose the matrix first, then reverse every row 

        // transpose : all the diagonals remain same, i.e., where row==column, do nothing
        for (int i=0; i<matrix.size(); i++){
            for (int j=i+1; j<matrix[i].size(); j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;                
            }
        }

        // reverse every row
        for (int i=0; i<matrix.size(); i++){
            for (int j=0; j<matrix[i].size()/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].size()-j-1];
                matrix[i][matrix[i].size()-j-1] = temp; 
            }
        }
    }
};
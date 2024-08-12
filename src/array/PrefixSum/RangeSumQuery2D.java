package array.PrefixSum;

class NumMatrix {
    int[][] nums;
    public NumMatrix(int[][] matrix) {
        this.nums = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2 ; j++) {
                sum = sum + nums[i][j];
            }
        }
        return sum;
    }
}

public class RangeSumQuery2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {3,0,1,4,2},
                {5,6,3,2,1},
                {1,2,0,1,5},
                {4,1,0,1,7},
                {1,0,3,0,5}
        };
        NumMatrix obj = new NumMatrix(matrix);
        int param_1 = obj.sumRegion(1,2,2,4);

        System.out.println(param_1);
    }
}

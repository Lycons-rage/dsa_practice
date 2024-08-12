package OTPractice;

import java.util.ArrayList;
import java.util.List;

public class MaxKxKSubmatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 2, 4},
                {5, 6, 1, 2},
                {9, 8, 7, 3},
                {4, 5, 2, 1}
        };
        int K = 2;
        int M = 5;

        List<Integer> P = findMaxElementsInSubmatrices(matrix, K);
        System.out.println("Array P: " + P);

        int count = countElementsGreaterOrEqual(P, M);
        int minValue = findMinValueGreaterOrEqual(P, M);
        int maxValue = findMaxValueGreaterOrEqual(P, M);

        System.out.println("Number of elements greater than or equal to M: " + count);
        System.out.println("Minimum value greater than or equal to M: " + minValue);
        System.out.println("Maximum value greater than or equal to M: " + maxValue);
    }

    private static List<Integer> findMaxElementsInSubmatrices(int[][] matrix, int K) {
        int N = matrix.length;
        List<Integer> maxElements = new ArrayList<>();

        int[][] dp = new int[N][N];

        // Fill dp table where dp[i][j] represents the max value of KxK submatrix with bottom-right corner at (i, j)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = matrix[i][j];

                if (i > 0) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                if (j > 0) dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                if (i > 0 && j > 0) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1]);

                if (i >= K - 1 && j >= K - 1) {
                    int maxVal = dp[i][j];
                    if (i > K - 1) maxVal = Math.max(maxVal, dp[i - K][j]);
                    if (j > K - 1) maxVal = Math.max(maxVal, dp[i][j - K]);
                    if (i > K - 1 && j > K - 1) maxVal = Math.max(maxVal, dp[i - K][j - K]);

                    maxElements.add(maxVal);
                }
            }
        }

        return maxElements;
    }

    private static int countElementsGreaterOrEqual(List<Integer> P, int M) {
        int count = 0;
        for (int value : P) {
            if (value >= M) {
                count++;
            }
        }
        return count;
    }

    private static int findMinValueGreaterOrEqual(List<Integer> P, int M) {
        int minValue = Integer.MAX_VALUE;
        for (int value : P) {
            if (value >= M) {
                minValue = Math.min(minValue, value);
            }
        }
        return minValue;
    }

    private static int findMaxValueGreaterOrEqual(List<Integer> P, int M) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : P) {
            if (value >= M) {
                maxValue = Math.max(maxValue, value);
            }
        }
        return maxValue;
    }
}
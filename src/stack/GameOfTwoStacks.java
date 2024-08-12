package stack;

import java.util.Arrays;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        System.out.println(twoStacks(new int[]{4,2,4,6,1}, new int[]{2,1,8,5}, 10));
    }

    private static int twoStacks(int[] a, int[] b, int maxSum) {
        int sumSoFar = 0;
        int maxCount = 0;
        return recursiveTwoStacks(a,b,maxSum, sumSoFar, maxCount)-1;
    }

    private static int recursiveTwoStacks(int[] a, int[] b, int maxSum, int sumSoFar, int maxCount) {
        if(sumSoFar > maxSum){
            return maxCount;
        }
        if(a.length == 0 || b.length == 0){
            return maxCount;
        }

        int ans_left = recursiveTwoStacks(Arrays.copyOfRange(a, 1, a.length), b, maxSum, sumSoFar+a[0], maxCount+1);
        int ans_right = recursiveTwoStacks(a, Arrays.copyOfRange(b, 1, b.length), maxSum, sumSoFar+b[0], maxCount+1);

        return Math.max(ans_left, ans_right);
    }
}

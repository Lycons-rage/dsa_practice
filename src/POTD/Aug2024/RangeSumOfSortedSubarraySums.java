package POTD.Aug2024;

import java.util.ArrayList;

public class RangeSumOfSortedSubarraySums {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(rangeSum(nums, 4, 1, 5));
    }

    private static int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            list.add(sum);
            for (int j = i+1; j < nums.length; j++) {

            }
        }

        return sum;
    }
}

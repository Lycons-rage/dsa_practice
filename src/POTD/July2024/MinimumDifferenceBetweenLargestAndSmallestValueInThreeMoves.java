package POTD.July2024;

import java.util.Arrays;

public class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {
    public static void main(String[] args) {
        int[] nums = {6,6,0,1,1,4,6};

        System.out.println(minDifference(nums));
    }

    private static int minDifference(int[] nums) {
        if(nums.length <= 3){
            return 0;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = nums.length-1; i > nums.length-4; i--) {
            nums[i] = nums[0];
        }

        Arrays.sort(nums);
        return nums[nums.length-1] - nums[0];
    }
}

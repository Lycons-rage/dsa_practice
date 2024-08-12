package contest.Weekly408;

import java.util.Arrays;

public class FindIfDigitGameCanBeWon {
    public static void main(String[] args) {
        int[] nums = {3,1};

        System.out.println(canAliceWin(nums));
    }

    private static boolean canAliceWin(int[] nums) {
        if(nums.length<=1){
            return true;
        }
        int single_digit_sum=0, double_digit_sum=0;

        Arrays.sort(nums);

        for (int i = 0; i<nums.length && nums[i]/10==0 ; i++) {
            single_digit_sum = single_digit_sum + nums[i];
        }
        for (int i = nums.length-1; i>=0 && nums[i]/10!=0 ; i--) {
            double_digit_sum = double_digit_sum + nums[i];
        }

        if(double_digit_sum == single_digit_sum){
            return false;
        }

        return true;
    }
}

package BitManipulation;

import java.util.Arrays;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = {2,4,2,14,3,7,7,3};

        System.out.println(Arrays.toString(findUniques(nums)));
    }

    private static int[] findUniques(int[] nums) {
        long XORR = 0;

        for (int num : nums) {XORR = XORR ^num;}
        long rightmost = XORR & (XORR -1) ^ XORR;
        int b1 = 0, b2 = 0;

        for (int num : nums){
            if((num & rightmost) != 0){
                b1 = b1 ^ num;
            } else {
                b2 = b2 ^ num;
            }
        }

        return new int[]{b1, b2};
    }
}

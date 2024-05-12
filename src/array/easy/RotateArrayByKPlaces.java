package array.easy;

import java.util.Arrays;

public class RotateArrayByKPlaces {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotated(nums, k);
    }

    static void rotated(int[] nums, int x) {
        int[] b = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            b[i] = nums[ (i+x)%nums.length ];
        }
        nums = b;
        System.out.println(Arrays.toString(nums));
    }
}

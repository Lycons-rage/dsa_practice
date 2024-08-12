package POTD.Aug2024;

import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3};
        int[] target = {1,2,3,4};

        System.out.println(canBeEqual(arr, target));
    }

    private static boolean canBeEqual(int[] arr, int[] target) {
        Arrays.sort(target);
        Arrays.sort(arr);

        return Arrays.equals(arr, target);
    }
}

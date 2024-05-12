package array.easy;

import java.util.Arrays;

public class RotateArrayLeftOrRight {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int k = 1;
        String way = "right";
        System.out.println("Original Array : "+Arrays.toString(nums));
        rotateArray(nums, k, way);
    }

    static void rotateArray(int[] nums, int k, String way) {
        if (way.equals("right")){
            reverse(nums, 0, k);
            reverse(nums, 0, nums.length);
            reverse(nums, 0, nums.length-k);

            System.out.println("Right Rotated by "+k+" places : "+Arrays.toString(nums));
        }
        else{
            k = nums.length-k;
            reverse(nums, 0, k);
            reverse(nums, 0, nums.length);
            reverse(nums, 0, nums.length-k);

            System.out.println("Left Rotated by "+k+" places : "+Arrays.toString(nums));
        }
    }

    static void reverse(int[] nums, int i, int j) {
        for (int k = i; k < j/2; k++) {
            int temp = nums[k];
            nums[k] = nums[j-k-1];
            nums[j-k-1] = temp;
        }
    }
}

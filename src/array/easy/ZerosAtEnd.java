package array.easy;

import java.util.Arrays;

public class ZerosAtEnd {
    public static void main(String[] args) {
        int[] nums = {1,0,1};
        System.out.println(Arrays.toString(nums));
        zerosAtEnd(nums);
    }

    static void zerosAtEnd(int[] nums) {
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[step] == 0){
                reverse(nums, step, 1);
                reverse(nums, step, nums.length);
                reverse(nums, step, nums.length-1);
            }
            else{
                step++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] nums, int i, int j) {
        for (int k = i; k < j; k++) {
            int temp = nums[k];
            nums[k] = nums[j-k-1];
            nums[j-k-1] = temp;

            if(k==j/2){
                break;
            }
        }
    }
}

package array.TwoPointer;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        System.out.println(Arrays.toString(sort(nums)));
    }

    private static int[] sort(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        int left = 0;
        int right = left+1;
        int end = nums.length-1;

        while(left<end){
            if(right > end){
                left++;
                if(left == end){
                    break;
                }
                right = left+1;
            }
            if (nums[left] > nums[right]) {
                //in-place swap left and right
                swap(nums, left, right);
            }
            if (nums[left] > nums[end]) {
                //in-place swap left and end
                swap(nums, left, end);
            }
            right++;
        }

        return nums;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

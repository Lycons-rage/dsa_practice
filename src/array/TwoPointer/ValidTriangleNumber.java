package array.TwoPointer;

import java.util.Arrays;

public class ValidTriangleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,3,4};

        System.out.println(triangleNumber(nums));
    }

    private static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int first = 0;
        int second = first+1;
        int count = 0;
        while(first!=nums.length-2){
            int sum = nums[first] + nums[second];
            for (int i = second+1; i<nums.length && nums[i] < sum; i++) {
                count++;
            }
            second++;
            if(second == nums.length-1){
                first++;
                second = first+1;
            }
        }
        return count;
    }
}

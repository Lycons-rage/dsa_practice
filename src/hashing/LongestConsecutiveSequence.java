package hashing;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {1,2,0,1};

        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        if(nums.length < 1){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int current = 1;
        for (int i = nums.length-1; i > 0 ; i--) {
            if(nums[i] == nums[i-1]+1){
                current++;
            } else if(nums[i] == nums[i-1]) {
                continue;
            } else {
                count = Math.max(current, count);
                current = 1;
            }
        }
        count = Math.max(current, count);
        return count;
    }
}
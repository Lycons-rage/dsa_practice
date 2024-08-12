package BitManipulation;

import java.util.Arrays;

public class SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {4,5,2,4,5,4,5};

        System.out.println("Using Bitwise operator : "+bitwiseUnique(nums));
        System.out.println("Using sorting and grouping : "+sortingGroupingUnique(nums));
        System.out.println("Using buckets approach : "+bucketsUnique(nums));
    }

    private static int bucketsUnique(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums){
            ones = (ones^num) & (~twos);
            twos = (twos^num) & (~ones);
        }

        return ones;
    }

    private static int sortingGroupingUnique(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i+=3) {
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }

    private static int bitwiseUnique(int[] nums) {
        int ans = 0;
        for (int bitindex = 0; bitindex < 32; bitindex++) {
            int count = 0;
            for (int num : nums) {
                if ((num & (1 << bitindex)) == 1) {
                    count++;
                }
            }
            if(count % 3 == 1){
                ans = ans | (1 << bitindex);
            }
        }

        return ans;
    }
}

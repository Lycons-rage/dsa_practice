package BinarySearch;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(findKthPositive(nums, 2));
    }

    private static int findKthPositive(int[] nums, int k) {
        int low = 1, high = nums[nums.length-1]+k;

        return 0;
    }
}

package SlidingWindow;

/**
 * You are given an integer array nums and an integer k.
 * Return the number of nice subarrays from nums.
 * A subarray can be considered nice if it has exactly k odd numbers in it.
 */

public class NiceSubarray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};

        System.out.println(getSubarray(nums, 3));
    }

    private static int getSubarray(int[] nums, int k) {
        return getCount(nums, k)-getCount(nums, k-1);
    }

    private static int getCount(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        int l=0, r=0, sum=0, count=0;
        while(r<nums.length){
            sum = sum + (nums[r]%2);
            while(sum>k){
                sum = sum - (nums[l]%2);
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
}
